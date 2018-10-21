package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sex = new String(new char[7]);
		int i;
		int n;
		int j = 0;
		int k = 0;
		int h;
		float[] male = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		float[] female = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		float height = 0.00F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (sex.charAt(0) == 'm')
			{
				male[j++] = height;
			}
			else
			{
				female[k++] = height;
			}
		}
		for (i = 0; i <= j - 1; i++)
		{
			for (h = i + 1; h <= j - 1; h++)
			{
				if (male[i] > male[h])
				{
					height = male[i];
					male[i] = male[h];
					male[h] = height;
				}
			}
		}
		for (i = 0; i <= j - 1; i++)
		{
			System.out.printf("%.2f", male[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 0; i <= k - 1; i++)
		{
			for (h = i + 1; h <= k - 1; h++)
			{
				if (female[i] < female[h])
				{
					height = female[i];
					female[i] = female[h];
					female[h] = height;
				}
			}
		}
		for (i = 0; i <= k - 2; i++)
		{
			System.out.printf("%.2f", female[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", female[k - 1]);
		return 0;
	}


}

