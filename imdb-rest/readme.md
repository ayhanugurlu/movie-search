db.getCollection('titleakastsv').aggregate([{
    $match:{types :"imdbDisplay"}
    },
    {
      $lookup:
        {
          from: "titleratingstsv",
          localField: "titleId",
          foreignField: "tconst",
          as: "rating"
        }
   }
])

db.getCollection('titleratingstsv').createIndex( { "tconst": 1 } )

db.getCollection('titleakastsv').createIndex( { "types": 1 } )