# Advanced Java Programming (AJP) Lab Experiments

This repository contains the code for Advanced Java Programming lab experiments (Experiments 3-9). These experiments
cover various topics including networking, servlets, and web applications.

## Setting Up Servlet Development Environment in IntelliJ IDEA

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- IntelliJ IDEA (Community or Ultimate edition)
- Apache Tomcat Server (already included in the project root directory)

### Step 1: Use the Included Tomcat

This project already includes Tomcat in the root directory. You can use this installation without downloading Tomcat
separately.

1. The Tomcat server is located in the `tomcat/` directory at the project root
2. This installation is already configured with the necessary libraries

### Step 2: Configure Tomcat in IntelliJ IDEA
1. Open IntelliJ IDEA
2. Go to **File > Settings** (or **IntelliJ IDEA > Preferences** on macOS)
3. Navigate to **Build, Execution, Deployment > Application Servers**
4. Click the **+** button and select **Tomcat Server**
5. Provide the Tomcat home path as the `tomcat` directory in your project root
6. Click **OK** to save the configuration

### Step 3: Servlet Dependencies

The project is already configured with the required Tomcat libraries through the AJP.iml file. The libraries from the
local `tomcat/lib` directory are automatically included.

## Deploying Web Applications
You can deploy your web applications directly to the Tomcat server included in the project:

1. Place your web application files in the `tomcat/webapps/` directory
2. For servlet experiments, create a directory structure like `tomcat/webapps/your-app-name/WEB-INF/`
3. Place your compiled servlet classes in `tomcat/webapps/your-app-name/WEB-INF/classes/`
4. Place your HTML, JSP, and other web resources directly in `tomcat/webapps/your-app-name/`
5. Configure your web.xml file in `tomcat/webapps/your-app-name/WEB-INF/` if needed

## Sample Applications Included
The project contains two sample web applications in the `tomcat/webapps/` directory:

### 1. SimpleServletApp
A basic servlet application demonstrating form handling:
- Located at `tomcat/webapps/SimpleServletApp/`
- Contains a simple HTML form that sends data to a servlet
- Demonstrates handling POST requests in servlets
- Access at `http://localhost:8080/SimpleServletApp/` after starting Tomcat

### 2. EmployeeRegistration
A JSP-based application for employee data entry:
- Located at `tomcat/webapps/EmployeeRegistration/`
- Contains a comprehensive registration form with multiple fields
- Demonstrates JSP form processing without servlets
- Access at `http://localhost:8080/EmployeeRegistration/registerEmployee.jsp` after starting Tomcat

You can use these applications as reference implementations when creating your own web applications.

## Starting and Stopping Tomcat
1. To start Tomcat manually, run the script in `tomcat/bin/startup.sh` (Linux/Mac) or `tomcat/bin/startup.bat` (Windows)
2. To stop Tomcat manually, run the script in `tomcat/bin/shutdown.sh` (Linux/Mac) or `tomcat/bin/shutdown.bat` (
   Windows)
3. Alternatively, use the IntelliJ run configuration to start and stop Tomcat

## Creating Your Own Web Application Using the Sample Apps as Templates
### Using SimpleServletApp as Template
1. Create a new directory in `tomcat/webapps/` for your application (e.g., `MyServletApp`)
2. Copy the directory structure from `SimpleServletApp`: