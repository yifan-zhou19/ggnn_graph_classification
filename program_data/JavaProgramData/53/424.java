package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int x;
		int m = 0;
		int[] a = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			for (j = 0;j <= m;j++)
			{
				if (x == a[j])
				{
					break;
				}
			}
			if (j > m)
			{
				m++;
				a[j] = x;
				System.out.printf(",%d",x);
			}
		}
	}

}

