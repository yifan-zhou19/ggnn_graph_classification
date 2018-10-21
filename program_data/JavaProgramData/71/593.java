package <missing>;

public class GlobalMembers
{
	/*
	*???   5(1)
	*??     ???
	*??     2012?10?22?
	*???   ???
	*/ 
	public static int Main()
	{
		int[] year = new int[201];
		int n;
		int[] month1 = new int[201];
		int[] month2 = new int[201];
		int[] a = new int[201];
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year[i] % 4 == 0 && year[i] % 100 != 0) || (year[i] % 400 == 0))
			{
				int[] day = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335}; // ???????????????
				a[i] = (day[month2[i] - 1] - day[month1[i] - 1]) % 7 == 0;
			}
			else
			{
				int[] day = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
				a[i] = (day[month2[i] - 1] - day[month1[i] - 1]) % 7 == 0;
			}
		}
		for (i = 1; i <= n; i++)
		{
			if (a[i] != 0)
			{
			System.out.print("YES");
			System.out.print("\n");
			}
			else
			{
			System.out.print("NO");
			System.out.print("\n");
			}
		}
		return 0;
	}

}

