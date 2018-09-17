package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		char[][] s = new char[50][50];
		String e_s = new String(new char[10]);
		double[] h = new double[50];
		double e_h;
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
		for (k = 1;k <= n;k++)
		{
						  for (i = 0;i < n - k;i++)
						  {
											 if ((s[i][0] == 'f' && s[i + 1][0] == 'm') || (s[i][0] == 'm' && s[i + 1][0] == 'm' && h[i] > h[i + 1]) || (s[i][0] == 'f' && s[i + 1][0] == 'f' && h[i] < h[i + 1]))
											 {
														  e_s = s[i];
														  s[i] = s[i + 1];
														  s[i + 1] = e_s;
														  e_h = h[i];
														  h[i] = h[i + 1];
														  h[i + 1] = e_h;
											 }
						  }
		}

		System.out.printf("%.2lf",h[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %.2lf",h[i]);
		}
		   return 0;
	}

}

