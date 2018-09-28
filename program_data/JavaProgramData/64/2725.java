public class distance
{
	   public double length;
	   public int start;
	   public int end;
}

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
		  int[][] point = new int[10][4];
		  int i;
		  int j;
		  distance[] dist = tangible.Arrays.initializeWithDefaultdistanceInstances(45);
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  point[i][1] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  point[i][2] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  point[i][3] = Integer.parseInt(tempVar4);
		  }
		  }
		  int k = 0;
		  for (i = 0;i < n - 1;i++)
		  {
			for (j = i + 1;j < n;j++)
			{
				dist[k].length = Math.sqrt((point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]) + (point[i][3] - point[j][3]) * (point[i][3] - point[j][3]));
				dist[k].start = i;
				dist[k].end = j;
				k++;
			}
		  }
		  double temp;
		  int temp1;
		  for (i = 0;i < k - 1;i++)
		  {
			 for (j = 0;j < k - 1 - i;j++)
			 {
			 if (dist[j].length < dist[j + 1].length)
			 {
				 temp = dist[j].length;
				 dist[j].length = dist[j + 1].length;
				 dist[j + 1].length = temp;
				 temp1 = dist[j].start;
				 dist[j].start = dist[j + 1].start;
				 dist[j + 1].start = temp1;
				 temp1 = dist[j].end;
				 dist[j].end = dist[j + 1].end;
				 dist[j + 1].end = temp1;
			 }
			 }
		  }
		  for (i = 0;i < k;i++)
		  {
			  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",point[dist[i].start][1],point[dist[i].start][2],point[dist[i].start][3],point[dist[i].end][1],point[dist[i].end][2],point[dist[i].end][3],dist[i].length);
		  }
		  System.in.read();
		  System.in.read();
	}

}

