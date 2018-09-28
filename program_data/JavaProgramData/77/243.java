package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char m;
		char f;
		int i;
		int j;
		int temp;
		a = new Scanner(System.in).nextLine();
		m = a.charAt(0);
		for (i = 0;;i++)
		{
			if (a.charAt(i) != m)
			{
			f = a.charAt(i);
			break;
			}
		}
		do
		{
			for (i = 0;i < a.length() - 1;i++)
			{
				if (a.charAt(i) == '0')
				{
					continue;
				}
				temp = 0;
				for (j = i + 1;j < a.length();j++)
				{

					if (a.charAt(i) == m && a.charAt(j) == m)
					{
						break;
					}
					if (a.charAt(i) == m && a.charAt(j) == f)
					{
						System.out.printf("%d %d\n",i,j);
						a = tangible.StringFunctions.changeCharacter(a, i, '0');
						a = tangible.StringFunctions.changeCharacter(a, j, '0');
						temp = 1;
						break;
					}
				}
				if (temp == 1)
				{
					break;
				}
			}
		} while (a.charAt(a.length() - 1) != '0');
		return 0;
	}
}

