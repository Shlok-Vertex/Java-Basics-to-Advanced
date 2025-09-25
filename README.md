## Installing and Setting Up Java 🚀.

### Windows 🪟

1. Download the Java JDK from the [Oracle website](https://www.oracle.com/java/technologies/downloads/). 🌐
2. Run the installer and follow the on-screen instructions. 💾
3. After installation, open Command Prompt and verify the installation: 🖥️
   ```
   java -version
   ```
4. (Optional) Set the `JAVA_HOME` environment variable: ⚙️
   - Open System Properties > Advanced > Environment Variables.
   - Add a new variable `JAVA_HOME` with the path to your JDK installation.
   - Add `%JAVA_HOME%\bin` to the `Path` variable.

### macOS 🍏

1. Install Homebrew if you haven't already:  
   ```
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```
2. Install Java using Homebrew: ☕  
   ```
   brew install openjdk
   ```
3. Add Java to your shell profile (e.g., `.zshrc` or `.bash_profile`): 📝  
   ```
   echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> ~/.zshrc
   source ~/.zshrc
   ```
4. Verify the installation: ✅  
   ```
   java -version
   ```
