package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) && b.charAt(i);i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			   a.charAt(i) -= 'a'-'A';
			}
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				b.charAt(i) -= 'a'-'A';
			}
				if (a.charAt(i) != b.charAt(i))
				{
					if (a.charAt(i) > b.charAt(i))
					{
						System.out.print(">");
					}
					if (a.charAt(i) < b.charAt(i))
					{
						System.out.print("<");
					}
				break;
				}
		}
				if (!a.charAt(i) && !b.charAt(i))
				{
				System.out.print("=");
				}
		return 0;
	}


}
