import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int l = 0;
	public static int Main()
	{
		int i;
		int count = 0;
		final String c = "\0";
		int out = char c.charAt();
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			count++;
		}
		l = count;
		out(c);
		return 0;
	}
	public static int out(String c)
	{
		int count = 0;
		int i;
		int j;
		for (i = 0; !c[i].equals('\0');i++)
		{
			count++;
		}
		if (l == 0)
		{
			return 0;
		}
		else
		{
		for (i = 0;i < count;i++)
		{
			if (c[i].equals(c[count - 1]))
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (c[j].equals('1'))
					{
						continue;
					}
					if (c[j].equals(c[count - 1]))
					{
						break;
					}
					if (c[j].equals(c[0]))
					{
						System.out.print(j);
						System.out.print(' ');
						System.out.print(i);
						System.out.print("\n");
						c[i] = '1';
						c[j] = '1';
						l = l - 2;
						break;
					}
				}
			}
		}
		}
		out(c);
	}
}
