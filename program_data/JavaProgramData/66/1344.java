package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int r;
		int sum = 0;
		int i;
		String[] week = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = Integer.parseInt(tempVar3);
		}
		int[] s = {0, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0)
		{
			s[2] = 1;
		}
		for (i = 0;i < y;i++)
		{
			sum += s[i];
		}
		sum += r;
		sum += (n - 1) + (n - 1) / 4 - (n - 1) / 100 + (n - 1) / 400;
		sum = sum % 7;
		System.out.printf("%s",week[sum]);
		return 0;
	}
}

