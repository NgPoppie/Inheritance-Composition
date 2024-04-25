Two files to show how to implement other classes .One is by inheritance which where the extended class is always compromised when methods in the super class change,it also exposes the implementation details hence low encapsulation
Using inhertance requires various considerations and concessions
The other way is composition where the instance of super class is declared as private then implemented via the constructor of sub class .This does enhance perfomance as changes on other parts will 
not directly affect it
