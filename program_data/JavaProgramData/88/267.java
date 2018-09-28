package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[40]);
		int len;
		int i;
		int num = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i <= len - 1;i++)
		{
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				System.out.printf("%c",str.charAt(i));
			}
			else if (i > 0 && str.charAt(i - 1) >= 48 && str.charAt(i - 1) <= 57)
			{
				System.out.print("\n");
				num += 1;
			}

		}
		if (str.charAt(len - 1) >= 48 && str.charAt(len - 1) <= 57)
		{
				num += 1;
		}

	}

}
