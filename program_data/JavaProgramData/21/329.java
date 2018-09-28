package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int tem;
		int[] ori = new int[301];
		float sum = 0F;
		float E = 0F;

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
				ori[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n - i;j++)
			{
				if (ori[j] < ori[j - 1])
				{
					tem = ori[j - 1];
					ori[j - 1] = ori[j];
					ori[j] = tem;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += ori[i];
		}
		E = sum / n;
		if (0.001 > Math.abs((float)(ori[0] + ori[n - 1]) / 2 - E))
		{
			 System.out.printf("%d,%d\n",ori[0],ori[n - 1]);
		}
		else if (E < (ori[0] + ori[n - 1]) / 2.0)
		{
			System.out.printf("%d\n",ori[n - 1]);
		}
			 else
			 {
				 System.out.printf("%d\n",ori[0]);
			 }
	}
}

