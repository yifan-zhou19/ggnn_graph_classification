package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		float[][] a = new float[100][2];
		float max;
		float distance;
		float b;
		float c;
		float d;
		float e;
		int i;
		int j;
		int n;
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
				a[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Float.parseFloat(tempVar3);
			}
		}
		max = 0F;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				e = a[i][0] - a[j][0];
				c = Math.pow(e,2);
				d = Math.pow((a[i][1] - a[j][1]),2);
				b = c + d;
				distance = Math.sqrt(b);
				if (max < distance)
				{
					max = distance;
				}
			}
		}
		System.out.printf("%.4f",max);
	}
}

