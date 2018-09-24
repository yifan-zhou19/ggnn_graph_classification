package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1 = 0;
		int k1 = 0;
		int l = 0;
		char i;
		char n;
		char[] a = {0};
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			if (a[i] >= 65 && a[i] <= 90 || a[i] >= 97 && a[i] <= 122)
			{
				l++;
			}
			if (a[i] == 0)
			{
				break;
			}

		}
	if (l == 0)
	{
	System.out.print("No");
	System.out.print("\n");
	}
	else
	{
		for (i = 65;i < 91;i++)
		{
			for (n = 0;n < 300;n++)
			{
				if (a[n] == i)
				{
					l1++;
				}
				if (a[n] == 0)
				{
					break;
				}

			}
			if (l1 != 0)
			{
			System.out.print(i);
			System.out.print("=");
			System.out.print(l1);
			System.out.print("\n");
			}
			l1 = 0;
		}
		for (i = 97;i < 123;i++)
		{
			for (n = 0;n < 300;n++)
			{
				if (a[n] == i)
				{
					k1++;
				}
				if (a[n] == 0)
				{
					break;
				}

			}
			if (k1 != 0)
			{
			System.out.print(i);
			System.out.print("=");
			System.out.print(k1);
			System.out.print("\n");
			}
			k1 = 0;
		}
	}
		return 0;
	}
}
