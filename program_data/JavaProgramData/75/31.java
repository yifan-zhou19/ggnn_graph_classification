package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] t = new int[1000];
		int n = 0;
		int i;
		int j;
		int max = 0;
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[n++] = Integer.parseInt(tempVar);
		}
		} while (System.in.read() == ',');
		n = 0;
		do
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[n++] = Integer.parseInt(tempVar2);
		}
		} while (System.in.read() == ',');
		for (i = 0;i < n;i++)
		{
		   for (j = x[i];j < y[i];j++)
		   {
			  t[j]++;
		   }
		}
		for (i = 0;i < 1000;i++)
		{
		if (max < t[i])
		{
			max = t[i];
		}
		}
		System.out.printf("%d %d\n",n,max);
	}


}

