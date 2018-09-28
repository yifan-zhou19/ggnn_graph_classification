package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct point
	//  {
	//   double x,y;
	//  }
	//  *points;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	  points = (point)malloc(sizeof(point) * n);
	  int i;
	  for (i = 0;i < n;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   points[i].x = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   points[i].y = tempVar3;
	   }
	  }
	  double[] s;
	  s = new double[((n - 1) * (n - 1))];
	  int j;
	  int k;
	  for (j = 0;j < n - 1;j++)
	  {
		  for (k = 0;k < n - 1;k++)
		  {
			  s[j * (n - 1) + k] = Math.pow(Math.pow(((points[j].x - points[k].x) * (points[j].x - points[k].x) + (points[j].y - points[k].y) * (points[j].y - points[k].y)),2),0.25);
		  }
	  }
	  double a = s[0];
	  int w;
	  for (w = 0;w < (n - 1) * (n - 1);w++)
	  {
		  if (a > s[w + 1])
		  {
			  a = a;
		  }
		  else
		  {
			  a = s[w + 1];
		  }
	  }
	  System.out.printf("%.4f\n",a);

	  return 0;
	 }


}

