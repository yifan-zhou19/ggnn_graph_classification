package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		String a = new String(new char[82]);
		String b = new String(new char[82]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		i = 0;
		j = 0;
		while (i < a.length() && j < b.length())
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'?a.charAt(i) + 32:a.charAt(i));
			b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j) >= 'A' && b.charAt(j) <= 'Z'?b.charAt(j) + 32:b.charAt(j));
			if (a.charAt(i) == b.charAt(j))
			{
				i++;
				j++;
			}
			else if (a.charAt(i) > b.charAt(j))
			{
				System.out.print(">");
				System.out.print("\n");
				flag = 1;
				break;
			}
			else if (a.charAt(i) < b.charAt(j))
			{
				System.out.print("<");
				System.out.print("\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
		if (a.length() == b.length())
		{
			System.out.print("=");
			System.out.print("\n");
		}
		else if (a.length() > b.length())
		{
			System.out.print(">");
			System.out.print("\n");
		}
		else
		{
			System.out.print("<");
			System.out.print("\n");
		}
		}
		return 0;
	}

}

