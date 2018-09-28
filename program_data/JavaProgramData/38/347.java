package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct shu
	//	{
	//		int n;
	//		double x[101];
	//	}
	//	pp[100];
			int k;
			int i;
			int j;
		double a1 = 0;
		double a2 = 0;
			double s = 0;
			double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			s = 0;
			S = 0;
			a1 = 0;
			a2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pp[i].n = tempVar2;
			}
			for (j = 0;j < pp[i].n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					pp[i].x[j] = tempVar3;
				}
				a1 += pp[i].x[j];
			}
			a2 = a1 / pp[i].n;
			for (j = 0;j < pp[i].n;j++)
			{
				s += (pp[i].x[j] - a2) * (pp[i].x[j] - a2);
			}
			S = Math.sqrt(s / pp[i].n);
			System.out.printf("%.5f\n",S);
		}
		return 0;
	}





}

