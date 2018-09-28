package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int[] sz = new int[1000];
	 j = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	 for (i = 1;i <= n;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 sz[i] = Integer.parseInt(tempVar3);
		 }
	 }
	 for (i = j;i < n;i++)
	 {
	  if (sz[j] + sz[i + 1] == k)
	  {
		  System.out.print("yes");
		  break;
	  }
	  if (i == n - 1)
	  {
		  j++;
		  i = j;
	  }
	  if (j == n - 1)
	  {
	   if (sz[j] + sz[i + 1] == k)
	   {
	System.out.print("yes");
	break;
	   }
		else
		{
			System.out.print("no");
		}
	  }
	 }
	return 0;
	}
}

