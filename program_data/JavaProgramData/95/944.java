package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch1 = new String(new char[100]);
		String ch2 = new String(new char[100]);
		ch1 = new Scanner(System.in).nextLine();
		int L1 = ch1.length();
		ch2 = new Scanner(System.in).nextLine();
		int L2 = ch2.length();
		int i;
		for (i = 0;i < L1;i++)
		{
			if (ch1.charAt(i) <= 'Z' && ch1.charAt(i) >= 'A')
			{
				ch1 = tangible.StringFunctions.changeCharacter(ch1, i, ch1.charAt(i) - 'A'+'a');
			}
		}
		for (i = 0;i < L2;i++)
		{
			if (ch2.charAt(i) <= 'Z' && ch2.charAt(i) >= 'A')
			{
				ch2 = tangible.StringFunctions.changeCharacter(ch2, i, ch2.charAt(i) - 'A'+'a');
			}
		}

		int judge = strcmp(ch1,ch2);
		if (judge < 0)
		{
			System.out.print("<");
		}
		else if (judge > 0)
		{
			System.out.print(">");
		}
		else if (judge == 0)
		{
			System.out.print("=");
		}
	}



}

