package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int i;
		int n;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int j;
			float[] a = new float[100];
			double b = 0.0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Float.parseFloat(tempVar3);
				}

				b += a[j];
			}
			b = (double)b / n;
			double s = 0;
			for (j = 0;j < n;j++)
			{

				s += (a[j] - b) * (a[j] - b);
			}
			s = (double)(s / n);
			s = Math.sqrt(s);
			System.out.printf("%.5f\n",s);
		}

	}


}

