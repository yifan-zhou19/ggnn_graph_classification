package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int q;
		char[][] sex = new char[42][10];
		double[] height = new double[42];
		double[] male = new double[42];
		double[] female = new double[42];
		double x;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * h;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		h = height;
		for (i = 0;i < n;i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			*h++ = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}
		h = height;
		for (i = 0;i < n;i++)
		{
			if (sex[i][0] == 'm')
			{
				male[j] = height[i];
				j++;
			}
			else
			{
				female[k] = height[i];
				k++;
			}
		}
		for (i = 1;i <= j - 1;i++)
		{
			for (q = 0;q <= j - i - 1;q++)
			{
				if (male[q] > male[q + 1])
				{
					x = male[q];
					male[q] = male[q + 1];
					male[q + 1] = x;
				}
			}
		}
		for (i = 1;i <= k - 1;i++)
		{
			for (q = 0;q <= k - i - 1;q++)
			{
				if (female[q] < female[q + 1])
				{
					x = female[q];
					female[q] = female[q + 1];
					female[q + 1] = x;
				}
			}
		}
		System.out.printf("%.2f", male[0]);
		for (i = 1;i <= j - 1;i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", male[i]);
		}
		for (i = 0;i <= k - 1;i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", female[i]);
		}
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

