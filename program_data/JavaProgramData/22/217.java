package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n = 0;
		int i;
		int max = 0;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c != ',')
			{
				a[n] = a[n] * 10 + c - '0';
			}
			else
			{
				n++;
			}
		}
		for (i = 0;i <= n;i++)
		{
			max = max > a[i] != 0?max:a[i];
		}
		for (i = 0;i <= n;i++)
		{
			if (a[i] == max)
			{
				a[i] = 0;
			}
		}
		max = 0;
		for (i = 0;i <= n;i++)
		{
			max = max > a[i] != 0?max:a[i];
		}
		if ((n == 0) || (max == 0))
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",max);
		}
	}

}
