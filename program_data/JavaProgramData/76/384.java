package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  int b;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct qu
	//  {
	//	 int x,y;
	//  }
	//  qus[50000];
	  int x;
	  int y;
	  for (int i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		qus[i].x = x;
		qus[i].y = y;
	  }
	  for (int k = n - 1;k > 0;k--)
	  {
		  for (int j = 0;j < k;j++)
		  {
			  if (qus[j].x > qus[j + 1].x)
			  {
				 int tmpx;
				 int tmpy;
				 tmpx = qus[j + 1].x;
				 tmpy = qus[j + 1].y;
				 qus[j + 1].x = qus[j].x;
				 qus[j + 1].y = qus[j].y;
				 qus[j].x = tmpx;
				 qus[j].y = tmpy;
			  }
		  }
	  }
	  a = qus[0].x,b = qus[0].y;
	  for (int r = 1;r < n;r++)
	  {
		  if (qus[r].x > b)
		  {
			 System.out.print("no");
			 return 0;
		  }
		  else
		  {
			  if (qus[r].y > b)
			  {
			 b = qus[r].y;
			  }
		  }
	  }
	  System.out.printf("%d %d",a,b);
	  return 0;
	}
}

