package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  double x;
	  double y;
	  double t;
	  int[] zong = new int[200];
	  int[] you = new int[200];
	  int[] j = new int[200];
	  int i = 0;
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
			  zong[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  you[i] = Integer.parseInt(tempVar3);
		  }
		  x = you[0] * 1.0 / zong[0];
		  y = you[i] * 1.0 / zong[i];
		  t = y - x;
		  if (t > 0.05)
		  {
			  j[i] = 2;
		  }
		  if (t < -0.05)
		  {
			 j[i] = 0;
		  }
		 if (t <= 0.05 && t >= -0.05)
		 {
			 j[i] = 1;
		 }

	  }
	  i = 1;
	  for (i = 1;i < n;i++)
	  {
		  if (j[i] == 2)
		  {
			  System.out.print("better\n");
		  }
		  if (j[i] == 0)
		  {
			  System.out.print("worse\n");
		  }
		  if (j[i] == 1)
		  {
			  System.out.print("same\n");
		  }
	  }


	  return 0;
	}

}

