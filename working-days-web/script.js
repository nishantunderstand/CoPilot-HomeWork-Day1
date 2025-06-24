document.getElementById('workingDaysForm').addEventListener('submit', function (e) {
    e.preventDefault();
    const start = document.getElementById('startDate').value;
    const end = document.getElementById('endDate').value;
    const resultDiv = document.getElementById('result');

    if (!start || !end) {
        resultDiv.textContent = 'Please select both dates.';
        return;
    }

    const startDate = new Date(start);
    const endDate = new Date(end);
    if (endDate < startDate) {
        resultDiv.textContent = 'End date must be after start date.';
        return;
    }

    let count = 0;
    let current = new Date(startDate);
    while (current <= endDate) {
        const day = current.getDay();
        if (day !== 0 && day !== 6) count++; // 0 = Sunday, 6 = Saturday
        current.setDate(current.getDate() + 1);
    }
    resultDiv.textContent = `Number of working days: ${count}`;
});
