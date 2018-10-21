package <missing>;

public class GlobalMembers
{
	public static void bian(int n)
	{
	float[] a = new float[4];
	int[] s = new int[100];
	int i;
	for (i = 0;i < n;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[i] = Integer.parseInt(tempVar);
		}
		if (s[i] < 19)
		{
			a[0]++;
		}
		else if (s[i] < 36)
		{
			a[1]++;
		}
		else if (s[i] < 61)
		{
			a[2]++;
		}
		else
		{
			a[3]++;
		}
	}
	for (i = 0;i < 4;i++)
	{
		a[i] = a[i] / n;
		a[i] = a[i] * 100;
	}
		System.out.printf("1-18: %.2f%%\n",a[0]);
		System.out.printf("19-35: %.2f%%\n",a[1]);
		System.out.printf("36-60: %.2f%%\n",a[2]);
		System.out.printf("60??: %.2f%%\n",a[3]);
	}
	public static int Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	bian(n);
	return 0;
	}





}

