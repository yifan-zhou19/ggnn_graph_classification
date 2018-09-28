public class couple
{
	   public int x;
	   public int y;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  couple[] line = tangible.Arrays.initializeWithDefaultcoupleInstances(n);
	  couple temp = new couple();
	  for (i = 0;i <= n - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  line[i].x = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  line[i].y = Integer.parseInt(tempVar3);
		  }
	  }
	  int min = line[0].x;
	  int max = line[0].y;
	  for (i = 0;i <= n - 1;i++)
	  {
		  if (line[i].x < min)
		  {
		  min = line[i].x;
		  }
		  if (line[i].y > max)
		  {
		  max = line[i].y;
		  }
	  }
	  int[] a = new int[max - min + 1];
	  for (i = 0;i <= max - min;i++)
	  {
		  a[i] = 1;
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  for (j = line[i].x - min;j <= line[i].y - min - 1;j++)
		  {
		  a[j] = 0;
		  }
	  }
	  int flag = 1;
	  for (i = 0;i <= max - min - 1;i++)
	  {
		  if (a[i] != 0)
		  {
		  flag = 0;
		  }
	  }
	  if (flag == 0)
	  {
	  System.out.print("no");
	  }
	  else
	  {
	  System.out.printf("%d %d",min,max);
	  }
	}

}

