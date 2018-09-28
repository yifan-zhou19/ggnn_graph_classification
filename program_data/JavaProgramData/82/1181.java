package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int n1 = 0;
		int n2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i - 1] = Integer.parseInt(tempVar3);
			}
			if (a[i - 1] >= 90 && a[i - 1] <= 140 && b[i - 1] <= 90 && b[i - 1] >= 60)
			{
				n1++;
				if (n1 > n2)
				{
					n2 = n1;
				}
			}
			else
			{
				n1 = 0;
			}

		}
		System.out.printf("%d\n",n2);
		return 0;
	}



}

