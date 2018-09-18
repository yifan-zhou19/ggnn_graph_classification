import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   for (int p = 0;p < 15;p++)
	   {
		   String c = new String(new char[110]);
	   void f(char c.charAt(110));
	   c = new Scanner(System.in).nextLine();
	   System.out.print(c);
	   System.out.print("\n");
	   int i;
	   int j;
	   int k;
	   int l;
	   l = c.length();
	   for (i = 0;i < l;i++)
	   {
			if (c.charAt(i) != '(' && c.charAt(i) != ')')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, ' ');
			}
	   }
		f(c);
		for (i = 0;i < l;i++)
		{
			if (c.charAt(i) == ')')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '?');
			}
		}
		System.out.print(c);
		System.out.print("\n");
	   }

		return 0;
	}
	public static void f(String c)
	{
		int i;
		int j;
		int k;
		int l;
		l = c.length();
		for (i = (l - 1);i >= 0;i--)
		{
			if (c[i].equals('('))
			{
				for (j = (i + 1);j < l;j++)
				{
					if (c[j].equals(')'))
					{
						c[j] = ' ';
						c[i] = ' ';
						k = 1;
						break;
					}
					k = 0;
				}
				if (k == 0)
				{
					c[i] = '$';
				}
				f(c);
			}
		}
	}




}

