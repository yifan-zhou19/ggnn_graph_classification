package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int j = 0;
		int k = 0;
		int m;
		int n;
		double[] man = new double[50];
		double[] woman = new double[50];
		double[] r = new double[50];
		double e;
		char[][] sx = new char[50][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 sx[i] = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 r[i] = Double.parseDouble(tempVar3);
		 }
		}
			for (i = 0;i < num;i++)
			{
			if (sx[i][0] == 'm')
			{
			   man[j] = r[i];
			   j++;
			}
			else
			{
			   woman[k] = r[i];
			   k++;
			}
			}
		for (i = 1;i <= j;i++)
		{
			for (m = 0;m < j - i;m++)
			{
				if (man[m] > man[m + 1])
				{
				   e = man[m + 1];
				   man[m + 1] = man[m];
				   man[m] = e;
				}
			}
		}
		for (i = 1;i <= k;i++)
		{
			for (n = 0;n < k - i;n++)
			{
				if (woman[n] < woman[n + 1])
				{
					e = woman[n + 1];
					woman[n + 1] = woman[n];
					woman[n] = e;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2lf ",man[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.2lf ",woman[i]);
		}
		 System.out.printf("%.2lf",woman[i]);
	return 0;
	}
}

