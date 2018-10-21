package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String fuck = new String(new char[30]);
		int i;
		fuck = new Scanner(System.in).nextLine();
		for (i = 0;i < 30;i++)
		{
			if (fuck.charAt(i) == '1' || fuck.charAt(i) == '2' || fuck.charAt(i) == '3' || fuck.charAt(i) == '4' || fuck.charAt(i) == '5' || fuck.charAt(i) == '6' || fuck.charAt(i) == '7' || fuck.charAt(i) == '8' || fuck.charAt(i) == '9' || fuck.charAt(i) == '0')
			{
				System.out.printf("%c",fuck.charAt(i));
			}
			else
			{
				if (i == 0)
				{
					continue;
				}
				if (fuck.charAt(i - 1) == '1' || fuck.charAt(i - 1) == '2' || fuck.charAt(i - 1) == '3' || fuck.charAt(i - 1) == '4' || fuck.charAt(i - 1) == '5' || fuck.charAt(i - 1) == '6' || fuck.charAt(i - 1) == '7' || fuck.charAt(i - 1) == '8' || fuck.charAt(i - 1) == '9' || fuck.charAt(i - 1) == '0')
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
