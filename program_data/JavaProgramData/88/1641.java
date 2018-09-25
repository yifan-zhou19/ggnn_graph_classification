import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[31]);
		c = new Scanner(System.in).nextLine();
		int n = (Character.SIZE / Byte.SIZE);
		for (int i = 0; i < n; i++)
		{
			if (Character.isDigit(c.charAt(i)))
			{
				System.out.print(c.charAt(i));
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
