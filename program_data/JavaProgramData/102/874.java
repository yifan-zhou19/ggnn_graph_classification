package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int b = 0;
	int g = 0;
	float[] m = new float[40];
	float[] f = new float[40];
	float e;
	String x = new String(new char[10]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			if (x.charAt(0) == 'm')
			{

						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 m[b] = Float.parseFloat(tempVar3);
						 }
						 b++;

			}
				   if (x.charAt(0) == 'f')
				   {

						 String tempVar4 = ConsoleInput.scanfRead();
						 if (tempVar4 != null)
						 {
							 f[g] = Float.parseFloat(tempVar4);
						 }
						 g++;

				   }
	}

	for (int j = 0;j < b;j++)
	{
			for (int k = 0;k < b;k++)
			{
					if (m[j] > m[k] && j < k)
					{
									   e = m[j];
									   m[j] = m[k];
									   m[k] = e;
					}


			}


	}
	for (int j = 0;j < g;j++)
	{
			for (int k = 0;k < g;k++)
			{
					if (f[j] > f[k] && j > k)
					{
									   e = f[j];
									   f[j] = f[k];
									   f[k] = e;
					}


			}


	}
		   for (int j = 0;j < b;j++)
		   {
	System.out.printf("%.2f ",m[j]);

		   }
	for (int j = 0;j < g;j++)
	{
	if (j == g - 1)
	{
			System.out.printf("%.2f",f[j]);
	}
	else
	{
	System.out.printf("%.2f ",f[j]);
	}
	}
	int hou;
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		hou = Integer.parseInt(tempVar5);
	}
	return 0;
	}

}

