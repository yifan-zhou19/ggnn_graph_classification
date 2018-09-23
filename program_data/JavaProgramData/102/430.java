package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		char[][] zfc = new char[100][20];
		String ex = new String(new char[20]);
		double[] h = new double[100];
		double mi;
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
				zfc[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if ((strcmp(zfc[i],"female") == 0 && strcmp(zfc[i + 1],"male") == 0) || (strcmp(zfc[i],"male") == 0 && strcmp(zfc[i + 1],"male") == 0 && h[i] > h[i + 1]) || (strcmp(zfc[i],"female") == 0 && strcmp(zfc[i + 1],"female") == 0 && h[i] < h[i + 1]))
				{
					ex = zfc[i];
					zfc[i] = zfc[i + 1];
					zfc[i + 1] = ex;
					mi = h[i];
					h[i] = h[i + 1];
					h[i + 1] = mi;
				}
			}
		}
		System.out.printf("%.2lf",h[0]);
		for (i = 1;i <= n - 1;i++)
		{
			System.out.printf(" %.2lf",h[i]);
		}
		return 0;
	}

}

