package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[1000][NUM];
	char[][] b = new char[1000][NUM];
	int i;
	int t;
	int k;
	int n;
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
		t = String.valueOf(a[i]).length();
		  for (k = 0;k < t;k++)
		  {
				if (a[i][k] == 'A')
				{
					b[i][k] = 'T';
				}
				else if (a[i][k] == 'T')
				{
					b[i][k] = 'A';
				}
				else if (a[i][k] == 'G')
				{
					b[i][k] = 'C';
				}
				else if (a[i][k] == 'C')
				{
					b[i][k] = 'G';
				}
		  }
	}
	for (i = 0;i < n;i++)
	{
		t = String.valueOf(a[i]).length();
		b[i][t] = '\0';
		System.out.printf("%s\n", b[i]);
	}
	return 0;
	}

}

