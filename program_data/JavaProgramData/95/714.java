import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c1 = new String(new char[80]);
		String c2 = new String(new char[80]);
		int i;
		int a;
		int b;
		c1 = new Scanner(System.in).nextLine();
		c2 = new Scanner(System.in).nextLine();
		a = c1.length();
		b = c2.length();
		for (i = 0;i <= a - 1;i++)
		{
			if ((c1.charAt(i) >= 'A') && (c1.charAt(i) <= 'Z'))
			{
				c1.charAt(i) += 32;
			}
		}
		for (i = 0;i <= b - 1;i++)
		{
			if ((c2.charAt(i) >= 'A') && (c2.charAt(i) <= 'Z'))
			{
				c2.charAt(i) += 32;
			}
		}
		if (a <= b)
		{
			for (i = 0;i <= a - 1;i++)
			{
				if (c1.charAt(i) < c2.charAt(i))
				{
					System.out.print('<');
					break;
				}
				else if (c1.charAt(i) > c2.charAt(i))
				{
					System.out.print('>');
					break;
				}
				else if ((i == a - 1) && (a == b))
				{
					System.out.print('=');
				}

				else if (i == a - 1)
				{
					System.out.print('<');
				}
			}
		}
		else
		{
			for (i = 0;i <= b - 1;i++)
			{
				if (c1.charAt(i) < c2.charAt(i))
				{
					System.out.print('<');
					break;
				}
							else if (c1.charAt(i) > c2.charAt(i))
							{
								System.out.print('>');
								break;
							}
							else if (i == b - 1)
							{
								System.out.print('>');
							}
			}
		}
		return 0; //?????
	}

}
