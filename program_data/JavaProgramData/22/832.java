package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[300];
		int min;
		int max;
		char c;
		for (i = 0;;i++)
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
		n = i;
		max = a[0];
		for (i = 1;i <= n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		min = -9999;
		for (i = 0;i <= n;i++)
		{
			if (a[i] < max && a[i]> min)
			{
				min = a[i];
			}
		}
		if (min == -9999)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",min);
		}
		return 0;
	}
}

