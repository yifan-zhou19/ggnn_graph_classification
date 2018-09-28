package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int len;
		int i;
		int flag;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
				flag = 1;
			}
			else if (flag)
			{
				System.out.print(" ");
				flag = 0;
			}
		}
		System.out.print("\n");
	}
}
