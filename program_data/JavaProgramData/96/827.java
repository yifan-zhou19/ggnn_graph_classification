package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int i;
		int k;
		s = new Scanner(System.in).nextLine();
		k = (int)(s.charAt(0) - '0');
		for (i = 1;i < s.length();i++)
		{
			k = k * 10 + (int)(s.charAt(i) - '0');
			if (i == 1 && (k / 13) != 0)
			{
				System.out.printf("%d",k / 13);
			}
			if (s.length() == 2 && i == 1 && (k / 13) == 0)
			{
				System.out.print("0");
			}
			if (i != 1)
			{
				System.out.printf("%d",k / 13);
			}
			k = k % 13;
			if (i == s.length() - 1)
			{
				System.out.printf("\n%d",k);
			}
		}
		if (s.length() == 1)
		{
			System.out.printf("0\n%d",k);
		}
		return 0;
	}

}
