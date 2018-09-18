package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t;
	int[][] N = new int[1000][1000];
	int i;
	int j;
	int n;
	int m;
	int a = 0;
	int b = 0;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (i = 0;i < t;i++)
	{
	  for (j = 0;j < t;j++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  N[i][j] = Integer.parseInt(tempVar2);
	  }
	  }
	}
	for (i = 0;i < t;i++)
	{
	  for (j = 0;j < t;j++)
	  {
	   if (N[i][j] == 0)
	   {
	   n = i;
	   m = j;
	   }
	  }
	}
	for (i = n,j = m;j < t;j--)
	{
	 if (N[i][j] == 0)
	 {
	a++;
	 }
	 else
	 {
		 break;
	 }
	}
	for (j = m,i = n;i < t;i--)
	{
	if (N[i][j] == 0)
	{
	b++;
	}
	else
	{
		break;
	}
	}
	s = (a - 2) * (b - 2);
	System.out.printf("%d",s);
	return 0;
	}
}

