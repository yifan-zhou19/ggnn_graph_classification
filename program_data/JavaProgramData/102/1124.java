package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][10];
		String tmp = new String(new char[10]);
		double[] h = new double[100];
		double tmp2;
		int n;
		int i;
		int j;
		int first = 1;
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
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j + i < n - 1;j++)
			{
				if (h[j] > h[j + 1])
				{
				   tmp2 = h[j];
				   h[j] = h[j + 1];
				   h[j + 1] = tmp2;
				   tmp = s[j];
				   s[j] = s[j + 1];
				   s[j + 1] = tmp;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][0] == 'm')
			{
			   if (first == 0)
			   {
				  System.out.print(" ");
			   }
			   first = 0;
			   System.out.printf("%.2lf",h[i]);
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (s[i][0] == 'f')
			{
			   System.out.printf(" %.2lf",h[i]);
			}
		}
		return 0;
	}

}

