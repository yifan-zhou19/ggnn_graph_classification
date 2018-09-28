package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		char a;
		char b;
		int i;
		int j;
		int k = 0;
		int r = 0;
		int n = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			n = n + 1;
			if (a != ',')
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				b = tempVar4.charAt(0);
			}
			if (b != ',')
			{
				break;
			}
		}
		for (j = 0;j < 1000;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (j >= x[i] != 0 && j < y[i])
				{
					k = k + 1;
				}
			}
			if (k > r)
			{
				r = k;
			}
			k = 0;
		}
		System.out.printf("%d %d",n,r);


	}

}

