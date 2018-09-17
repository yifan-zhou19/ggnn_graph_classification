package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int[] a = new int[25];
		int[] b = new int[25];
		int i;
		int j;
		int t;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0,t = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					if (b[j] > t)
					{
						t = b[j];
					}
				}
			}
			b[i] = 1 + t;
			if (b[i] > s)
			{
				s = b[i];
			}
		}
		System.out.printf("%d",s);
	}

}

