package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sex = new char[40][6];
		float[] height = new float[40];
		float[] Female = new float[40];
		float[] Male = new float[40];
		float temp1;
		float temp2;
		int i;
		int p;
		int j = 0;
		int k = 0;
		int n;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0; i < n; i++)
		{
			if (sex[i][0] == 'f')
			{
				Female[j] = height[i];
				j++;
			}
			else if (sex[i][0] == 'm')
			{
				Male[k] = height[i];
				k++;
			}
		}
		// ??????



		for (i = 0; i < k - 1; i++)
		{
			for (p = 0; p < k - 1 - i; p++)
			{
				if (Male[p] > Male[p + 1])
				{
					temp1 = Male[p];
					Male[p] = Male[p + 1];
					Male[p + 1] = temp1;
				}
			}
		}
		for (i = 0; i < j - 1; i++)
		{
			for (p = 0; p < j - 1 - i; p++)
			{
				if (Female[p] < Female[p + 1])
				{
					temp2 = Female[p];
					Female[p] = Female[p + 1];
					Female[p + 1] = temp2;
				}
			}
		}
		// ??,?????

		for (i = 0; i < k; i++)
		{
			System.out.printf("%.2f", Male[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 0; i < j; i++)
		{
			if (i < j - 1)
			{
				System.out.printf("%.2f", Female[i]);
				System.out.printf("%.2f", " ");
			}
			else
			{
				System.out.printf("%.2f", Female[i]);
			}
		}
		// ???????????



		return 0;
	}

}

