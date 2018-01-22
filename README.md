# Introduction to Programming

## Practical 8: Inheritance

## Instructions

This practical focuses on __inheritance__ and __class hierarchy__. You will need to download the DoME example, which follows chapter 8 of the bluej book.

### Level 1

1. __Implementation.__ The DoME project, using the source code provided.
	* Look carefully at the DoME example provided. Add some DVDs to the database and then
update the _DVD_ class so that the `print()` method works the same way as the _CD_ class `print()`
method, test this by calling the _Database_ class `list()` method.

	* Write a class _VideoGame_ that can be added to the list of items in the database, test this
works using the `list()` method.

2. __Design.__ A company sells a range of items. Customers make purchases via
the company web site. The site provides descriptions of items and prices before and after VAT.
Some items can only be purchase as a whole unit (such as a phone) whereas other items can be
purchase as fraction of units (such as fabrics). All items have a reference ID, a name, a description
and a VAT value (percentage). Items such as phone have a price per unit, items such as fabrics have
a price per unit and a unit measure (for example metre, or kg). Design the classes _WholeItem_ for
items such as phone, _FracItem_ for items such as fabrics and any other classes that may be needed.
Instance methods are provided for obtaining the price before and after tax for a single unit, and
for obtaining a printable _String_ representation.


### Level 2

1. __Implementation.__ There is a flaw in the design of the DoME project. For example
`playingTime` should not be used for for a video game. Change the design and implementation to
solve this problem. If you see other problems make the necessary changes, you should justify your
choices (note that `playingTime` should still be used for DVDs and CDs).

2. __Design.__ The company also sells second-hand items. Only _WholeItem_ objects
can be sold as second-hand. Second-hand items can vary in condition. Each item is given a grade
between 1 and 5. A grade one item is in as new condition. A grade 5 item is in poor condition,
typically cosmetically damaged but working. The ex-VAT price of a second-hand item is based on
the ex-VAT cost new. Depending on grade, a discount is applied.

| Grade | Discount|
|-------|---------|
| 1     | 10%     |
| 2     | 20%     |
| 3     | 30%     |
| 4     | 50%     |
| 5     | 70%     |

Using your design from level 1, design the _SecondHandItem_ class.
Design a class _Basket_ that stores items selected by the customer. Instance methods are provided for
obtaining the price before and after tax of the content of the basket, and for obtaining a printable
String representation (for example one item per line).

Implement your classes.

