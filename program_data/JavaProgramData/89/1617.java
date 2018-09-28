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
	  int[] p;
	  p = new int[(n * n)];
	  int[] y;
	  y = new int[(n * n)];
	  int i;
	  int j;
	  for (i = 0;i < n * n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  y[i] = Integer.parseInt(tempVar3);
	  }
	  if (p[i] == 0 && y[i] == 0)
	  {
	  break;
	  }
	  }
	  p[i] = -100000;
	  y[i] = -100000;
	  int k;
	  k = i;
	  int[] d;
	  d = new int[n];
	  for (i = 0;i < n;i++)
	  {
	  d[i] = 0;
	  }
	  for (i = 0;i < n;i++)
	  {
	   for (j = 0;j < k;j++)
	   {
		if (p[j] == i)
		{
		break;
		}
		if (y[j] == i)
		{
		d[i]++;
		}
	   }
	   if (d[i] == n - 1)
	   {
	   System.out.printf("%d",i);
	   break;
	   }
	  }
	  if (i == n)
	  {
	  System.out.print("NOT FOUND");
	  }

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(y);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(d);
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();


	}

}

