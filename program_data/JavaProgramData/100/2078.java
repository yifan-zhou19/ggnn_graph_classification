package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int[] b = new int[52];
		int i;
		int j;
		int length;
		int sum = 0;
		a = new Scanner(System.in).nextLine();
		length = a.length();
		for (j = 0;j < 52;j++)
		{
			for (i = 0;i < length;i++)
			{
				if (a.charAt(i) == c.charAt(j))
				{
					b[j] += 1;
					sum += 1;
				}
			}

		}
		if (sum == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 52;i++)
			{
				if (b[i] != 0)
				{
					System.out.printf("%c=%d\n",c.charAt(i),b[i]);
				}
			}
		}
		return 0;
	}

}
