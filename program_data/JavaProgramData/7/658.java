package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s = new String(new char[30000]);
		String yc = new String(new char[30000]);
		String tc = new String(new char[30000]);
		int tag = 1;
		int u = 0;
	s = new Scanner(System.in).nextLine();
	yc = new Scanner(System.in).nextLine();
	tc = new Scanner(System.in).nextLine();
	for (int i = 0;i < s.length();i++)
	{
	if (s.charAt(i) == yc.charAt(0))
	{
		tag = 2;
		for (int j = 0;j < yc.length();j++)
		{
		 if (s.charAt(i + j) != yc.charAt(j))
		 {
			 tag = 0;
			 break;
		 }
		}

	}
		 if (tag == 2)
		 {
			 System.out.printf("%s",tc);
			 u = i + yc.length();
			 break;
		 }


	if (tag != 2)
	{
		System.out.printf("%c",s.charAt(i));
	}

	}
	if (tag == 2)
	{
		for (int k = u;k < s.length();k++)
		{
			System.out.printf("%c",s.charAt(k));
		}
	}

		return 0;
	}
}
