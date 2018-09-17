package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int n;
	int m = 0;
	int w = 0;
	float[] b = new float[40];
	float[] g = new float[40];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
		String sex = new String(new char[7]);
		for (int j = 0;j < 7;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				sex = tangible.StringFunctions.changeCharacter(sex, j, tempVar2);
			}
			if (sex.charAt(j) == ' ')
			{
				if (j == 4)
				{
					a = 1;
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[m] = Float.parseFloat(tempVar3);
					}
					m++;
					break;
				}
				if (j == 6 || i != n - 1)
				{
					a = 0;
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						g[w] = Float.parseFloat(tempVar4);
					}
					w++;
					break;
				}
				else
				{
					a = 0;
					String tempVar5 = ConsoleInput.scanfRead();
					if (tempVar5 != null)
					{
						g[w] = Float.parseFloat(tempVar5);
					}
					w++;
					break;
				}
			}
		}
	}
	for (int i = 0;i < m;i++)
	{
		for (int j = 0;j < i;j++)
		{
			if (b[j] > b[i])
			{
			float t = b[j];
			b[j] = b[i];
			b[i] = t;
			}
		}
	}
	for (int i = 0;i < w;i++)
	{
		for (int j = 0;j < i;j++)
		{
			if (g[j] < g[i])
			{
			float t = g[j];
			g[j] = g[i];
			g[i] = t;
			}
		}
	}
	for (int i = 0;i < m;i++)
	{
	System.out.printf("%.2f ",b[i]);
	}
	System.out.printf("%.2f",g[0]);
	for (int i = 1;i < w;i++)
	{
	System.out.printf(" %.2f",g[i]);
	}

	}
}

