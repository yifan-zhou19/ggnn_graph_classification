package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		char i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 31;i++)
		{
			if (a.charAt(i) >= 48 && a.charAt(i) <= 57)
			{
				System.out.printf("%c",a.charAt(i));
			}
		if (a.charAt(i + 1) >= 48 && a.charAt(i + 1) <= 57 && a.charAt(i) < 48 || a.charAt(i)>57 && a.charAt(i + 1) >= 48 && a.charAt(i + 1) <= 57)
		{
				System.out.print("\n");
		}
		}
		return 0;
	}
}
