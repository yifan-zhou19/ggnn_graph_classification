package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 0;k < m;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			float s = 0F;
			float[] num = new float[(2 * n + 2)];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *nm=(float*) malloc(sizeof(float)*(n+1));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			float nm = (float) malloc((Float.SIZE / Byte.SIZE) * (n + 1));
			num[1] = 1F;
			num[2] = 1F;
			for (i = 3;i <= 2 * n + 1;i++)
			{
				num[i] = num[i - 2] + num[i - 1];
			}
			for (i = 1;i <= n;i++)
			{
				nm[i] = num[i + 2] / num[i + 1];
			}
			for (i = 1;i <= n;i++)
			{
					s += nm[i];
			}
			System.out.printf("%.3f\n",s);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(num);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(nm);
		}
		return 0;
	}
}

