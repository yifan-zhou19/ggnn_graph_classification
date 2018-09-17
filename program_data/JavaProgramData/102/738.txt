package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		double[] male = new double[40];
		double[] female = new double[40];
		int indm = 0;
		int indf = 0;
		for (int k = 0;k < n;k++)
		{
			String str = new String(new char[10]);

			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (!strcmp(str,"male"))
			{
				male[indm] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				indm++;
			}
			else
			{
				female[indf] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				indf++;
			}
		}
		//sort
		int i;
		int j;
		for (i = 0;i < indm;i++)
		{
			for (j = i;j < indm;j++)
			{
				if (male[i] > male[j])
				{
					double t = male[i];
					male[i] = male[j];
					male[j] = t;
				}
			}
		}
		for (i = 0;i < indf;i++)
		{
			for (j = i;j < indf;j++)
			{
				if (female[i] < female[j])
				{
					double t = female[i];
					female[i] = female[j];
					female[j] = t;
				}
			}
		}
		//show
		for (i = 0;i < indm;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (i = 0;i < indf - 1;i++)
		{
			System.out.printf("%.2lf ",female[i]);
		}
		System.out.printf("%.2lf",female[indf - 1]);
		System.out.print("\n");

		return 0;
	}
}

