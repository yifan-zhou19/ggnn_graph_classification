package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int[] a = new int[10000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  for (i = m + 1;i <= n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = 1;i <= m;i++)
	  {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  a[i] = Integer.parseInt(tempVar4);
		  }
	  }
	  System.out.printf("%d",a[1]);
	  for (i = 2;i <= n;i++)
	  {
		  System.out.printf(" %d",a[i]);
	  }
	  return 7;
	}
}

