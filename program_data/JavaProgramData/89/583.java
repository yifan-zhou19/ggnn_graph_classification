package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int a;
	public static int b;
	public static int[] ind = new int[MAXN];
	public static int[] oud = new int[MAXN];
	public static int i;
	public static int Main()
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  while (a + b != 0)
	  {
		ind[b]++;
		oud[a]++;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b = Integer.parseInt(tempVar5);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		if (ind[i] == n - 1 && oud[i] == 0)
		{
		  break;
		}
	  }
	  if (i < n)
	  {
		System.out.printf("%d\n",i);
	  }
	  else
	  {
		System.out.print("NOT FOUND\n");
	  }
	  return 0;
	}

}

