# Object Oriented (Core) Principles:

1. Abstraction
	- the ability for the client to access only specific, desired properties. 
	- can only get the parts that we want, eg, the instantiated object _person1_ can access _person1.walking()_ then later _person1.sleeping()_ (vs. accessing these methods all at once)

2. Encapsulation
	- binding methods and properties together while hiding complex, inner workings.

3. Inheritance
	- classes are organized in a hierarchy that passes properties down to child classes.

4. Polymorphism
	- the ability for methods and objects to take on various forms for sake of reusability and convenience.
	

Person person1 = new Person();
person1.name = "Panda";		// The data attribute _Panda_ is bound to the object _person1_

* What are __constructors__?
	=> unique methods
	* What makes them "unique"?
	1. They are used to define/setup/initialize properties of an object
	2. Constructors are IMPLICITELY called upon INSTANTIATION
	3. The same name as the class itself
	4. Constructors have no return type at all

* What is __overloading__?
	=> Can call same method name with different arguments

* What does __static__ represent?
	=> The variable or method belongs to the class and NOT the particular object instance (eg, the routing number for each bank account - where each initialized object will have the same routing number).
	=> In other words, often times _static_ will say "belongs to the class and not the object instance"
	* What does _final_ do?
		=> We would not be able to set/re-set a static variable. It's like a _constant_
		- often _static_ and _final_ go together.
	- Whenever you instantiate an object and want to use that property uniquely to that new object you DON'T want to use _static_.
	- If you want to access something directly as pertaining to the class not a specific instance, then you DO use the _static_ keyword.

* What is _Inheritance_?
	=> It is the idea that all classes and objects are coming from some parent class, eg, the _Object_ class	
	
* How is an inherited method _overided_?

* For: _public void SomeClass **extends** SomeParentClass {_ 
	-  What does the **extends** do?

* What are _access modifiers/specifiers_? 
	=> eg, public, private, and protected keywords
		- **default**: available anywhere in the **package**
			- eg, _oop_ package (if defined in that package)
		- **public**: available anywhere in the **project**, 
			- eg, throughout _src_ file (?)
			- available to the client, so they can access what then need and nothing more
		- **private**: available only in the **class**
			- eg, if a method is created in _BankAccount_ it won't be available in _BankAccountApp_
		- **protected**:
	- Best practice: we should always have our properties as restricted as possible and only make them visible to the outside world when necessary
	* How to interact with private elements using encapsulation?
	
* What is _Encapsulation & Data Hiding_?
	=> The main idea behind encapsulation is that we want to make our variables private, and interact with them through public methods
	- with Encapsulation: public API methods

* What are _Interfaces_?
	=> Think of it like a contract
	=> Creating an outline for what's needed and leaving the implementation up to the user.
	- classes can have multiple interfaces (but only extend 1)

* What is _Polymorphism_?
	=> The ability for us to call different names and access different elements with the same name.
		- Think the constructor methods. We can have the same method name but call different code depending on the parameter. (Polymorphism through overloading)
		- Think overriding toString() (Polymorphism through overriding)
		
		
//---------THE END------------