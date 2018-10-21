package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int len;
		int w = 0;
	final String a = "";
	a = new Scanner(System.in).nextLine();
	len = a.length();
	while (i < len)
	{
		if (w != 1 || a.charAt(i) != ' ')
		{
			System.out.printf("%c",a.charAt(i));
		}
	   if (a.charAt(i) == ' ')
	   {
			w = 1;
	   }
		else
		{
			w = 0;
		}
	i++;
	}
	}
}
