import java.text.SimpleDateFormat
class Athlete {
    def firstname, lastname, gender, country, dateOfBirth
    public String toString() { 
        return "Employee: firstName -- $firstname lastName -- $lastname gender -- $gender country -- $country  dateOfBirth -- $dateOfBirth"
    }
}
def asDate(dateStr) {
    new SimpleDateFormat("yyyy-MM-dd").parse(dateStr)
}
def athletes = [    
new Athlete(firstname: 'Paul', lastname: 'Tergat',dateOfBirth: '1969-06-17', gender: 'M', country: 'KEN'), 
new Athlete(firstname: 'Khalid', lastname: 'Khannouchi',dateOfBirth: '1971-12-22', gender: 'M', country: 'USA'), 
new Athlete(firstname: 'Sammy', lastname: 'Korir', dateOfBirth: '1971-12-12', gender: 'M', country: 'KEN'), 
new Athlete(firstname: 'Ronaldo', lastname: 'da Costa',dateOfBirth: '1970-06-07', gender: 'M', country: 'BRA'), 
new Athlete(firstname: 'Paula', lastname: 'Radcliffe',dateOfBirth: '1973-12-17', gender: 'F', country: 'GBR')
]


def byGenderDescThenByCountry = { a, b -> 
    a.gender == b.gender ?
        b.country <=> a.country : b.gender <=> a.gender 
}

def bornSince70 = {asDate(it.dateOfBirth) > asDate('1973-1-1') }

def youngAthletes = athletes.findAll(bornSince70);

def sortedAthletes = athletes.sort(byGenderDescThenByCountry);

println(sortedAthletes);