printjson(db.people.insertOne({
    sex: "Male",
    first_name: "Darek",
    last_name: "Samsel",
    job: "Java Developer",
    email: "s13886@pjwstk.edu.pl",
    location: {
        city: "Warsaw",
        address: {
            streetname: "Falata",
            streetnumber: "2"
        }
    },
    description: "Excercise 6 of NBD",
    height: "180",
    weight: "70",
    birth_date: "1995-04-22T00:00:00Z",
    nationality: "Poland",
    credit: [{
        type: "asd",
        number: "123981203",
        currency: "PLN",
        balance: "324234"
    }]
}))