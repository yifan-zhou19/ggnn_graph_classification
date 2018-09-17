package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[8]); //?????,????
		double height;
		double[] female = new double[40];
		double[] male = new double[40];
		int n;
		int femalecount = 0;
		int malecount = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (a.length() == 6) //???????6,??????
			{
				female[femalecount] = height; //???????????
				femalecount++;
			}
			else
			{
				male[malecount] = height; //??????,????????????
				malecount++;
			}
		}
		sort(male,male + malecount); //????
		sort(female,female + femalecount); //????
		for (i = 0; i < malecount; i++)
		{
			System.out.printf("%.2f", male[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = femalecount - 1; i > 0; i--)
		{
			System.out.printf("%.2f", female[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", female[0]);
		return 0;
	}

}

