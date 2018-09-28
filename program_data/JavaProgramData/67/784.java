package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  float[] all = new float[1000];
	  float[] some = new float[1000];
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
			all[i] = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			some[i] = Float.parseFloat(tempVar3);
		}
	  }
	  for (j = 1;j < n;j++)
	  {
		if (((some[j] / all[j]) - (some[0] / all[0])) > 0.05)
		{
		  System.out.print("better\n");
		}
		else
		{
		if (((some[0] / all[0]) - (some[j] / all[j])) > 0.05)
		{
		  System.out.print("worse\n");
		}
		else
		{
		  System.out.print("same\n");
		}
		}
	  }
	  return 0;
	}

}

