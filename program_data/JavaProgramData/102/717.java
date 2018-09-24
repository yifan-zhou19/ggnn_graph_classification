package <missing>;

public class GlobalMembers
{
	public static int n;
	public static double[] male = new double[50];
	public static double[] female = new double[50];
	public static int cntm;
	public static int cntf;
	public static String sex = new String(new char[10]);

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cntm = cntf = 0;
		for (int i = 0;i < n;i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sex = tempVar.charAt(0);
				}
				if (strcmp(sex,"male") == 0)
				{
					  male[cntm++] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				}
				else
				{
					female[cntf++] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				}
		}
		sort(male,male + cntm);
		sort(female,female + cntf);
		for (int i = 0;i < cntm;i++)
		{
				System.out.printf("%.2f ",male[i]);
		}
		for (int i = cntf - 1;i > 0;i--)
		{
				System.out.printf("%.2f ",female[i]);
		}
		System.out.printf("%.2f\n",female[0]);
		return 0;
	}

}

