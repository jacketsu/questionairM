# QuestionnaireM

This questionnair provides trivia, polling, checkbox and matric questions

### Get Started

```
$ mvn spring-boot:run
```
### APIs
All entities are implemented of CRUD operations

Specific APIs

```
localhost/questions/users/{userID}            //All questions user does not answer yet
	
localhost/answers/users/{userID}	      //All answers of user
	
localhost/answers/users/{userID}/{qustionID}  //user's answer for certain question
```


## Requirements

1. Please create the data structures to store these different kinds of questions that can be served to the widget.  

	**There are seven schemas, four types of questins, users, questions set and answers set**
2. Assume each visitor has an UUID. To make them more engaging, we don't want to show the same question again after they answer it, please create an API for this web service call. Please elaborate how to make this request scalable when there are millions of questions and millision of visitors.

	**Each user has their own questions set(wait to be answered) and answer set, once user answer one question, this question will be removed from his own question set. And this avoid letting users answer the duplicate questions**

	**If there are millions of questions and millions of visitors, it would be a read-heavy and write-heavy system. Maybe it could optimize read operation with Memcached or Redis, and optimize write operation with adding more machines, vertical / horizontal sharding, like Consistent Hashing**

