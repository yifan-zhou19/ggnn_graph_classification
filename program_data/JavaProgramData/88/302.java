package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String num = new String(new char[30]);
		num = new Scanner(System.in).nextLine();

		n = num.length();
		for (i = 0;i < n;i++)
		{
			if (num.charAt(i) != 96 && num.charAt(i) != 109)
			{
				while (num.charAt(i) >= 48 && num.charAt(i) <= 57)
				{
					System.out.print(num.charAt(i));
					i++;
					continue;
				}
			}
			System.out.print("\n");
		}

		return 0;
	}
}
