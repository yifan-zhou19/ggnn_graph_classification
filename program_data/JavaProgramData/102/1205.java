package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int m;
		float[] height = new float[50];
		float[] male = new float[50];
		float[] female = new float[50];
		float t;
		char[][] gender = new char[50][10];
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
				gender[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				height[i] = Float.parseFloat(tempVar3);
			}
			if (strcmp(gender[i], "male") == 0)
			{
				male[a] = height[i];
				a++;
			}
			else
			{
				female[b] = height[i];
				b++;
			}
		}
		m = 10000;
		while (m > 0 && a > 1)
		{
			for (i = 1; i < a; i++)
			{
				if (male[i] < male[i - 1])
				{
					t = male[i];
					male[i] = male[i - 1];
					male[i - 1] = t;
				}
				m--;
			}
		}
		m = 10000;
		while (m > 0 && b > 1)
		{
			for (i = 1; i < b; i++)
			{
				if (female[i] > female[i - 1])
				{
					t = female[i];
					female[i] = female[i - 1];
					female[i - 1] = t;
				}
				m--;
			}
		}
		for (i = 0; i < a; i++)
		{
			System.out.printf("%.2f ", male[i]);
		}
		for (i = 0; i < b - 1; i++)
		{
			System.out.printf("%.2f ", female[i]);
		}
		System.out.printf("%.2f", female[b - 1]);
		return 0;
	}
}

