package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int B;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		int A = B = a.length();
		for (i = A - 1;i >= 0;i--)
		{
			if (a.charAt(i) == ' ')
			{
				B--;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < B;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				j++;
				for (k = i;k < B - 1;k++)
				{
					if (a.charAt(k + 1) != ' ')
					{
						break;
					}
				}
				i = k;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
	}
}

