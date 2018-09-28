package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	  int[] b = new int[n];
	  for (i = 0;i < n;i++)
	  {
		  a[i] = 0;
	  }
	  for (i = 0;i < n;i++)
	  {
		  b[i] = 0;
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  i = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  j = Integer.parseInt(tempVar3);
	  }
	  while ((i + j) != 0)
	  {
		a[i]++;
		b[j]++;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			j = Integer.parseInt(tempVar5);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		if ((a[i] == 0) && (b[i] == n - 1))
		{
		  System.out.printf("%d",i);
		  k = 1;
		}
	  }
	  if (k == 0)
	  {
		  System.out.print("NOT FOUND");
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(b);
	}



}

