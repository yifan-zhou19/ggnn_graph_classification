package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int len;
	char[][] a = new char[1000][256];
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
	  len = String.valueOf(a[i]).length();
	   for (j = 0;j < len;j++)
	   {
		if (a[i][j] == 'G')
		{
			a[i][j] = 'C';
		}
		else if (a[i][j] == 'A')
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
	   }
	}
	for (i = 0;i < n;i++)
	{
		len = String.valueOf(a[i]).length();
		for (j = 0;j < len;j++)
		{
			if (j == len - 1)
			{
				System.out.printf("%c\n",a[i][j]);
			}
			else
			{
			System.out.printf("%c",a[i][j]);
			}
		}
	}

	return 0;
	}

}

