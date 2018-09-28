import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????
	//by.???
	//on.20101229

	public static int Main()
	{
		String c = new String(new char[31]);
		c = new Scanner(System.in).nextLine(); //??
		int i;
		for (i = 0;i < c.length();i++)
		{
			if ((c.charAt(i) - '0' < 0) || (c.charAt(i) - '9' > 0))
			{
				System.out.print("\n");
				continue;
			}
			else
			{
				System.out.print(c.charAt(i));
			}
		}
		return 0;
	}
}
