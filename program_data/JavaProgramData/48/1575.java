package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int m;
	   int n;
	   int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct point
	//   {
	//	   int now;
	//	   int answer;
	//   }
	//   a[11][11];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < 11;i++)
	  {
	  for (j = 0;j < 11;j++)
	  {
	  a[i][j].now = 0;
	  }
	  }
	  a[5][5].now = m;
	  for (k = 0;k < n;k++)
	  {
		  for (i = 1;i < 10;i++)
		  {
		  for (j = 1;j < 10;j++)
		  {
		  a[i][j].answer = 2 * a[i][j].now + a[i - 1][j - 1].now + a[i - 1][j].now + a[i - 1][j + 1].now + a[i][j - 1].now + a[i][j + 1].now + a[i + 1][j - 1].now + a[i + 1][j].now + a[i + 1][j + 1].now;
		  }
		  }
		  for (i = 1;i < 10;i++)
		  {
		  for (j = 1;j < 10;j++)
		  {
		  a[i][j].now = a[i][j].answer;
		  }
		  }
	  }
		 for (i = 1;i < 10;i++)
		 {
		 for (j = 1;j < 9;j++)
		 {
		 System.out.printf("%d ",a[i][j].now);
		 }
		 System.out.printf("%d\n",a[i][9].now);
		 }
	}
}

