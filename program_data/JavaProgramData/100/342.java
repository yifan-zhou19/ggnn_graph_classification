package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		int sumtimes = 0;
		int[] times = new int[26];
		String str = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < 26;i++)
		{
			times[i] = 0;
		}
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				times[str.charAt(i) - 97] += 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (times[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 97,times[i]);
			}
			sumtimes += times[i];
		}
		if (sumtimes == 0)
		{
			System.out.print("No");
		}
	}

}
