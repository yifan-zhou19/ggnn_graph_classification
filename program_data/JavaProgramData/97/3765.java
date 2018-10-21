package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int[] r = {100, 50, 20, 10, 5, 1};
		int[] p = new int[max];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < max;i++)
		{
			p[i] = m / r[i];
			m = m % r[i];
		}
		for (i = 0;i < max;i++)
		{
			 System.out.printf("%d\n",p[i]);
		}
		 return 0;
	}

}

