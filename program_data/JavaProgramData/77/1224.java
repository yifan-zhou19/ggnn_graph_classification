import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int judge(int s, String k)
	{
		int sum = 0;
		int p;
		for (int i = 0;i < s;i++)
		{
			if (k[i].equals(' '))
			{
				sum++;
			}
		}
		if (sum == s)
		{
			p = 1;
		}
		else
		{
			p = 0;
		}
		return (p);
	}
	public static int Main()
	{
		int i = 0;
		String kids = new String(new char[110]);
		char boy;
		char gal;
		kids = new Scanner(System.in).nextLine();
		for (i = 0;i < kids.length();i++)
		{
			if (kids.charAt(i) != kids.charAt(i + 1))
			{
				boy = kids.charAt(i);
				gal = kids.charAt(i + 1);
				break;
			}
		}
		while (judge(kids.length(), kids) != 1)
		{
			if (kids.charAt(i) == boy && kids.charAt(i + 1) == gal)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(i + 1);
				System.out.print("\n");
				kids = tangible.StringFunctions.changeCharacter(kids, i, ' ');
				kids = tangible.StringFunctions.changeCharacter(kids, i + 1, ' ');
				i = 0;
			}
			else if (kids.charAt(i) == ' ' && kids.charAt(i + 1) == gal)
			{
				for (int j = i;j >= 0;j--)
				{
					if (kids.charAt(j) == boy)
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i + 1);
						System.out.print("\n");
						kids = tangible.StringFunctions.changeCharacter(kids, i + 1, ' ');
						kids = tangible.StringFunctions.changeCharacter(kids, j, ' ');
						i = 0;
						break;
					}
				}
			}
			else
			{
				i++;
			}
		}
		return 0;
	}



}

