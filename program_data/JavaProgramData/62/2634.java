package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int n;
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{

			if ((a.charAt(i) == ' ') && (a.charAt(i - 1) == ' '))
			{
				continue;
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
			}
		}





		return 0;
	}
}
