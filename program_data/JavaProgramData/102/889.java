package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float[] sg = new float[45];
		float e;
		char[][] xb = new char[45][8];
		String f = new String(new char[8]);
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
				  xb[i] = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  sg[i] = Float.parseFloat(tempVar3);
			  }
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
					if (xb[i][0] < xb[i + 1][0] || (xb[i][0] == xb[i + 1][0] && xb[i][0] == 'f' && sg[i] < sg[i + 1]) || (xb[i][0] == xb[i + 1][0] && xb[i][0] == 'm' && sg[i]> sg[i + 1]))
					{
							  e = sg[i];
							  sg[i] = sg[i + 1];
							  sg[i + 1] = e;
							  f = xb[i];
							  xb[i] = xb[i + 1];
							  xb[i + 1] = f;
					}
			}
		}
		System.out.printf("%.2f",sg[0]);
		for (i = 1;i < n;i++)
		{
						 System.out.printf(" %.2f",sg[i]);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

