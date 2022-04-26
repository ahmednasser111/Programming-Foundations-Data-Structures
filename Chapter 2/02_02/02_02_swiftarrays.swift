var perStudentPetCount = [0, 1, 0, 2, 1, 1, 4, 0, 0, 0, 3, 2, 1, 3, 0, 2, 2, 4]
var numOfStudents = perStudentPetCount.count

//average = sumOfItems / numOfStudents

print(perStudentPetCount[3])
// print(perStudentPetCount[100])       # OutOfBound.
print(numOfStudents)

var sum = 0

for i in perStudentPetCount {
	sum = sum + i
}
print(sum)

var average = sum / numOfStudents
// var average = Double(sum) / Double(numOfStudents)            #To get more accurate average.
print(average)