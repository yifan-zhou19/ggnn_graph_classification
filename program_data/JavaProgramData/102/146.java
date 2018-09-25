package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[40][10];
	public static float[] b = new float[40];
	public static char temp;
	public static float t;
	public static float s1;
	public static float s2;
	public static int count = 0;
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		for (i = 0; i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			//scanf("%s",a[i]);
			//scanf("%f",b[i]);
		}
		for (i = 0; i < n;i++)
		{
			if (a[i][0] == 'm')
			{
				count++;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1; j < n;j++)
			{
				if (a[i][0] < a[j][0])
				{
					for (k = 0;k < 10;k++)
					{
						temp = a[i][k];
						a[i][k] = a[j][k];
						a[j][k] = temp;
					}
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}

			for (i = 0; i < count - 1; i++)
			{
				for (j = i + 1; j < count; j++)
				{
					if (b[i] > b[j])
					{
						s1 = b[i];
						b[i] = b[j];
						b[j] = s1;
					}
				}
			}
				for (i = count; i < n - 1; i++)
				{
					for (j = i + 1; j < n; j++)
					{
						if (b[i] < b[j])
						{
							s2 = b[i];
							b[i] = b[j];
							b[j] = s2;
						}
					}
				}
					for (i = 0;i < n - 1;i++)
					{
						System.out.printf("%.2f ",b[i]);
					}
						System.out.printf("%.2f\n",b[n - 1]);
					return 0;
	}

}

