package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float F_num = int n;
		int m;
		int i = 0;
		int j = 1;
		int[] c = new int[1000];
		float sum = 0.0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (i < m)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		i = 0;
		while (i < m)
		{
			while (j < c[i] + 1)
			{
				sum += (F_num(j + 1) / F_num(j));
				//printf("%lf\n",F_num(j+1)/F_num(j));
				j++;
			}
			System.out.printf("%.3f\n",sum);
			sum = 0.0F;
			j = 1;
			i++;
		}

	}

	public static float F_num(int n)
	{
		int a = 1;
		int b = 0;
		int c;
		int i = 0;
		while (i < n + 1)
		{
			c = a + b;
			a = b;
			b = c;
			i++;
		}
		return (c * 1.0);

	}
}

