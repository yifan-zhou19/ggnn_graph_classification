package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[41][7];
		String t = new String(new char[7]);
		double[] h = new double[41];
		double tmp;
		for (i = 1;i <= n;i++)
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

		for (i = n;i > 1;i--)
		{
			for (j = 1;j < i;j++)
			{
				if ((s[j][0] == 'm' && s[j + 1][0] == 'm' && h[j] > h[j + 1]) || (s[j][0] == 'f' && s[j + 1][0] == 'f' && h[j] < h[j + 1]) || (s[j][0] == 'f' && s[j + 1][0] == 'm'))
				{
					t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;
					tmp = h[j];
					h[j] = h[j + 1];
					h[j + 1] = tmp;
				}
			}
		}
	   tmp = 1;
		for (i = 1;i <= n;i++)
		{
			if (tmp == 1)
			{
				System.out.printf("%.2lf",h[i]);
				tmp++;
			}
			else
			{
				System.out.printf(" %.2lf",h[i]);
			}
		}

		return 0;
	}



}

