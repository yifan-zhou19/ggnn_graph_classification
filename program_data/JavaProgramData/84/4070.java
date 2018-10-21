package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] x = new int[100];
		int max = 0;
		int secondmax = 0;
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
			if (x[i] >= max)
			{
			secondmax = max;
			max = x[i];
			}
			if (x[i] > secondmax && max > x[i])
			{
				secondmax = x[i];
			}

		}
		System.out.printf("%d\n%d\n",max,secondmax);
	}
}

