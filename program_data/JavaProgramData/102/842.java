package <missing>;

public class GlobalMembers
{
	//*************************
	//*  ??????? 
	//*  ????? 
	//*  ???1200012941 
	//*  ???2012?9?24? 
	//*************************
	public static int Main()
	{
		int i;
		int j;
		int n;
		int s = 0;
		int r = 0;
		String sex = new String(new char[10]);
		double height;
		double[] male = new double[40];
		double[] female = new double[40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(sex, "male") == 0)
			{
				male[s++] = height;
			}
			else
			{
				female[r++] = height;
			}
		}
		double temp;
		for (i = 0; i < s - 1; i++)
		{
		 for (j = 0; j < s - 1 - i; j++)
		 {
			 if (male[j] > male[j + 1])
			 {
				 temp = male[j];
				 male[j] = male[j + 1];
				 male[j + 1] = temp;
			 }
		 }
		}
		for (i = 0; i < s; i++)
		{
			System.out.printf("%.2f", male[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 0; i < r - 1; i++)
		{
		 for (j = 0; j < r - 1 - i; j++)
		 {
			 if (female[j] < female[j + 1])
			 {
				 temp = female[j];
				 female[j] = female[j + 1];
				 female[j + 1] = temp;
			 }
		 }
		}
		for (i = 0; i < r - 1; i++)
		{
			 System.out.printf("%.2f", female[i]);
			 System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", female[r - 1]);
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

