package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int[] b = new int[6];
		int i;
		int j;
		int sum;
		 for (j = 0;;j++)
		 {
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		if ((a[0] == 0) && (a[1] == 0) && (a[2] == 0) && (a[3] == 0) && (a[4] == 0) && (a[5] == 0))
		{
			break;
		}
		else
		{
		  sum = (a[3] + 12 - a[0]) * 60 * 60 + (a[4] - a[1]) * 60 + (a[5] - a[2]);
		  System.out.printf("%d\n",sum);
		}
		 }
		return 0;
	}

}

