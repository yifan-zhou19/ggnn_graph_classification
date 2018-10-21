package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int a;
		int e;
		int f;
		int d;
		int h;
		int g;
		int k;
		int m;
		int n;
		int[] y = new int[1000];
		int[] x = new int[1000];
		int[] z = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;m > 0;i++)
		{
			x[i] = m;
			m = m / 2;
		}
		for (j = 1;n > 0;j++)
		{
			y[j] = n;
			n = n / 2;
		}
		for (k = 1;k < i;k++)
		{
			for (h = 1;h <= j;h++)
			{
				if (x[k] == y[h])
				{
					System.out.printf("%d",x[k]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto A;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		A:

			return 0;
	}

}

