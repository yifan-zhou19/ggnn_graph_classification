import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void f(String a, int x, int y)
	{
		if (a[x].equals('(')) //??? ??????? ? ???
		{
			a[x] = a[y] = 'a';
		}
		else if (x > 0) //????
		{
			f(a, x - 1, y);
		}
	}
	public static void g(String a)
	{
		int i;
		for (i = 0;i < a.length();i++)
		{
			if (a[i].equals('('))
			{
				a[i] = '$';
			}
			else if (a[i].equals(')'))
			{
				a[i] = '?';
			}
			else
			{
				a[i] = ' ';
			}
		}
	}
	public static int Main()
	{
		char[][] str = new char[100][101];
		int i;
		int n = 0;
		int j;
		while (str[n++] = new Scanner(System.in).nextLine()) //??
		{
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(str[i]);
			System.out.print("\n");
			for (j = 0;j < String.valueOf(str[i]).length();j++)
			{
				if (str[i][j] == ')') //?????????
				{
					f(str[i], j - 1, j);
				}
			}
			g(str[i]);
			System.out.print(str[i]);
			System.out.print("\n");
		}
		return 0;
	}

}
