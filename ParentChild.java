/* 	Homework 6, main method
 * 	@author NinnYu Chin
 * 	Instruction:	Access a protected variable of the parent class from a child 
 *			class. Make sure that the parent and the child classes are in different 
 *			packages.
 */

import child.Children;

public class ParentChild {
	public static void main (String[] args) {
		Children child1 = new Children();
		
		System.out.println(	child1.name + "'s father has been arrested " +
							child1.getRecord() + " times.");
		child1.hackRecord((int) (Math.random()*50));
		System.out.println(	"After " + child1.name + " hacked into his father's records,"
							+ "it now shows that his father has been arrested " +
							child1.getRecord() + " times.");
	}
}
