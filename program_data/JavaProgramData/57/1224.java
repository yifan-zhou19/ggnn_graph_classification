package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	char[][] sz = new char[100][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 sz[i] = tempVar2.charAt(0);
	 }
	}

	for (int i = 0;i < n;i++)
	{
	 int len = String.valueOf(sz[i]).length();
	 if (sz[i][len - 1] == 'r' || sz[i][len - 1] == 'y')
	 {
	  sz[i][len - 2] = '\0';
	 }
	 else if (sz[i][len - 1] == 'g')
	 {
		 sz[i][len - 3] = '\0';
	 }
	}
	for (int i = 0;i < n;i++)
	{
	 System.out.printf("%s\n",sz[i]);
	}
	}
}

