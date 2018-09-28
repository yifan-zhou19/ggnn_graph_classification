package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n = 0;
		int[] a = new int[300];
		int max = -1;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n++] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
		}while (c == ',');
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == max)
			{
				a[i] = 0;
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max != 0)
		{
			System.out.printf("%d",max);
		}
		else
		{
			System.out.print("No");
		}
	}
}

