package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int re(int w, int r, int time);
	public static void Main(String[] args)
	{
		int n;
		int n1;
		int i;
		int j;
		double[] sz = new double[100];
		double x = 0;
		double s = 0;
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
				n1 = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n1;j++)
			{
				x += sz[j];
			}
			x /= n1;
			for (j = 0;j < n1;j++)
			{
				s += (sz[j] - x) * (sz[j] - x);
			}
			s /= n1;
			s = Math.pow(s,0.5);
			System.out.printf("%.5f\n",s);
			x = 0;
			s = 0;
		}
	}

}

