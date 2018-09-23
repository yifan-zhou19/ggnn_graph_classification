package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int j;
		String s = new String(new char[20]);
		double[] m = new double[1000];
		double[] w = new double[1000];
		double t = 1.50;
		double z;
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
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t = Double.parseDouble(tempVar3);
			}
			if (s.charAt(0) == 'm')
			{
				m[a] = t;
				a++;
			}
			else if (s.charAt(0) == 'f')
			{
				w[b] = t;
				b++;
			}
		}



		for (i = 1;i < a;i++)
		{
			for (j = 0;j < a;j++)
			{
				if (m[j] < m[j + 1])
				{
					z = m[j];
					m[j] = m[j + 1];
					m[j + 1] = z;
				}
			}
		}

		for (i = 1;i < b;i++)
		{
			for (j = 0;j < b;j++)
			{
				if (w[j] < w[j + 1])
				{
					z = w[j];
					w[j] = w[j + 1];
					w[j + 1] = z;
				}
			}
		}


		for (i = a - 1;i >= 0;i--)
		{
			System.out.printf("%.2lf ",m[i]);
		}


		for (i = 0;i < b;i++)
		{
			if (i < b - 1)
			{
				System.out.printf("%.2lf ",w[i]);
			}
			else if (i == b - 1)
			{
				System.out.printf("%.2lf",w[i]);
			}
		}

		return 0;
	}

}

