package <missing>;

public class GlobalMembers
{
	public static final int maxLenth = 100;
	public static final int maxwords = 10000;

	public static int n;
	public static char[][] word = new char[maxwords + 10][maxLenth + 10];

	public static String fw = new String(new char[maxLenth + 10]);
	public static String tw = new String(new char[maxLenth + 10]);

	public static int Main()
	{
		int i;
		int j;
		int k;
		char a;
		n = 0;
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word[++n] = tempVar.charAt(0);
		}
		a = System.in.read();
		}while (a != '\n');
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			fw = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			tw = tempVar3.charAt(0);
		}
		for (i = 1;i <= n;i++)
		{
		if (strcmp(fw,word[i]) == 0)
		{
			System.out.printf("%s",tw);
		}
		else
		{
			System.out.printf("%s",word[i]);
		}
		if (i < n)
		{
			System.out.print(" ");
		}
		else
		{
			System.out.print("\n");
		}
		}

		return 0;
	}

}

