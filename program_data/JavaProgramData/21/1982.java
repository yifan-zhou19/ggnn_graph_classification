package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int num = 0;
		float average;
		float n1;
		float m;
		float sn = 0F;
		float[] a = new float[300];
		float[] b = new float[300];
		float max;
		float[] k = new float[300];
		float[] p = new float[300];
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
				a[i] = Float.parseFloat(tempVar2);
			}
			sn = sn + a[i];
		}
		n1 = n;
		average = sn / n1;
		for (i = 0;i < n;i++)
		{
			m = (average - a[i]);
			b[i] = m * m;
		}
		max = b[0];
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{

				if (max >= b[j + 1])
				{
					continue;
				}
				else if (max < b[j + 1])
				{
					max = b[j + 1];
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(k,0,300);
		for (j = 0;j < n;j++)
		{
			if (b[j] == max)
			{
				k[j] = a[j];
				num++;
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (k[i] != 0F)
			{
				p[j] = k[i];
				j++;
			}
		}
		if (j == 1)
		{
			System.out.printf("%.f\n",p[0]);
		}
		if (j > 1)
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%.f,",p[i]);
			}
			System.out.printf("%.f\n",p[j - 1]);
		}


		return;
	}



}

