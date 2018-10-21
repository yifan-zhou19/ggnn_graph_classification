package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] x = new int[100000];
		int i;
		int j;
		int n;
		int s;
		int y;
		int p;
		int[] b = new int[100000];
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p = Integer.parseInt(tempVar4);
			}
			b[i] = y + p;
		}
		int t;
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[j] > b[i])
				{
					s = x[i];
					x[i] = x[j];
					x[j] = s;
					t = b[i];
					b[i] = b[j];
					b[j] = t;

				}

			}

		}
		for (i = 0;i < 3;i++)
		{
		System.out.printf("%d %d\n",x[i],b[i]);
		}
	}

}

