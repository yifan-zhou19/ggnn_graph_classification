package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zifu = new String(new char[300]);
		String tihuan = new String(new char[300]);
		int k;
		int i = 0;
		zifu = new Scanner(System.in).nextLine();
		for (k = 0;k < zifu.length();k++)
		{
			if ((zifu.charAt(k) != ' ') || (zifu.charAt(k) == ' ' && zifu.charAt(k + 1) != ' '))
			{
			   tihuan = tangible.StringFunctions.changeCharacter(tihuan, i, zifu.charAt(k));
			   i++;
			}
			else
			{
			   continue;
			}
		}
		for (k = 0;k < i;k++)
		{
		System.out.printf("%c",tihuan.charAt(k));
		}
		return 0;
	}
}

