''' Tested on Python 3.8.2 '''
import riak

client = riak.RiakClient()
bucket = client.bucket('persons')

def main():
    print("CREATION:")
    insertPerson("Darek", "Samsel")
    person1 = bucket.get('persons')
    print(person1.data)
    print()

    print("EDITING:")
    person1.data['surname'] = 'Samselowy2'
    person1.store()
    modifiedPerson = bucket.get('persons')
    print(modifiedPerson.data)
    print()

    print("REMOVING:")
    modifiedPerson.delete()
    print(modifiedPerson.data)

def insertPerson(name, surname):
    person = bucket.new('persons', data={
        'name': name,
        'surname': surname
    })

    person.store()

if __name__ == "__main__":
    main()