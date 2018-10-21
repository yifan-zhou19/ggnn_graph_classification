package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				a[j] = a[i]; //???????????
				j++;
			}
		}
		for (i = j;i < n;i++)
		{
			a[i] = '\0'; //??????????
		}
		for (i = 0;i < j;i++)
		{
			if (i == 0)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		} //???j??
		return 0;
	}
}

