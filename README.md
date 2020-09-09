# Universal ID System

### This is the repository for the Universal identification System

# ⚙ Requirements 
  * ##### [Maven](https://breakdance.github.io/breakdance/) (follow instructions)  
  * ##### [MySQL](https://breakdance.github.io/breakdance/)   `Create a database after installation.` 
    * ##### Edit the `META-INF/persitence.xml` to change the url, host and username and password.    

# 🔧 Schema
*   ### **Voters** + **Polling Sation**  

        CREATE TABLE test_PollingStation (
        PollingStationID int NOT NULL,
        Name varchar(255) NOT NULL,
        PRIMARY KEY (PollingStationID));
        
        CREATE TABLE test_Voters (
        ClientID int NOT NULL,
        CardNumber  varchar(8) NOT NULL,
        IssueDate DATE NOT NULL,
        PollingStation int NOT NULL,
        PRIMARY KEY (ClientID),
        FOREIGN KEY (PollingStation) REFERENCES test_PollingStation(PollingStationID));
        
        INSERT INTO test_PollingStation
        VALUES (1, "Cavendish");
        INSERT INTO test_PollingStation
        VALUES (2, "UNZA");


### 📚 Adding dependencies

* #### Just edit Maven's config file (`pom.xml`) and add whatever plugin you need 
    
        <dependencies>
            <dependency>
                <groupId>org.eclipse.persistence</groupId>
                <artifactId>javax.persistence</artifactId>
                <version>2.2.1</version>
            </dependency>
        </dependencies>
            
