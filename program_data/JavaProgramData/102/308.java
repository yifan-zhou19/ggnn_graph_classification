package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float temp;
		float[] male = new float[40];
		float[] female = new float[40];
		int n;
		int i;
		int j;
		int p;
		int q;
		String sex = new String(new char[8]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0, p = 0, q = 0; i < n; i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			temp = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(sex, "male") == 0)
			{
				male[p] = temp;
				p++;
			}
			else
			{
				female[q] = temp;
				q++;
			}
		}
		for (i = 0; i < p - 1; i++)
		{
			for (j = 0; j < p - 1 - i; j++)
			{
				if (male[j] > male[j + 1])
				{
					temp = male[j];
					male[j] = male[j + 1];
					male[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < q - 1; i++)
		{
			for (j = 0; j < q - 1 - i; j++)
			{
				if (female[j] < female[j + 1])
				{
						temp = female[j];
						female[j] = female[j + 1];
						female[j + 1] = temp;
				}
			}
		}
		System.out.printf("%.2f", male[0]);
		for (i = 1; i < p; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", male[i]);
		}
		for (i = 0; i < q; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", female[i]);
		}
		return 0;
	}
}

