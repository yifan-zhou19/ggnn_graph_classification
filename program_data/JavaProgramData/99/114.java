package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] x = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		float[] A = new float[4];
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
				x[i] = Integer.parseInt(tempVar2);
			}
			if (x[i] >= 1 && x[i] <= 18)
			{
				a++;
			}
			else if (x[i] >= 19 && x[i] <= 35)
			{
				b++;
			}
			else if (x[i] >= 36 && x[i] <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		A[0] = a * 100.0 / n;
		A[1] = b * 100.0 / n;
		A[2] = c * 100.0 / n;
		A[3] = d * 100.0 / n;
		System.out.printf("1-18: %.2f%%\n",A[0]);
		System.out.printf("19-35: %.2f%%\n",A[1]);
		System.out.printf("36-60: %.2f%%\n",A[2]);
		System.out.printf("60??: %.2f%%\n",A[3]);
	}
}

