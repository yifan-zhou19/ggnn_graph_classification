package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p1;
		String p2;
		int l1;
		int l2;
		int i;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc((Integer.SIZE / Byte.SIZE) * 80);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (String)malloc((Integer.SIZE / Byte.SIZE) * 80);
		p1 = new Scanner(System.in).nextLine();
		p2 = new Scanner(System.in).nextLine();
		l1 = p1.length();
		l2 = p2.length();
		l = (l1 > l2)? l1: l2;
		for (i = 0;i < l;i++)
		{
			if (p1.charAt(i) >= 'A' && p1.charAt(i) <= 'Z')
			{
				p1 = tangible.StringFunctions.changeCharacter(p1, i, p1.charAt(i) - 'A'+'a');
			}
			if (p2.charAt(i) >= 'A' && p2.charAt(i) <= 'Z')
			{
				p2 = tangible.StringFunctions.changeCharacter(p2, i, p2.charAt(i) - 'A'+'a');
			}
		}
		if (strcmp(p1,p2) > 0)
		{
			System.out.print(">\n");
		}
		else if (strcmp(p1,p2) == 0)
		{
			System.out.print("=\n");
		}
		else
		{
			System.out.print("<\n");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p2);
		return 0;
	}
}

