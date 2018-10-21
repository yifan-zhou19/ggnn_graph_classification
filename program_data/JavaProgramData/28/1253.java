package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] str = new char[300][300];
	int i = 0;
	int j = 0;
	int k = 0;
	for (i = 0;i < 300;i++)
	{
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str[i][0] = tempVar.charAt(0);
	   }
	   if (str[i - 1][0] == '\0')
	   {
		   break;
	   }
	}
	for (;k < i - 2;k++)
	{
	  System.out.printf("%d,",String.valueOf(str[k]).length());
	}
	System.out.printf("%d",String.valueOf(str[i - 2]).length());
	}
}

