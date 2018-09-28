package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			double s = 0;
			double squs = 0;
			int a = 0;
			int j = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < a;j++)
			{
				double num = 0;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num = Double.parseDouble(tempVar3);
				}
				s = s + num;
				squs = squs + (num * num);
			}
			double ave = 0;
			ave = s / a;
			double ss = 0;
			ss = Math.sqrt((squs - (2 * ave * s) + (a * ave * ave)) / a);
			System.out.printf("%.5lf\n",ss);
		}
		return 0;
	}

}

