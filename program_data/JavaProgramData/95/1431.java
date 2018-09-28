import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int flag = 1;
		for (int i = 0;a.charAt(i) != '\0';i++)
		{
				int c;
				int d;
				c = a.charAt(i),d = b.charAt(i);
				if ((c >= 97) && (c <= 122))
				{
				c = c - 32;
				}
				if ((d >= 97) && (d <= 122))
				{
				d = d - 32;
				}
				if (c < d)
				{
					   flag = 0;
					   System.out.print("<");
					   break;
				}
				else if (c > d)
				{
					   flag = 0;
					   System.out.print(">");
					   break;
				}
		}
		if (flag == 1)
		{
		System.out.print("=");
		}
		return 0;
	}
}
