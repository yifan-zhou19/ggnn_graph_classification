import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		{
			String a = new String(new char[500]);
			String b = new String(new char[100]);
			int[] c = new int[100];
			a = new Scanner(System.in).nextLine();
			int len = a.length();
			b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
			c[0] = 1;
			for (int i = 1; i < 100; i++)
			{
				c[i] = 0;
			}
			int j = 0;
			for (int i = 1; i < len; i++)
			{
				if (a.charAt(i) != b.charAt(j) && a.charAt(i) != b.charAt(j) + 32 && a.charAt(j) != b.charAt(j) - 32)
				{
				   j++;
				   b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				   c[j]++;
				}
				else if (a.charAt(i) == b.charAt(j) || a.charAt(i) == b.charAt(j) + 32 || a.charAt(i) == b.charAt(j) - 32)
				{
					 c[j]++;
				}
			}
			for (int i = 0; i <= j; i++)
			{
				if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
				{
				   b.charAt(i) -= 32;
				}
			}
			for (int i = 0; i <= j; i++)
			{
				System.out.print('(');
				System.out.print(b.charAt(i));
				System.out.print(',');
				System.out.print(c[i]);
				System.out.print(')');
			}
			System.out.print("\n");
	}

		char a;
		while (cin.get(a))
		{
			System.in.read();
			if (a != '?')
			{
			   break;
			}
			System.out.print("?");
			System.out.print("\n");
			String a = new String(new char[500]);
			String b = new String(new char[100]);
			int[] c = new int[100];
			a = new Scanner(System.in).nextLine();
			int len = a.length();
			b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
			c[0] = 1;
			for (int i = 1; i < 100; i++)
			{
				c[i] = 0;
			}
			int j = 0;
			for (int i = 1; i < len; i++)
			{
				if (a.charAt(i) != b.charAt(j) && a.charAt(i) != b.charAt(j) + 32 && a.charAt(j) != b.charAt(j) - 32)
				{
				   j++;
				   b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				   c[j]++;
				}
				else if (a.charAt(i) == b.charAt(j) || a.charAt(i) == b.charAt(j) + 32 || a.charAt(i) == b.charAt(j) - 32)
				{
					 c[j]++;
				}
			}
			for (int i = 0; i <= j; i++)
			{
				if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
				{
				   b.charAt(i) -= 32;
				}
			}
			for (int i = 0; i <= j; i++)
			{
				System.out.print('(');
				System.out.print(b.charAt(i));
				System.out.print(',');
				System.out.print(c[i]);
				System.out.print(')');
			}
			System.out.print("\n");
		}


		return 0;
	}

}

