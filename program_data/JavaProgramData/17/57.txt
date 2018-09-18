package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String chuan = new String(new char[101]);
	while (scanf("%s",chuan) != EOF)
	{
		System.out.printf("%s\n",chuan);
		int i;
		int j;
		int k;
		int p;
		int sig = 0;
		p = chuan.length() - 1;
		for (i = p;i >= 0;i--)
		{
			if (chuan.charAt(i) == ')')
			{
				sig++;
			}
			if ((chuan.charAt(i) != '(') && (chuan.charAt(i) != ')'))
			{
				chuan = tangible.StringFunctions.changeCharacter(chuan, i, ' ');
			}
			if ((sig != 0) && (chuan.charAt(i) == '('))
			{
				chuan = tangible.StringFunctions.changeCharacter(chuan, i, ' ');
				sig = sig - 1;
				for (j = i + 1;j <= p;j++)
				{
					if (chuan.charAt(j) == ')')
					{
						chuan = tangible.StringFunctions.changeCharacter(chuan, j, ' ');
						break;
					}
				}
			}
		}
		for (i = 0;i <= p;i++)
		{
			if (chuan.charAt(i) == '(')
			{
				System.out.print("$");
			}
			else if (chuan.charAt(i) == ')')
			{
				System.out.print("?");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
	return 0;
	}
}

