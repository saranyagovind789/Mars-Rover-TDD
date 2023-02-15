MARS ROVER

Create a program to move rovers around the surface of Mars! 
The surface of Mars is represented by a Plateau. The assumption is that the Plateau is a Square or a Rectangular grid  
Rovers navigate the Plateau so they can use their special cameras and robot arms to collect samples back to Planet Earth.

Representation of a Rover’s Position on the Plateau
The Plateau is divided into a grid. A Rover’s position is represented by x and y co-ordinates and 
the letters N, S, W, E to represent North, South, West, East respectively.

Assumptions :

The surface is square/rectangular
The coordinates begin at 0,0
The rovers only move forwards one square at a time
Cannot go over the dimensions  of the plateau - no negative numbers
Rovers turn 90 degrees so can only move vertically and horizontally
Each L or R instruction is only 90 degrees
Movement instructions can only be made up of "LRM"

Instructing a Rover to Move Around the Plateau.
0 0 N means the Rover is at the bottom-left corner facing in the North direction.
To move a Rover around the Plateau, a string of letters is sent to a Rover. 
Here are the letters and their actions :
L Spins the Rover 90 degrees Left without moving from the current coordinate point
R Spins the Rover 90 degrees Right without moving from the current coordinate point
M Moves the Rover forward by one grid point, maintaining its orientation.