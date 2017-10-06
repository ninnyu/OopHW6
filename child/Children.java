/* Homework 6, child package
 * @author NinnYu Chin
 * Description: 	Children class where children have a
 * 				function to change its super's protected member.
 */

package child;
import parent.Parents;

public class Children extends Parents{
	public String name = "John Doe";

	public void hackRecord(Parents p, int x) {
		p.jailRecord = x;
	}
}
