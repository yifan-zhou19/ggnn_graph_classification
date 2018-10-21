package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int n = 0;
		int max1 = 0;
		int max2 = 0;
		char c;
		for (i = 0;i < 300;i++,n++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ',')
			{
				break;
			}
		}
		for (i = 0;i < n + 1;i++)
		{
			if (a[i] > max1)
			{
				max1 = a[i];
			}
		}
		for (i = 0;i < n + 1;i++)
		{
			if (max1 == a[i])
			{
				a[i] = -1;
			}
		}
		for (i = 0;i < n + 1;i++)
		{
			if (a[i] > max2)
			{
				max2 = a[i];
			}
		}
		if (n == 0)
		{
			System.out.print("No\n");
		}
		else if (max2 == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",max2);
		}
		return 0;
	}
}

