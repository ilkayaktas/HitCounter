This project is a thread safe implementation of hit counter interview question.

**Question:**
Design a hit counter which counts the number of hits received in the past 5 minutes.

Factory package is responsible to create Hit managers.

Strategy package is responsible to adding hits and retrieving hit counts.

IHitOptimizer, IHitQuery, IHitTicker are created to fit Interface Segregation principles of SOLID.
Overall the project, single responsibility principle is comprised.

Feel free to share your comments.  