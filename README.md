# QR-Code

This is a project I've acomplished with the help of Patrick Pilotti for a school presentation.

## Table of Contents
 
- [Introduction](#introduction)
- [Features](#features)
- [Technologies](#technologies)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Welcome to the QR-Code Project! This project is a databank connected via MySQL server to a Java program. The Java program accepts a GET request to a specific URL and retrieves information about an item from the database. The retrieved information includes the price, location, and category of the item.

## Features

- Retrieve item information based on ID using a GET request
- Return price, description, and category of the item
- Provide a user-friendly interface for interacting with the database

## Technologies

- Java
- MySQL
- Blood and sweat

## Installation

To set up the project LOCALLY, follow these steps:
Note: if you want to set it globally, also do these steps to the end.

1. Clone the repository: `git clone https://github.com/your-username/project-name.git`
2. Reconsider trying to start this massacred monstrosity
3. give up
    ↪ If step 3 malfunctions and you still want to do this, continue with step 4
                                                                               ↩
4. Install IntelliJ (The ONLY right option)
5. Install MySQLWorkbench (also The ONLY right option)
6. Open the first project in IntelliJ using OpenJDK 19 (good luck finding that in 2023)
7. Connect IntelliJ to the database
8. Run
<br>
Step 9:
 <img class="text-center" src="https://media1.giphy.com/media/opDRL3H2A9iLNuvbOv/giphy.gif?cid=ecf05e47jex8jm5a8f6u2zvue2rvv5l54b094tpmu7gb6bov&ep=v1_gifs_search&rid=giphy.gif&ct=g" alt="GIF" width="300">
 
 ### Installation (global 🌐)
 
 do steps 1-9 and THEN:
 <br>
 10. Install Ngrok <br>
 11. Start Ngrok <br>
 12. Copy Given URL Example: `http://cotton-rabbit-crocodile142.ngrok.com` <br>
 13. Attach ID to URL Examlpe: `http://cotton-rabbit-crocodile142.ngrok.com/V1/{ID}` <br>

## Usage

You do not want to use this as this is just a POC
(proof of concept) <br>
Thank you for your understanding 

## API Endpoints

- **GET /V1/{id}** - Retrieve information about an item based on its ID.
  - Example: `localhost:8080/V1/21`
  - Response:
    ```json
    {
      "item": "Iphone Xr",
      "price": "$999",
      "location": "New York",
      "category": "Electronics"
    }
    ```
    
There also is a bit of a homepage if you dare to search for it...

## Contributing

Contributions are... welcome! If you'd like to contribute to this project, please follow these steps:

0. reconsider.
1. Fork the repository
2. Create a new branch: `git checkout -b my-feature`
3. Make your changes and commit them: `git commit -am 'Add some feature'`
4. Push the changes to your branch: `git push origin my-feature`
5. Submit a pull request

## License

you are free to use this monstrosity whenever and wherever you want.
HOWEVER you MUST keep the predefined message in the logs.
![Visitors](https://api.visitorbadge.io/api/visitors?path=https%3A%2F%2Fgithub.com%2Fisaaclins%2FQR-Code&label=VISITORS%3A&labelColor=%230d1117&countColor=%230d1117)
