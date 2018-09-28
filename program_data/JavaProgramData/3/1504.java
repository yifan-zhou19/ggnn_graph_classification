package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int j;
	 int i;
	 int a;
	 int s;
	 int[] sz = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	 for (i = 0;i < n;i++)
	 {
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar3);
	}
	 }
	for (j = 0;j < n;j++)
	{
	   if (s == 1)
	   {
		   break;
	   }
	for (a = n - 1;a >= 0;a--)
	{
	 if ((a != j) && (sz[a] + sz[j] == k))
	 {
	s = 1;
	  break;
	 }
	}
	}
	if (s == 1)
	{
	 System.out.print("yes");
	}
	 else
	 {
		 System.out.print("no");
	 }
	 return 0;
	}
}

