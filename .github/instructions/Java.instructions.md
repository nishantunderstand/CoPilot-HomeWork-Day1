---
applyTo: '**/*.java'
---
# Java Code Style Guide
1. **File Naming**: Use CamelCase for class names, e.g., `RemoveVowelFromString.java`.
2. **Method Naming**: Use camelCase for method names, e.g., `remove
VowelFromString`.
3. **Commenting**: Use single-line comments (`//`) for brief explanations and multi-line comments (`/* ... */`) for detailed descriptions.
4. **Indentation**: Use 4 spaces for indentation, no tabs.


5. **Braces**: Use braces `{}` for all control structures, even if they contain a single statement.
6. **Line Length**: Keep lines under 80 characters for better <readability class=""></readability>



7. **Whitespace**: Use a single space after keywords and around operators.
8. **Imports**: Organize imports alphabetically and remove unused <imports class=""></imports>

9. **Error Handling**: Use exceptions for error handling, and provide meaningful messages.
10. **Validation**: Validate inputs and handle edge cases gracefully.

11. **Separation of Concerns**: Keep the main method focused on high-level logic, delegating specific tasks to helper methods.
12. **Testing**: Write unit tests for all methods, covering both happy and unhappy paths.
13. **Documentation**: Use Javadoc comments for public methods and classes to describe their purpose and usage.
14. **Version Control**: Use meaningful commit messages that describe the changes made.
15. **Code Reviews**: Regularly review code with peers to ensure adherence to the style guide and improve code quality.
16. **Consistent Naming**: Use consistent naming conventions for variables, methods, and classes throughout the codebase.
17. **Avoid Magic Numbers**: Use named constants instead of hard-coded values to improve readability and maintainability.
18. **Use of Libraries**: Leverage existing libraries for common tasks (e.g., Apache Commons, Google Guava) to avoid reinventing the wheel.
19. **Performance Considerations**: Be mindful of performance, especially in loops and recursive methods, and optimize where necessary.
20. **Code Clarity**: Write clear and understandable code, avoiding complex constructs that may confuse future maintainers.
21. **Refactoring**: Regularly refactor code to improve structure and readability without changing functionality.
22. **Consistent Formatting**: Use a consistent formatting style across the codebase, including spaces around operators, line breaks, and indentation.
23. **Use of Annotations**: Utilize Java annotations (e.g., `@Override`, `@Deprecated`) to provide additional information about the code's behavior and intent.
24. **Avoid Deep Nesting**: Limit the depth of nested structures to improve readability <and> </and>
25. **Use of Streams**: Prefer using Java Streams for collections processing to enhance readability and reduce boilerplate code.
26. **Avoid Side Effects**: Write pure functions where possible, avoiding side effects that <can></can>lead to unexpected behavior.
27. **Use of Optional**: Use `Optional<T>` for methods that may return null to avoid `NullPointerException` and improve code clarity.
28. **Logging**: Use a logging framework (e.g., SLF4J, Log4j) for logging instead of `System.out.println`, allowing for better control over log levels and outputs.
29. **Dependency Management**: Use a build tool like Maven or Gradle for managing dependencies and project structure, ensuring consistent builds and easy dependency updates.
30. **Code Comments**: Avoid redundant comments; write self-explanatory code that minimizes