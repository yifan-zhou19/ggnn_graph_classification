package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		int i;
		int len;
		int judge;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		judge = 0;
		for (i = 0;i < len;i++)
		{
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
			{
				System.out.printf("%c",str.charAt(i));
				judge = 0;
			}
			else if (str.charAt(i) == '.')
			{
				System.out.printf("%c",str.charAt(i));
				judge = 1;
			}
			else if (str.charAt(i) == ' ' && judge == 0)
			{
				System.out.printf("%c",str.charAt(i));
				judge = 1;
			}
			else if (str.charAt(i) == ' ' && judge == 1)
			{
				continue;
			}
		}
		System.out.print("\n");
	}
}
