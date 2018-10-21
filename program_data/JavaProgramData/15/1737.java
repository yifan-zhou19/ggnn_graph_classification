package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int[][] sz = new int[100][100];
	int i;
	int j;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	  for (j = 0;j < n;j++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  (sz[i][j]) = Integer.parseInt(tempVar2);
	  }
	  }
	}

	int a;
	int b;
	int c;
	int s = 0;
	for (i = 0;i < n;i++)
	{
	  for (j = 0;j < n;j++)
	  {
		if (sz[i][j] == 0 && sz[i][j + 1] == 255)
		{
			a = j;
			break;
		}
	  }
	  for (j = n - 1;j >= 0;j--)
	  {
		if (sz[i][j] == 0 && sz[i][j - 1] == 255)
		{
			b = j;
			break;
		}
	  }

	  if (a < b)
	  {
		  c = b - a - 1;
	  }
	  else
	  {
		  c = 0;
	  }

	s = s + c;
	}

	System.out.printf("%d",s);

	return 0;
	}
}

