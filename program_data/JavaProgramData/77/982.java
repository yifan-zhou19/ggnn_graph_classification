package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int p;
		int m;
		int c;
		int l;
		int[] a = new int[10000];
		int[] b = new int[10000];
		String str = new String(new char[500]);
		char x;
		char y;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		y = str.charAt(0);
		for (i = 0;i < n;i++)
		{
		if (str.charAt(i) != y)
		{
			x = str.charAt(i);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == x)
			{
				for (j = i;j >= 0;j--)
				{
					if (str.charAt(j) == y)
					{
						System.out.printf("%d %d\n",j,i);
						str = tangible.StringFunctions.changeCharacter(str, j, ' ');
						break;
					}
				}
				str = tangible.StringFunctions.changeCharacter(str, i, ' ');
			}
		}
	}

}

