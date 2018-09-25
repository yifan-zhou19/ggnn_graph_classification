package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a = 0;
		int b = 0;
		double[] h = new double[40];
		double[] boy = new double[40];
		double[] girl = new double[40];
		double e;
		char[][] s = new char[40][10];
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(s[i], "male") == 0)
			{
				boy[a] = h[i];
				a++;
			}
			else
			{
				girl[b] = h[i];
				b++;
			}
		}
		for (k = 1;k < a;k++)
		{
			for (i = 0;i < a - k;i++)
			{
				if (boy[i + 1] < boy[i])
				{
					e = boy[i + 1];
					boy[i + 1] = boy[i];
					boy[i] = e;
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%.2lf ", boy[i]);
		}
		for (k = 1;k < b;k++)
		{
			for (i = 0;i < b - k;i++)
			{
				if (girl[i + 1] > girl[i])
				{
					e = girl[i + 1];
					girl[i + 1] = girl[i];
					girl[i] = e;
				}
			}
		}
		for (i = 0;i < b - 1;i++)
		{
			System.out.printf("%.2lf ", girl[i]);
		}
		System.out.printf("%.2lf", girl[b - 1]);
		return 0;
	}
}

