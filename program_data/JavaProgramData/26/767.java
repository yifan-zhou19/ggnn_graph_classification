package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[101]);
		int i = 0;
		for (i = 0;i < 101;i++)
		{
			a.charAt(i) == '\0';
		}
		a = new Scanner(System.in).nextLine();
		i = 0;
		while (a.charAt(i) != '\0')
		{
			if (!(a.charAt(i) == ' ' && a.charAt(i + 1) == ' '))
			{
				System.out.printf("%c",a.charAt(i));
			}
			i++;
		}
	}

}
