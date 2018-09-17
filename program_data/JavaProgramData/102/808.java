package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int male1 = 0;
		int female1 = 0;
		int i;
		int j;
		float[] height = new float[41];
		float[] male = new float[41];
		float[] female = new float[41];
		float t;
		char[][] a = new char[41][7];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(a[i], "male") == 0)
			{
				male1 += 1;
				male[male1] = height[i];
			}
			else
			{
				female1 += 1;
				female[female1] = height[i];
			}
		}
		for (i = 1; i < male1; i++)
		{
			for (j = 1; j <= male1 - i; j++)
			{
				if (male[j] > male[j + 1])
				{
					t = male[j];
					male[j] = male [j + 1];
					male[j + 1] = t;
				}
			}
		}
		for (i = 1; i < female1; i++)
		{
			for (j = 1; j <= female1 - i; j++)
			{
				if (female[j] < female[j + 1])
				{
					t = female[j];
					female[j] = female[j + 1];
					female[j + 1] = t;
				}
			}
		}
		for (i = 1; i <= male1; i++)
		{
			System.out.printf("%.2f", male[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 1; i < female1; i++)
		{
			System.out.printf("%.2f", female[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", female[female1]);
		System.out.printf("%.2f", "\n");

		return 0;
	}

}

