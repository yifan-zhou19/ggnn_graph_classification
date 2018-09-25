package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
	  int i;
	  int j;
	  int k;
	  int n;
	  int p;
	  int q;
	  int flag;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  a[i] = 0;
		  b[i] = 0;
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  q = Integer.parseInt(tempVar3);
	  }
	  while ((p + q) != 0)
	  {
		  a[p]++;
		  b[q]++;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			q = Integer.parseInt(tempVar5);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		if ((a[i] == 0) && (b[i] == n - 1))
		{
		flag = 1;
		System.out.printf("%d\n",i);
		}
	  }
	  if (flag == 0)
	  {
		  System.out.print("NOT FOUND");
	  }

	}


}

