package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int s = 0;
		int c;
		String a = new String(new char[10]);
		final String d = "male";
		double[] m = new double[42];
		double[] k = new double[42];
		double h;
		double f;
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (strcmp(a,d) == 0)
			{
				m[j] = h;
				j++;
			}
			else
			{
				k[s] = h;
				s++;
			}
		}
		for (c = 0;c < j;c++)
		{
			for (i = 0;i < j - 1;i++)
			{
				if (m[i] > m[i + 1])
				{
					f = m[i];
					m[i] = m[i + 1];
					m[i + 1] = f;
				}
			}
		}
		 for (c = 0;c < s;c++)
		 {
			for (i = 0;i < s - 1;i++)
			{
				if (k[i] < k[i + 1])
				{
					f = k[i];
					k[i] = k[i + 1];
					k[i + 1] = f;
				}
			}
		 }
		 for (i = 0;i < j;i++)
		 {
			 System.out.printf("%.2lf ",m[i]);
		 }
		 for (i = 0;i < s - 1;i++)
		 {
			 System.out.printf("%.2lf ",k[i]);
		 }
		 System.out.printf("%.2lf",k[s - 1]);
		 return 0;
	}
}

