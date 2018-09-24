package <missing>;

public class GlobalMembers
{
	public static void bubblesort1(float[] a, int n)
	{
		int i;
		int j;
		float tmp;
		for (i = 0;i < n - 1;i++)
		{
		for (j = i + 1;j < n;j++)
		{
			if (a[i] > a[j])
			{
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		}
	}
	public static void bubblesort2(float[] a, int n)
	{
		int i;
		int j;
		float tmp;
		for (i = 0;i < n - 1;i++)
		{
		for (j = i + 1;j < n;j++)
		{
			if (a[i] < a[j])
			{
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		}
	}
	public static int Main()
	{
		int n;
		String ss = new String(new char[10]);
		float height;
		float[] male = new float[40];
		float[] female = new float[40];
		int c_m = 0;
		int c_f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ss = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				height = Float.parseFloat(tempVar3);
			}
			if (ss.charAt(0) == 'm')
			{
				male[c_m] = height;
				c_m++;
			}
			else
			{
				female[c_f] = height;
				c_f++;
			}
		}
		bubblesort1(male, c_m);
		bubblesort2(female, c_f);
		for (int i = 0;i < c_m;i++)
		{
			System.out.printf("%.2f ",male[i]);
		}
		for (int j = 0;j < c_f - 1;j++)
		{
			System.out.printf("%.2f ",female[j]);
		}
		System.out.printf("%.2f",female[c_f - 1]);
		//scanf("%s",ss);
		return 0;
	}

}

