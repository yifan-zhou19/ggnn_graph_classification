package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int sum1 = 0;
		int sum2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == b[i])
			{
				continue;
			}
			else if (a[i] == 0 && b[i] == 1)
			{
				sum1++;
			}
			else if (a[i] == 0 && b[i] == 2)
			{
				sum2++;
			}
			else if (a[i] == 1 && b[i] == 0)
			{
				sum2++;
			}
			else if (a[i] == 1 && b[i] == 2)
			{
				sum1++;
			}
			else if (a[i] == 2 && b[i] == 0)
			{
				sum1++;
			}
			else if (a[i] == 2 && b[i] == 1)
			{
				sum2++;
			}
		}
		if (sum1 == sum2)
		{
			System.out.print("Tie\n");
		}
		if (sum1 > sum2)
		{
			System.out.print("A\n");
		}
		if (sum2 > sum1)
		{
			System.out.print("B\n");
		}
		return 0;
	}


}

