package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String sex = new String(new char[10]);
		final String fmale = "male";
		float a;
		int male = 0;
		int famle = 0;
		float[] humanm = new float[40];
		float[] humanf = new float[40];

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(sex,fmale) == 0)
			{

				humanm[male] = a;
				male++;
			}
			else
			{

				humanf[famle] = a;
				famle++;
			}
		}
		sort(humanm[0], humanm[male]);
		sort(humanf[0], humanf[famle]);
		for (int i = 0;i < male;i++)
		{
			System.out.printf("%.2f ",humanm[i]);
		}
		for (int i = famle-1;i > 0;i--)
		{
			System.out.printf("%.2f ",humanf[i]);
		}
		System.out.printf("%.2f\n",humanf[0]);
	}
}

