package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int b;
		int x = 0;
		int flag = 0;
		int i;
		int j;
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
				if (i != j)
				{
					b = a[i] + a[j];
					if (b == k)
					{
						System.out.print("yes");
						flag = 1;
						break;
					}
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}


}

