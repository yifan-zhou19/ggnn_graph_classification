package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] all = new int[100];
	  int[] work = new int[100];
	  double[] c = new double[100];
	  double m;
	  int i = 0;
	  char x;
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
			  all[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  work[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  c[i] = 1.0 * work[i] / all[i];
	  }
	  for (i = 1;i < n;i++)
	  {
		  m = c[i] - c[0];
	  if (m > 0.05)
	  {
		  System.out.print("better\n");
	  }
	  if (m < -0.05)
	  {
		  System.out.print("worse\n");
	  }
	  if (m <= 0.05 && m >= -0.05)
	  {
		  System.out.print("same\n");
	  }
	  }

	  return 0;
	}
}

