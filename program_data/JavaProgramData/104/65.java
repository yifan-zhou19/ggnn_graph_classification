package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[100];
		int[] y = new int[100];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			x[i] = x[i - 1] / 2;
			if (x[i] == 1)
			{
				break;
			}
		}
		for (j = 1;;j++)
		{
			y[j] = y[j - 1] / 2;
			for (k = 0;k <= i;k++)
			{
				if (y[0] == x[k] || y[j] == x[k])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto out;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	out:
	System.out.printf("%d",x[k]);
		return 0;
	}


}

