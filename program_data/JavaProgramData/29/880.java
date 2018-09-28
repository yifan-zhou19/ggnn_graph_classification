package <missing>;

public class GlobalMembers
{
	public static float yzs(int n)
	{
		int i;
		float[] b = new float[100];
		float[] f = new float[100];
		float result = 0F;

		b[0] = 1F;
		b[1] = 2F;
		for (i = 2;i < n + 1;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
		}

		for (i = 0;i < n;i++)
		{
			f[i] = b[i + 1] / b[i];
			result += f[i];
		}
		return result;
	}
	public static int Main()
	{
		int n;
		int a;
		int i;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%.3f\n",yzs(sz[i]));
		}
		return 0;
	}


}

