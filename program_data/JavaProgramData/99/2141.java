package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:?????
	 ***??:2012?9?27?
	 *************************/
	public static int Main()
	{
		int i;
		int n;
		int age_1_18 = 0;
		int age_19_35 = 0;
		int age_36_60 = 0;
		int age_60 = 0;
		//???????n,1-18???,19-35???,36-60??,60????,???n?????

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] age = new int[100];
		double age_1_18_percent;
		double age_19_35_percent;
		double age_36_60_percent;
		double age_60_percent;
		//????1-18???,19-35???,36-60??,60??????

		for (i = 1; i <= n; i++) //??????
		{
			age[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (age[i] >= 1 && age[i] <= 18) //??????????1-18
			{
				age_1_18 = age_1_18 + 1; //????age_1_18??
			}
			if (age[i] >= 19 && age[i] <= 35) //??????????19-35
			{
				age_19_35 = age_19_35 + 1; //????age_19_35??
			}
			if (age[i] >= 36 && age[i] <= 60) //??????????36-60
			{
				age_36_60 = age_36_60 + 1; //???age_39_60??
			}
			if (age[i] > 60) //??????????60
			{
				age_60 = age_60 + 1; //???age_60??
			}
		};
		age_1_18_percent = age_1_18 * 1.0 / n; //?1-18????????1-18????????????,???
		age_19_35_percent = age_19_35 * 1.0 / n;
		age_36_60_percent = age_36_60 * 1.0 / n;
		age_60_percent = age_60 * 1.0 / n;
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", age_1_18_percent * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", age_19_35_percent * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", age_36_60_percent * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", age_60_percent * 100);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

