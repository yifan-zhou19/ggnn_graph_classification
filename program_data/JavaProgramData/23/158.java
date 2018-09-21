package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);
	public static void print(int n)
	{
		int i;
		for (i = n;;i++)
		{
			if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				System.out.printf("%c",str.charAt(i));
			}
		}
	}
	public static int Main()
	{
		int i;
		int len;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = len - 1;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
			print(i + 1);
			System.out.print(" ");
			}
		}
		print(0);
	}
}
