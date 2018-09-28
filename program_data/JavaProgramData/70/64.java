package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int a = 0;
	  double b;
	  double[] s = new double[5000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct distance
	//  {
	//	  double x,y;
	//		 }
	//		 dis[100];
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
		  dis[i].x = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  dis[i].y = tempVar3;
	  }
	  }
	  for (i = 1;i < n;i++)
	  {
	  for (j = 0;j < i;j++)
	  {
	  s[a] = Math.sqrt((dis[i].x - dis[j].x) * (dis[i].x - dis[j].x) + (dis[i].y - dis[j].y) * (dis[i].y - dis[j].y));
	  a++;
	  }
	  }
	  for (i = a - 1;i > 0;i--)
	  {
	  for (j = 0;j < i;j++)
	  {
	  if (s[j] > s[j + 1])
	  {
		b = s[j + 1];
		s[j + 1] = s[j];
		s[j] = b;
	  }
	  }
	  }
	  System.out.printf("%.4f\n",s[a - 1]);
	 return 0;
	}

}

