package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int length2;
		int length1;
		String str = new String(new char[300]);
		String sub = new String(new char[300]);
		String rep = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		length1 = str.length();
		length2 = sub.length();
		for (i = 0;i < length1;i++)
		{
			for (j = 0;j < length2;j++)
			{
				if (sub.charAt(j) != str.charAt(i + j))
				{
				break;
				}
			}
			if (j == length2)
			{
				for (j = 0;j < length2;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i + j, rep.charAt(j));
				}
				break;
			}
		}
		System.out.println(str);
		return 0;
	}

}

