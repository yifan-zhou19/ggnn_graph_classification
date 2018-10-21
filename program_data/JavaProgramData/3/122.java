package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] a = new int[1000];
		int[] b = new int[1000];
		int sum;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] + a[j] == k && i != j)
				{
					b[i] += 1;
					break;
				}
			}
		   if (j == n)
		   {
			   b[i] = 0;
		   }
		}
		for (h = 0;h < n;h++)
		{
			sum += b[h];
		}
		if (sum == 0)
		{
			System.out.print("no\n");
		}
		if (sum != 0)
		{
			System.out.print("yes\n");
		}



		return 0;
	}
}

