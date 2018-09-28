package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] bz = new char[100][500];
		int n;
		int i;
		int j;
		int l;
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
							 bz[i] = tempVar2.charAt(0);
						 }
		}
		for (i = 0;i < n;i++)
		{
						 l = String.valueOf(bz[i]).length();
						 for (j = 0;j < l;j++)
						 {
										  if (bz[i][l - 2] == 'e')
										  {
											  bz[i][l - 2] = '\0';
										  }
										  else if (bz[i][l - 2] == 'l')
										  {
											  bz[i][l - 2] = '\0';
										  }
										  else if (bz[i][l - 2] == 'n')
										  {
											  bz[i][l - 3] = '\0';
										  }
						 }
						 if (i != n - 1)
						 {
							 System.out.printf("%s\n",bz[i]);
						 }
						 else
						 {
							 System.out.printf("%s",bz[i]);
						 }
		}
		return 0;
	}

}

