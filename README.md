# CarRatingSystem
This is an API to rate car based. A score of 1 is added if any one of the following criteria is met
* 2 or more airbags available
* Auto Transmission is available
* Mileage is equal to or more than 15km/l

## Request
```json
{
    "airbags" : 2,
    "autoTransmission" : true,
    "mileage" : 20
}
```

## Response
```json
{
    "score": 3,
    "rating": "High"
}
```