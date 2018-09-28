package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int c;
		int b;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a1 = 0;a1 < n;a1++)
		{
			a[a1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a2 = n - 1;a2 >= 0;a2--)
		{
			if (a[a2] != k)
			{
			break;
			}
		}
		for (b = 0,a3 = a2;a3 >= 0;a3--)
		{
			if (a[a3] == k)
			{
				b = b + 1;
			}
		}
		for (c = 0,a4 = 0;a4 <= a2;)
		{
			if (a[a4] != k)
			{
				a[c] = a[a4];
				c++;
				a4++;
			}
			else
			{
				a4++;
				continue;
			}
		}
		for (a5 = 0;a5 <= c - 1;a5++)
		{
			if (a5 != c - 1)
			{
			System.out.print(a[a5]);
			System.out.print(" ");
			}
			if (a5 == c - 1)
			{
			System.out.print(a[a5]);
			}
		}
		return 0;
	}

}

