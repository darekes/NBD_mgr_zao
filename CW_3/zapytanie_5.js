printjson(db.people.find({
    $expr: {
        $gte: [{
            $toDouble: {
                $substr: ["$birth_date", 0, 4]
            }
        }, 2000]
    }
}, {
    first_name: 1,
    last_name: 1,
    "location.city": 1
}).toArray())