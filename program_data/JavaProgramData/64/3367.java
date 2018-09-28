package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct distance
	//   {
	//	   int point1[3];
	//	   int point2[3];
	//	   double dis;
	//   };
	  distance[] d = tangible.Arrays.initializeWithDefaultdistanceInstances(100);
	  distance middle = new distance();
	  int i;
	  int j;
	  int k;
	  int n;
	  int[][] point = new int[100][3];
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < 3;j++)
		  {
			  point[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
	  }
	  j = 0;
	  k = 1;
	  for (i = 0;i < n * (n - 1) / 2;i++)
	  {
		  d[i].point1[0] = point[j][0];
		  d[i].point1[1] = point[j][1];
		  d[i].point1[2] = point[j][2];
		  d[i].point2[0] = point[k][0];
		  d[i].point2[1] = point[k][1];
		  d[i].point2[2] = point[k][2];
		  d[i].dis = Math.sqrt((d[i].point2[0] - d[i].point1[0]) * (d[i].point2[0] - d[i].point1[0]) + (d[i].point2[1] - d[i].point1[1]) * (d[i].point2[1] - d[i].point1[1]) + (d[i].point2[2] - d[i].point1[2]) * (d[i].point2[2] - d[i].point1[2]));
		  k++;
		  if (k == n)
		  {
			  j = j + 1;
			  k = j + 1;
		  }
	  }
	  for (i = 0;i < n * (n - 1) / 2;i++)
	  {
		  for (j = n * (n - 1) / 2 - 1;j > i;j--)
		  {
			  if (d[j].dis > d[j - 1].dis)
			  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: middle=d[j];
				  middle.copyFrom(d[j]);
				  d[j] = d[j - 1];
				  d[j - 1] = middle;
			  }
		  }
	  }
	  for (i = 0;i < n * (n - 1) / 2;i++)
	  {
		  System.out.printf("%.2f", "(");
		  System.out.printf("%.2f", d[i].point1[0]);
		  System.out.printf("%.2f", ",");
		  System.out.printf("%.2f", d[i].point1[1]);
		  System.out.printf("%.2f", ",");
		  System.out.printf("%.2f", d[i].point1[2]);
		  System.out.printf("%.2f", ")-(");
		  System.out.printf("%.2f", d[i].point2[0]);
		  System.out.printf("%.2f", ",");
		  System.out.printf("%.2f", d[i].point2[1]);
		  System.out.printf("%.2f", ",");
		  System.out.printf("%.2f", d[i].point2[2]);
		  System.out.printf("%.2f", ")=");
		  System.out.printf("%.2f", d[i].dis);
		  System.out.printf("%.2f", "\n");
	  }
	  return 0;
	}
}

