package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int n;
		int i;
		int m;
		int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",m);
		a[m] = 1;
	for (i = 1;i < n;i = i + 1)
	{
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  m = Integer.parseInt(tempVar3);
	  }
	  if (a[m] == 0)
	  {
		  System.out.printf(",%d",m);
		  a[m] = 1;
	  }
	}

	  return 0;
	}

}

