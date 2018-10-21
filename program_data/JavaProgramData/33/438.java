package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] s = new char[1000][256];
	   int n;
	   int i;
	   int k;
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
				s[i] = tempVar2.charAt(0);
			}
			for (k = 0;s[i][k] != '\0';k++)
			{
			   if (s[i][k] == 'T')
			   {
				   s[i][k] = 'A';
			   }
			   else if (s[i][k] == 'A')
			   {
				   s[i][k] = 'T';
			   }
			   else if (s[i][k] == 'C')
			   {
				   s[i][k] = 'G';
			   }
			   else if (s[i][k] == 'G')
			   {
				   s[i][k] = 'C';
			   }
			}
	   }
		for (i = 0;i < n - 1;i++)
		{
			 System.out.printf("%s\n",s[i]);
		}
		System.out.printf("%s",s[n - 1]);
		return 0;
	}
}

