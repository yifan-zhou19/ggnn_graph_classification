package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int length = a.length();
		int i;
		int j;
		int w1;
		int w2;
		char q;
		q = a.charAt(0);
		for (i = 0;i < length;i++)
		{
			if (a.charAt(i) == q)
			{
				for (j = i + 1;j < length;j++)
				{
					if (a.charAt(j) == ' ')
					{
						continue;
					}
					else if (a.charAt(j) == q)
					{
						i = j - 1;
						break;

					}
					else if (a.charAt(j) != q && a.charAt(j) != ' ')
					{
						System.out.printf("%d %d\n",i,j);
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						a = tangible.StringFunctions.changeCharacter(a, j, ' ');
						i = -1;
						break;
					}
				}
			}
		}
	}







}

