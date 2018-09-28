package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int e;



	char[][] sz = new char[50][33];
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
			  sz[i] = tempVar2.charAt(0);
		  }
	}
	for (j = 0;j < n;j++)
	{
	for (i = 0;i < n;i++)
	{
		  e = String.valueOf(sz[i]).length();
				 if (sz[i][e-1] == 'y' || sz[i][e-1] == 'r')
				 {
				 sz[i][e-2] = '\0';
				 break;
				 }
			 if (sz[i][e-1] == 'g')
			 {
				 sz[i][e-3] = '\0';
				  break;
			 }

	}
	 System.out.printf("%s\n",sz[j]);
	}

	return 0;


	}


}

