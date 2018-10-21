package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sz = new int[100];
		float c;
		float d;
		float[] sum = new float[100];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			int a = 1;
			int b = 1;
			int s = 0;
			float k = 0F;
			sum[i] = 0F;
			for (j = 0;j < sz[i];j++)
			{
				s = a;
				a = b;
				b = s + b;
				k = (float)b / a;
				sum[i] += k;
			}

			System.out.printf("%.3f\n",sum[i]);
		}
		return 0;
	}
}

