package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static void f(String a, int n)
	{
		int flag = 0;
		int i;
		int h = 0;
		int k;
		int sum = 1;
		int m;
		for (i = 1; i <= n - 1; i++)
		{
			switch (a[i])
			{
			case '(':
			{
					m = 1;
					break;
			}
			case ')':
			{
					m = -1;
					break;
			}
			case '*':
			{
					m = 0;
					break;
			}
			}
			sum = sum + m;
			switch (sum)
			{
			case 2:
			{
					sum = sum - 1;
					k = i;
					h = 1;
					break;
			}
			case 1:
				break;
			case 0:
			{
					flag = 1;
					if (h == 1)
					{
						System.out.print(k);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a[k] = '*';
						a[i] = '*';
					}
					else
					{
						System.out.print("0 ");
						System.out.print(i);
						System.out.print("\n");
					}
			}
			}
			if (flag == 1)
			{
				break;
			}
		}
	}

	public static int Main()
	{
		int n;
		int q = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.length();
		for (q = 1; q <= n - 1; q++)
		{
			if (a.charAt(q) == a.charAt(0))
			{
				a = tangible.StringFunctions.changeCharacter(a, q, '(');
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, q, ')');
			}
		}
		for (q = 1; q <= (n / 2); q++)
		{
			f(a, n);
		}
		return 0;
	}
}

