package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		//printf("%s %s %s",a,b,c);
		for (int i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == b.charAt(0) && (a.charAt(i - 1) == ' ' || i == 0) && (a.charAt(i + b.length()) == ' ' || i + b.length() == a.length()))
			{
				int check = 0;
				for (int j = 0;j < b.length();j++)
				{
					if (a.charAt(j + i) != b.charAt(j))
					{
						check = 1;
						break;
					}
				}
				if (check == 0)
				{
					System.out.printf("%s",c);
					i += b.length() - 1;
					continue;
				}
			}
			System.out.printf("%c",a.charAt(i));
		}

					return 0;
	}

}
