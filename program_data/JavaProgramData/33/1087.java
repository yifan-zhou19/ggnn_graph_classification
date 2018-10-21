package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[1000][256];
		int n;
		int i;
		int j;
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
		}
		for (j = 0;j < n;j++)
		{
				 for (i = 0;s[j][i] != '\0';i++)
				 {
				 if (s[j][i] == 'A')
				 {
								 s[j][i] = 'T';
				 }
				 else if (s[j][i] == 'T')
				 {
								 s[j][i] = 'A';
				 }
				 else if (s[j][i] == 'C')
				 {
										 s[j][i] = 'G';
				 }
				 else
				 {
								 s[j][i] = 'C';
				 }
				 }
		}
		for (i = 0;i < n;i++)
		{
			   System.out.printf("%s\n",s[i]);
		}
	return 0;
	}

}

