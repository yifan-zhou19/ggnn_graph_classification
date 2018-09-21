package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int k = 0;
		int i;
		int max = -999;
		int max1 = -999;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[k] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		while (c != '\n')
		{
			k++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[k] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (a[i] > max1 && a[i] < max)
			{
				max1 = a[i];
			}
		}
			if (max1 == -999)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",max1);
			}
			return 0;
	}

}

