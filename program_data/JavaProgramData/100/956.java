package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		final String a = "abcdefghijklmnopqrstuvwxyz";
		str = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k = 0;
		int sum = 0;
		int len;
		int[] num = new int[100];
		len = str.length();
		for (i = 1;i <= 26;i++)
		{
			for (j = 1;j <= len;j++)
			{
				if (a.charAt(i - 1) == str.charAt(j - 1))
				{
					num[i - 1]++;
				}
			}
		}
		for (i = 1;i <= 26;i++)
		{
			sum += num[i - 1];

		}

		if (sum == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 1;i <= 26;i++)
			{
				sum += num[i - 1];
				if (num[i - 1] > 0)
				{
				System.out.printf("%c=%d\n",a.charAt(i - 1),num[i - 1]);
				}
			}
		}
		return 0;
	}


}
