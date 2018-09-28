package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int n;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = n - 1;i >= 0;i--)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else
			{
				for (j -= 1;j >= 0;j--)
				{
				System.out.printf("%c",b.charAt(j));
				}
				j = 0;
				System.out.print(' ');
			}
		}
		for (i = 0;;i++)
		{
			if (a.charAt(i) == ' ' || i == n)
			{
				break;
			}
			else
			{
				System.out.print(a.charAt(i));
			}
		}
		System.out.print('\n');



	}



}

