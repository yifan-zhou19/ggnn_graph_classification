import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void pipei(String str)
	{
		int i;
		int la;
		int[] stack = new int[100];
		int k = 0;
		String res = new String(new char[101]);
		la = str.length();
		for (i = 0;i < la;i++)
		{
			res = tangible.StringFunctions.changeCharacter(res, i, ' ');
		}
		res = tangible.StringFunctions.changeCharacter(res, la, '\0');
		for (i = 0;i < la;i++)
		{
			if (str[i].equals(')'))
			{
				if (k == 0 || stack[k - 1] > 0)
				{
					stack[k++] = i + 1;
				}
				else
				{
					k--;
				}
			}
			else if (str[i].equals('('))
			{
				stack[k++] = -(i + 1);
			}
		}
		for (i = 0;i < k;i++)
		{
			int a = stack[i];
			if (a < 0)
			{
				res = tangible.StringFunctions.changeCharacter(res, -a - 1, '$');
			}
			else
			{
				res = tangible.StringFunctions.changeCharacter(res, a - 1, '?');
			}
		}
		System.out.print(str);
		System.out.print("\n");
		System.out.print(res);
		System.out.print("\n");
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String str = new String(new char[101]);
		for (i = 0;i < n;i++)
		{

			str = new Scanner(System.in).nextLine();
			pipei(str);

		}
		return 0;
	}




}

