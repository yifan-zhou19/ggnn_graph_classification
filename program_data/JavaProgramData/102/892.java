package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***???????***
	//***??????***
	//***???2012.12.24***
	//*************************************************
	public static int Main()
	{
		int n;
		int x = 0;
		int y = 0;
		int i;
		int j;
		int temp;
		String a = new String(new char[7]);
		double[] male = new double[40];
		double[] female = new double[40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (strcmp(a,"male") == 0)
			{
				male[x++] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			else if (strcmp(a,"female") == 0)
			{
				female[y++] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		temp = 0;
		for (i = 0; i < x; i++)
		{
			if (male[i] < male[temp])
			{
				temp = i;
			}
		}
		System.out.printf("%.2f", male[temp]);
		male[temp] = 0;
		for (i = 0; i < x - 1; i++)
		{
			for (j = 0; j < x; j++)
			{
				if (male[j] > 1)
				{
					temp = j;
					break;
				}
			}
			for (;j < x; j++)
			{
				if (male[j] > 1 && male[j] < male[temp])
				{
					temp = j;
				}
			}
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", male[temp]);
			male[temp] = 0;
		}
		for (i = 0; i < y; i++)
		{
			temp = 0;
			for (j = 0; j < y; j++)
			{
				if (female[j] > female[temp])
				{
					temp = j;
				}
			}
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", female[temp]);
			female[temp] = 0;
		}
		return 0;
	}
}

