package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[110][20];
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[0] = tempVar.charAt(0);
		}
		System.out.printf("%d",String.valueOf(s[0]).length());
		while (scanf("%s",s[i]) != EOF)
		{
		  System.out.printf(",%d",String.valueOf(s[i]).length());
		  i++;
		}
		System.out.print("\n");
	}
}

