package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int a1;
	  int a2;
	  int[][] b = new int[100][2];
	  float m;
	  float[] c = new float[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a1 = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  a2 = Integer.parseInt(tempVar3);
	  }
	  m = ((float)a2) / ((float)a1);
	  for (i = 0;i < n - 1;i++)
	  {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  b[i][0] = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  b[i][1] = Integer.parseInt(tempVar5);
		  }
		c[i] = ((float)b[i][1]) / ((float)b[i][0]);
	  }
	  for (i = 0;i < n - 1;i++)
	  {
		  if (Math.abs(c[i] - m) <= 0.05)
		  {
			System.out.print("same\n");
		  }
		else
		{
			if ((c[i] - m) > 0.05)
			{
			  System.out.print("better\n");
			}
		  else
		  {
			  System.out.print("worse\n");
		  }
		}
	  }
	}


}

