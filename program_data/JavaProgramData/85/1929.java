package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] z = new char[n][20];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z[i] = tempVar2.charAt(0);
		}
	}
	for (i = 0;i < n;i++)
	{
	  k = 0;
	  for (j = 0;z[i][j] != '\0';j++)
	  {
		if (j == 0)
		{
		  if (z[i][j] <= 'z' && z[i][j] >= 'a' || z[i][j] <= 'Z' && z[i][j] >= 'A' || z[i][j] == '_')
		  {
			  k = 0;
		  }
		  else
		  {
			  k++;
		  }
		}
		else
		{
			if (z[i][j] <= 'z' && z[i][j] >= 'a' || z[i][j] <= 'Z' && z[i][j] >= 'A' || z[i][j] >= '0' && z[i][j] <= '9' || z[i][j] == '_')
			{
				k = k;
			}
				 else
				 {
					 k++;
				 }
		}
	  }
		if (k == 0)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
	}
	return 0;
	}

}

