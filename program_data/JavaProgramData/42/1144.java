package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int[] a = new int[150000];
		int i = 0;
		int j = 0;
		int temp = 0;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				continue;
			}
			else if (a[i] == k)
			{
				for (j = i;j < n;j++)
				{
					a[j] = a[j + 1]; //???????????
				}
				m++;
				i--; //??i????????????????????????????????????????????????i--??????i?????
			}
		}
		for (i = 0;i < (n - m);i++)
		{
			if (i < (n - m - 1))
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else if (i == (n - m - 1))
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

