package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int sum = 0;
		int temp;
		char c;
		int n = 1;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if ((c = System.in.read()) == '\n')
			{
				break;
			}
		n++;
		}
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 1;i <= n - 1;i++)
			{
				sum += (a[0] - a[i]) * (a[0] - a[i]);
			}
			if (sum == 0)
			{
				System.out.print("No");
			}
			else
			{
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 2;j++)
			{
				if (a[j] >= a[j + 1])
				{
					temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
				}
			}
		}
			}
		}
		for (i = n - 2;i >= 0;i--)
		{
			if (a[i] - a[n - 1] != 0)
			{
				System.out.printf("%d\n",a[i]);
			break;
			}
		}
	}
}

