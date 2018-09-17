package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[8]);
		float[] male = new float[44];
		float[] female = new float[44];
		float temple;
		int n;
		int i = 0;
		int j = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0; k < n; k++)
		{
			System.in.read();
			a = tangible.StringFunctions.changeCharacter(a, 0, System.in.read());
			for (int l = 0; a.charAt(l) != ' '; l++)
			{
				a = tangible.StringFunctions.changeCharacter(a, l + 1, System.in.read());
			}
			if (a.charAt(0) == 'm')
			{
				male[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				i++;
			}
			else
			{
				female[j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				j++;
			}
		}
		for (int k = 0; k < i; k++)
		{
			for (int l = 1; l < i - k; l++)
			{
				if (male[l] < male[l - 1])
				{
					temple = male[l];
					male[l] = male[l - 1];
					male[l - 1] = temple;
				}
			}
		}
		for (int k = 0; k < j; k++)
		{
			for (int l = 1; l < j - k; l++)
			{
				if (female[l] > female[l - 1])
				{
					temple = female[l];
					female[l] = female[l - 1];
					female[l - 1] = temple;
				}
			}
		}
		System.out.printf("%.2f", male[0]);
		for (int k = 1; k < i; k++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", male[k]);
		}
		for (int k = 0; k < j; k++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", female[k]);
		}
		return 0;
	}

}

