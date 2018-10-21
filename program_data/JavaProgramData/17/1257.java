import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*3704:??????*/ 



	public static void del(String a, int n) //?????????????
	{
		int i = 0;
		while (!a[i].equals(')') && i < n)
		{
			i++;
		}
		int j;
		j = i - 1;
		while (!a[j].equals('(') && j >= 0)
		{
			j--;
		}
		if (i < n && j >= 0)
		{
			a[i] = ' ';
			a[j] = ' ';
			del(a, n);
		}
		else
		{
			if (i >= n != 0 && j >= 0)
			{
				a[j] = '$';
			}
			if (j < 0 && i < n)
			{
				a[i] = '?';
			}
			if (!(i >= n != 0 && j < 0))
			{
				del(a, n);
			}
		}

	}

	public static int Main()
	{
		while (!cin.eof())
		{
			String a = new String(new char[101]);
			a = new Scanner(System.in).nextLine();
			System.out.print(a);
			System.out.print("\n");
			int n;
			int i;
			n = a.length();
			del(a, n);
			for (i = 0;i < n;i++)
			{
				switch (a.charAt(i))
				{
					case '$':
					case '?':
						System.out.print(a.charAt(i));
						break;
					default:
						System.out.print(' ');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}
