package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String sz = new String(new char[31]);
		int i;
		sz = new Scanner(System.in).nextLine();
		for (i = 0;i < 30;i++)
		{
			if (sz.charAt(i) == '1' || sz.charAt(i) == '2' || sz.charAt(i) == '3' || sz.charAt(i) == '4' || sz.charAt(i) == '5' || sz.charAt(i) == '6' || sz.charAt(i) == '7' || sz.charAt(i) == '8' || sz.charAt(i) == '9' || sz.charAt(i) == '0')
			{
				System.out.printf("%c",sz.charAt(i));
				continue;
			}
			else
			{
				if (i == 0)
				{
					continue;
				}
				if (sz.charAt(i - 1) == '1' || sz.charAt(i - 1) == '2' || sz.charAt(i - 1) == '3' || sz.charAt(i - 1) == '4' || sz.charAt(i - 1) == '5' || sz.charAt(i - 1) == '6' || sz.charAt(i - 1) == '7' || sz.charAt(i - 1) == '8' || sz.charAt(i - 1) == '9' || sz.charAt(i - 1) == '0')
				{
					System.out.print("\n");
				}
			}
		}
	}

}
