package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zai = new int(int m,int n);
		int[][] a = new int[5][5];
		int b;
		int c;
		int d;
		int i;
		int e;
		for (d = 0;d < 5;d++)
		{
			for (i = 0;i < 5;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[d][i] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		d = zai(b, c);
		if (d == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				e = a[b][i];
				a[b][i] = a[c][i];
				a[c][i] = e;
			}
		for (d = 0;d < 5;d++)
		{
			for (i = 0;i < 4;i++)
			{
				System.out.printf("%d ",a[d][i]);
			}
	System.out.printf("%d\n",a[d][4]);
		}
		}
		return 0;
	}
	public static int zai(int m,int n)
	{
		if (m < 5 && n < 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

