package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][256];
		int n;
		int i;
		int j;
		int[] l = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = tempVar2.charAt(0);
		   }
		}
		for (i = 0;i < n;i++)
		{
		   l[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < l[i];j++)
		{
		   if (a[i][j] == 'A')
		   {
			 a[i][j] = 'T';
		   }
		   else if (a[i][j] == 'T')
		   {
			 a[i][j] = 'A';
		   }
		   else if (a[i][j] == 'C')
		   {
			 a[i][j] = 'G';
		   }
		   else if (a[i][j] == 'G')
		   {
			 a[i][j] = 'C';
		   }
		}
		   a[i][l[i]] = '\0';
		}
		for (i = 0;i < n;i++)
		{
		   System.out.printf("%s\n",a[i]);
		}
		   int t;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

