package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int t;
		int n;
		int k;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0, t = 0;t < n;t++)
		{
			if (a[t] != k)
			{
				a[i] = a[t];
				i++;
			}
			else
			{
				count++;
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < (n - count);i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}

