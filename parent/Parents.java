/* 	Homework 6, parent package
 * 	@author NinnYu Chin
 * 	Description: 	Parent class with a protected member.
 */

package parent;

public class Parents {
	protected int jailRecord = (int)(Math.random()*50);
	
	public int getRecord() {
		return jailRecord;
	}
}
