********************************
JavaScript
********************************

Vanilla JS
==================
Arrays
------------------
unshift(x)
^^^^^^^^^^^^^^^^^^^^^^^
Adds a new item to the beginning of the array and returns the new array length

push(x)
^^^^^^^^^^^^^^^^^^^^^^^
Adds a new item to the end of the array and returns the new array length

join()
^^^^^^^^^^^^^^^^^^^^^^^
Returns all elements in an array as a single string

.. code-block:: javascript
    
    var fruits = ["Banana", "Orange", "Apple", "Mango"];
    var energy = fruits.join();
    // energy == "Banana,Orange,Apple,Mango"

The elements will be seperated by a specified seperator. By default this is a comma




Strings
------------------
split("")
^^^^^^^^^^^^^^^^^^^^^^^
Split a string into an array based on each occurance of the passed parameter

* Ex. "" would split each single char into its own index in the array

parseInt("40")
^^^^^^^^^^^^^^^^^^^^^^^
Parse a string and returns an integer

concat(str)
^^^^^^^^^^^^^^^^^^^^^^^
Concats strings together

.. code-block:: javascript
    
    let newStr = str1.concat(str2)
    let newStr = str1.concat(str2, str3, strn)



ES6+ (ECMAScript 6)
======================
Variable Definitions
-------------------------
let
^^^^^^^^^^^^^^^^^^^^^^^
Variable which is accessible from within the scope that it is declared only

var 
^^^^^^^^^^^^^^^^^^^^^^^
Variable decleration which is accessible globally or anywhere within the function

const
^^^^^^^^^^^^^^^^^^^^^^^
Variable decleration for an immutable value



React
==================
ComponentLifeCycle
-------------------------
"In order from first to last"

1. componentWillMount
    * Immediately before initial rendering

2. componentDidMount
    * Immediately after initial rendering

3. componentWillRecieveProps
    * When component recieved new props (ex. new props due to parent state change)

4. shouldComponentUpdate
    * Before rendering, after recieving new props or state. Can return false to prevent rerendering

5. componentWillUpdate
    * Before rendering, after receiving new props or state

6. componentDidUpdate
    * After component's update are flushed to DOM

7. componentWillUnMount
    * Immediately before removing component from DOM

Error Boundaries
-------------------------
`Error Boundaries <https://reactjs.org/docs/error-boundaries.html>`_

Runtime errors during rendering will break the app, we can prevent this using error boundaries.
Consists of two lifecycle methods:

* static getDerivedStateFromError(error)

    * Used to render a fallback UI after an error is thrown
    * Can set error state to true and conditionally render a specific UI

* componentDidCatch(error, info)

    * Used to log the error and information

Create an ErrorBoundary component which has the two lifecycle methods above. You can then wrap any
component in this ErrorBoundary component if you wish to enable the error boundaries for it.

Redux State Management
-------------------------
A popular state management library that keeps all state information in a central location called a 'store'.
Redux models the applications state as a single JS Object

Action
    
    * A POJO that must have a key called 'type' and a string value
    * Can have any number of additional keys

Reducer

    * A function that accepts the state and an action and returns a new state

Store

    * One bug POJO that represents the entire state of the application

Vue
==================

Polymer
==================

D3
==================