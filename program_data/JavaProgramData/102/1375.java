package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a;
		int b;
		int x;
		int n;
		String s = new String(new char[10]);
		float h;
		float[] m = new float[1000];
		float[] f = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
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
							h = Float.parseFloat(tempVar3);
						}
						x = strcmp(s,"male");
						if (x == 0)
						{
								m[a] = h;
								a++;
						}
						else
						{
							f[b] = h;
							b++;
						}
		}
		for (i = 0;i < a;i++)
		{
						for (j = 0;j < (a - 1);j++)
						{
											if (m[j] > m[j + 1])
											{
														   h = m[j];
														   m[j] = m[j + 1];
														   m[j + 1] = h;
											}
						}
		}
		for (i = 0;i < b;i++)
		{
						for (j = 0;j < (b - 1);j++)
						{
											if (f[j] < f[j + 1])
											{
														   h = f[j];
														   f[j] = f[j + 1];
														   f[j + 1] = h;
											}
						}
		}
		if (a == 0)
		{
				System.out.printf("%.2f",f[0]);
				for (i = 1;i < b;i++)
				{
					System.out.printf(" %.2f",f[i]);
				}
		}
		if (b == 0)
		{
				System.out.printf("%.2f",m[0]);
				for (i = 1;i < a;i++)
				{
					System.out.printf(" %.2f",m[i]);
				}
		}
		else
		{
			System.out.printf("%.2f",m[0]);
			for (i = 1;i < a;i++)
			{
				System.out.printf(" %.2f",m[i]);
			}
			for (i = 0;i < b;i++)
			{
				System.out.printf(" %.2f",f[i]);
			}
		}
	}

}

