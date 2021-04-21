# Jmix Add-on Template

The add-on includes a sample entity, its UI screens and integration tests. 

- Publish to local maven:
    
    ```
    ./gradelw publishToMavenLocal
    ```
  
- Use in an application:

    ```
    implementation 'com.company.addon:addon-starter:0.0.1-SNAPSHOT'
    ```

- For a real-world usage, replace `Addon` and `addon` with your prefix everywhere in file names and source code.