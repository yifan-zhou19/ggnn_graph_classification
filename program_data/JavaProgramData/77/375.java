package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		char a;
		char b;
		int i;
		int j;
		int len;
		int t;
		int p;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		a = str.charAt(0);
		b = str.charAt(len - 1);
		t = 2;
		while (t == 2)
		{
		for (i = 0;i < len - 1;i++)
		{
			for (j = i + 1;j < len;j++)
			{
				if (str.charAt(j) == a)
				{
					break;
				}
				if (str.charAt(j) == b)
				{
					System.out.printf("%d %d\n",i,j);
					str = tangible.StringFunctions.changeCharacter(str, i, '$');
					str = tangible.StringFunctions.changeCharacter(str, j, '$');
					t = 1;
					p = j;
					break;
				}
			}
			if (p == len - 1)
			{
				t = 0;
				break;
			}
			if (t == 1)
			{
				t = 2;
				break;
			}
		}
		}
		return 0;
	}

}

