package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int m = 1;
		int i;
		int j;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < m;j++)
			{
				if (a[j] == x)
				{
					break;
				}
			}
			if (j == m)
			{
				a[m] = x;
				m++;
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}




}

