![fulllogo_nobuffer](https://github.com/NIkkiDC/AirJournal-API/assets/97572760/d3877ce1-3cd0-451e-a1d6-4996de9f5821)


# AirJournal-API


<br>

## 🧾 Table Of Contents 
* Project Description 
* Tools & Technoilogies 
* User Stories 
* Endpoint Mappings
* ERD Diagram 
* Hurdles
* Installation Instructions 
* Credits 




## 📇 Project Description

No more expensive travel agents to find your excursions! You don’t have to do any hard planning anymore the trip is planned for you. Here at Air Journal we believe all travelers should kick back and enjoy what the world has to offer! We live in a world where everyone wants everything right away, and accurate. It’s a beautiful thing you’re here at Air Journal where we do just that. All of your excursions in one place planned out for you. Our founder Dominique spent months and months of diligent research to create the perfect trip for herself. She would make sure she had Her excursions planned out in advance. Sometimes you often end up missing out of fun activities because you were not aware of what that city had to offer. All the hard work is done here for you!
<br>

## 🛠️ Tools & Tech 
* JAVA
* GITHUB
* POSTMAN
* SPRINGBOOT
* APPLE NOTES
* INTELLIJ
* ERD Tool
* H2

<br>


## 📝 User Stories 

User should see the NAVBAR from all pages of the site.

Users should be able to view a city.

Users should be able to click to the FAQs page to see answers to a few questions.

On the home page users can browse through 3-4 suggested cities to visit w/ a photo, the name of the country, and city.

User should have access to all activities.

User should see ads on the home page / or travel tips.


<br>

## 🗺️ Endpoint Mappings


| Request Type | URL                   | Functionality                         | Access | 
|--------------|-----------------------|---------------------------------------|--------|
| GET          | /api/activities       | Get all activity                      | Public |
| GET          |/api/activities/1      | Get single activity                   | Public |
| GET          | /api/city             | Get all cities                        | Public |
| GET          | /api/city/1           | Get single city                       | Public |



## 📰 ERD Diagram

<img width="1136" alt="Screenshot 2023-06-08 at 2 15 28 AM" src="https://github.com/NIkkiDC/AirJournal-API/assets/97572760/ca83324e-696e-4d19-bd82-0fbf4a34f2f8">

<br>

## 📚 Installation Instructions 

Copy and paste the code below into your pom.xml file. Once copied right mouse click on your pom.xml file and select Maven and then Reload project. This will install the dependecnies.

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>
		
				<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		
				<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		
				<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
 
 <br>

## H2 

<img width="1520" alt="Screenshot 2023-06-08 at 2 17 16 AM" src="https://github.com/NIkkiDC/AirJournal-API/assets/97572760/cca9f31f-3319-4516-aa1d-f1964e11647a">


<img width="1719" alt="Screenshot 2023-06-08 at 2 17 35 AM" src="https://github.com/NIkkiDC/AirJournal-API/assets/97572760/06852550-581c-40cc-9e8e-20638a8e0c9d">

<br>

## Reflections / Hurdles / Wins 

Time management. Last project I spent my time wisely this time I allowed myself to get overwhelemed in the start of the project. I ended up spending 14-16 hour days on the last 3 days to make sure everything was working properly, and looked well enough to the standard that I hold for myself. I was able to complete everything, on time, to my liking, and I am proud of that. On Wednesday I spent a lot of time because I didn't want to stress myself out the night before it was due. I also wanted to make sure I was failing fast with the help of everyone during the day. Otherwise I would be SOL, If I had waited. I made sure to save simpler task for the last day. I spent the last day just touching up, and going over my speaking points.


I learned a lot about how to properly utilize MVC. I love using it because I feel I am getting better with it each time I use it 



<br>

## 🔖 Credits 

Wanda Avery assisted me every step of the way with this project. She helped me understand connecting my api with the front end. Wanda is also a great cheerleader as well! She was very helpful when making sure I stayed on track.

Rachel Ehrlich assisted me with the beautiful icons I have. Rachel, and Wanda always make me realize that I do have an understanding of what I am doing, and do hold the answer in my head! I just need to be confident, and pratice more.

DeShe Woods helped me fix an error I was having with linking my API to my Angular application.

Dhrubo, Leo, and Suresh for making sure I was doing well with my time.

<br>



<sub>Created by Dominique Collins </sub>

