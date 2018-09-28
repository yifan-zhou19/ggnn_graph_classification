package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int n;

	public static String str = new String(new char[1000]);
	public static char c1;
	public static char c2;

	public static int Main()
	{
		int i;
		int j;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		c1 = str.charAt(0);
		c2 = str.charAt(n - 1);

		for (i = t;i < n;i++)
		{
			if (str.charAt(i) == c2)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (str.charAt(j) == c1)
					{
						System.out.printf("%d %d\n",j,i);
						str = tangible.StringFunctions.changeCharacter(str, i, ' ');
						str = tangible.StringFunctions.changeCharacter(str, j, ' ');
						break;
					}
				}
			}
			t++;
		}
	//scanf("%d",&k);
	return 0;
	}

}

