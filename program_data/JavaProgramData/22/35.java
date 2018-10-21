package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[300];
		int flag = 0;
		int t;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{
		for (j = 0;j < i;j++)
		{
			for (k = 0;k < i - j;k++)
			{
				if (a[k] < a[k + 1])
				{
					t = a[k + 1];
					a[k + 1] = a[k];
					a[k] = t;
				}
			}
		}
		for (k = 0;k < i;k++)
		{
			if (a[k] > a[k + 1])
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",a[k + 1]);
		}
		}
	}
}

