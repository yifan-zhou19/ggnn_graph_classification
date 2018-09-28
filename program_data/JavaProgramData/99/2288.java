package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int j;
		int i;
		int c = 0;
		float[] b = {0F, 0F, 0F, 0F};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		while (c < n)
		{
			if (0 < a[c] && a[c] < 19)
			{
				b[0] = b[0] + 1;
			}
			else if (18 < a[c] && a[c] < 36)
			{
				b[1] = b[1] + 1;
			}
			else if (35 < a[c] && a[c] < 61)
			{
				b[2] = b[2] + 1;
			}
			else
			{
				b[3] = b[3] + 1;
			}
			c++;
		}
		for (i = 0;i < 4;i++)
		{
			b[i] = b[i] / n * 100;
		}
		System.out.printf("1-18: %.2f%\n19-35: %.2f%\n36-60: %.2f%\n60??: %.2f%\n",b[0],b[1],b[2],b[3]);
	}



}

