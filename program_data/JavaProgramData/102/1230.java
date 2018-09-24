package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] male = new double[50];
		double[] female = new double[50];
		double height;
		double tep;
		int n;
		int i;
		int j;
		int m = 0;
		int f = 0;
		String ch = new String(new char[7]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n ; i++)
		{
			 System.in.read();
			 cin.getline(ch, 7, ' '); //?????????????cin?getline??????height??????????cin??
			 height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 if (ch.charAt(0) == 'm')
			 {
				 male[m++] = height;
			 }
			 else
			 {
				 female[f++] = height;
			 }
		}
		for (i = 0; i < m - 1; i++)
		{
			for (j = 0; j < m - 1 - i; j++)
			{
				  if (male[j] > male[j + 1])
				  {
					 tep = male[j];
					 male[j] = male[j + 1];
					 male[j + 1] = tep;
				  }
			}
		}
		for (i = 0; i < f - 1; i++)
		{
			for (j = i + 1; j < f; j++)
			{
				if (female[i] < female[j])
				{
					tep = female[i];
					female[i] = female[j];
					female[j] = tep;
				}
			}
		}
		System.out.printf("%.2f", male[0]);
		for (i = 1; i < m; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", male[i]);
		}
		for (i = 0; i < f; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", female[i]);
		}

			return 0;
	}

}

