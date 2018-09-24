package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[25];
		int[] b = new int[25];
		int n;
		int i;
		int j;
		int max = 1;
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
			b[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if ((b[i] <= b[j]) && (a[i] <= a[j]))
				{
					b[i] = b[j] + 1;
					if (b[i] > max)
					{
						max = b[i];
					}
				}
			}
		}
		System.out.printf("%d",max);
	}

}

