package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String a = new String(new char[5]);
		a = new Scanner(System.in).nextLine();
		for (i = 4;i >= 0;i--)
		{
			if (a.charAt(i) != '\0')
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
	}


}
