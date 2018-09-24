package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (;;)
		{
		String cin = new String(new char[201]);
		String cout = new String(new char[201]);
		int[] a = new int[201];
		int i;
		int j;
		int n;
		int sum;
		cin = new Scanner(System.in).nextLine();
		if (feof(stdin))
		{
				break;
		}

		n = cin.length();
		for (i = 0;i < n;i++)
		{
			cout = tangible.StringFunctions.changeCharacter(cout, i, ' ');
			if (cin.charAt(i) == '(')
			{
				a[i] = 1;
			}
			else if (cin.charAt(i) == ')')
			{
				a[i] = -1;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			if (a[i] != 1)
			{
				continue;
			}
			for (j = i;j < n;j++)
			{
				sum = sum + a[j];
				if (sum == 0)
				{
					break;
				}
			}
			if (sum != 0)
			{
				cout = tangible.StringFunctions.changeCharacter(cout, i, '$');
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			sum = 0;
			if (a[i] != -1)
			{
				continue;
			}
			for (j = i;j >= 0;j--)
			{
				sum = sum + a[j];
				if (sum == 0)
				{
					break;
				}
			}
			if (sum != 0)
			{
				cout = tangible.StringFunctions.changeCharacter(cout, i, '?');
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",cin.charAt(i));
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",cout.charAt(i));
		}
		System.out.print("\n");
		}
	}

}

