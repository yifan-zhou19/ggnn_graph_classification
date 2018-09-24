package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int p;
		double[] arr = new double[40];
		double[] h1 = new double[40];
		double[] h2 = new double[40];
		double t;
		String[] s = {"male", "female"};
		char[][] s1 = new char[40][10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			s1[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			arr[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(s1[i],s[0]) == 0)
			{
				h1[j] = arr[i];
				j++;
			}
			else
			{
				h2[k] = arr[i];
				k++;
			}
		}
		for (i = 1;i < j;i++)
		{
			for (p = 0;p < j - i;p++)
			{
				if (h1[p] > h1[p + 1])
				{
					t = h1[p];
					h1[p] = h1[p + 1];
					h1[p + 1] = t;
				}
			}
		}
		for (i = 1;i < k;i++)
		{
			for (p = 0;p < k - i;p++)
			{
				if (h2[p] < h2[p + 1])
				{
					t = h2[p];
					h2[p] = h2[p + 1];
					h2[p + 1] = t;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2f", h1[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%.2f", h2[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", h2[k - 1]);
		return 0;
	}
}

