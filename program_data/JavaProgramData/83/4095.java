package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int numb;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int N = 0;
		int y;
		int M = 0;
		int m = 65535;
		float[] c = new float[100];
		float S = 0F;
		float t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			numb = Integer.parseInt(tempVar);
		}
		for (i = 0;i < numb;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			N = N + a[i];
		}
		for (i = 0;i < numb;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] < 101 && b[i]>89)
			{
			c[i] = 4.0F;
			}
			if (b[i] < 90 && b[i]>84)
			{
			c[i] = 3.7F;
			}
			if (b[i] < 85 && b[i]>81)
			{
			c[i] = 3.3F;
			}
			if (b[i] < 82 && b[i]>77)
			{
			c[i] = 3.0F;
			}
			if (b[i] < 78 && b[i]>74)
			{
			c[i] = 2.7F;
			}
			if (b[i] < 75 && b[i]>71)
			{
			c[i] = 2.3F;
			}
			if (b[i] < 72 && b[i]>67)
			{
			c[i] = 2.0F;
			}
			if (b[i] < 68 && b[i]>63)
			{
			c[i] = 1.5F;
			}
			if (b[i] < 64 && b[i]>59)
			{
			c[i] = 1.0F;
			}
			if (b[i] < 60 && b[i] >= 0)
			{
			c[i] = 0F;
			}
			S = c[i] * a[i] + S;
		}
		t = S / N;
		System.out.printf("%.2f",t);
		return 0;
	}
}

