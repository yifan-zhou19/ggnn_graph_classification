package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String data = new String(new char[31]);
		int n;
		int i;
		data = new Scanner(System.in).nextLine();
		for (n = 0;data.charAt(n) != '\0';n++)
		{
			;
		}
		for (i = 0;i < n;i++)
		{
			if (data.charAt(i) <= '9' && data.charAt(i) >= '0')
			{
				System.out.printf("%c",data.charAt(i));
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}
