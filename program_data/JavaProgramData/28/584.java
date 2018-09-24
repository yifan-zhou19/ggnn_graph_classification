package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[300][100];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str[i] = tempVar.charAt(0);
		}
		int n = String.valueOf(str[i]).length();
		System.out.printf("%d",n);
		while (scanf("%s",str[i]) != EOF)
		{
			n = String.valueOf(str[i]).length();
			System.out.printf(",%d",n);
			i = i + 1;
		}
	}
}

