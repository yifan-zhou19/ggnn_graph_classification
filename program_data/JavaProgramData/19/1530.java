package <missing>;

public class GlobalMembers
{
	public static final int maxw = 100;
	public static final int maxL = 100;

	public static int n;
	public static char[][] word = new char[maxw + 1][maxL + 1];

	public static String s = new String(new char[maxL + 1]);
	public static String t = new String(new char[maxL + 1]);

	public static int Main()
	{
		int i;
		n = -1;
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word[++n] = tempVar.charAt(0);
		}
		}while (System.in.read() != '\n');
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		for (i = 0;i <= n;i++)
		{
		if (strcmp(s,word[i]) == 0)
		{
			System.out.printf("%s",t);
		}
		else
		{
			System.out.printf("%s",word[i]);
		}
		if (i == n)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
		return 0;
	}

}

