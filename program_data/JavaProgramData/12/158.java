package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int a;
		int[] result = new int[20];
		double[] num = new double[15];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[0] = Double.parseDouble(tempVar);
		}
		for (a = 1;num[0] != -1;a++)
		{
			for (i = 1;;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i] = Double.parseDouble(tempVar2);
				}
				if (num[i] == 0)
				{
					break;
				}
			}
			for (j = 0;j < i;j++)
			{
				for (m = 0;m <= i;m++)
				{
				if (num[m] / num[j] == 2)
				{
					result[a]++;
				}
				}
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[0] = Double.parseDouble(tempVar3);
			}
		}
		for (j = 1;j < a;j++)
		{
			System.out.printf("%d\n",result[j]);
		}
		return 0;
	}






}

