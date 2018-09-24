package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i = 0;
	char[][] word = new char[300][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		word[i] = tempVar.charAt(0);
	}
	System.out.printf("%d",String.valueOf(word[i]).length());
	for (i = 1;;i++)
	{
		if (scanf("%s",word[i]) == EOF)
		{
			break;
		}
		System.out.printf(",%d",String.valueOf(word[i]).length());
	}
	}

}

