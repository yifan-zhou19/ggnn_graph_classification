package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		char[][] a = new char[40][7];
		float[] b = new float[40];
		float[] b1 = new float[40];
		float[] b2 = new float[40];
		float t;
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
			a[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Float.parseFloat(tempVar3);
		}
		}
		p = 0;
		q = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == 'm')
			{
				b1[p] = b[i];
				p++;
			}
			else
			{
				b2[q] = b[i];
				q++;
			}
		}
		for (j = 0;j < p - 1;j++)
		{
			for (i = 0;i < p - j - 1;i++)
			{
				if (b1[i] > b1[i + 1])
				{
					t = b1[i];
					b1[i] = b1[i + 1];
					b1[i + 1] = t;
				}
			}
		}
		for (j = 0;j < q - 1;j++)
		{
			for (i = 0;i < q - j - 1;i++)
			{
				if (b2[i] < b2[i + 1])
				{
					t = b2[i];
					b2[i] = b2[i + 1];
					b2[i + 1] = t;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
		System.out.printf("%.2f ",b1[i]);
		}
		for (i = 0;i < q - 1;i++)
		{
		System.out.printf("%.2f ",b2[i]);
		}
		System.out.printf("%.2f",b2[q - 1]);
	}
}

