package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			int[] a = new int[MAX];
			int[] b = new int[MAX];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		for (int k = 0;k < n;k++)
		{
			if (a[k] - b[k] == -1)
			{
				sum1 = sum1 + 1;
			}
			else if (a[k] - b[k] == 1)
			{
				sum2 = sum2 + 1;
			}
			else if (a[k] - b[k] == 2)
			{
				sum1 = sum1 + 1;
			}
			else if (a[k] - b[k] == -2)
			{
				sum2 = sum2 + 1;
			}
			else if (a[k] == b[k])
			{
				sum1 = sum1 + 1;
				sum2 = sum2 + 1;
			}
		}
		if (sum1 > sum2)
		{
			System.out.print("A");
		}
		else if (sum1 < sum2)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

