package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[1000];
	int[] b = new int[1000];
	int i;
	int n;
	int k;
	int j;
	int t = 0;
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
		 a[i] = Integer.parseInt(tempVar3);
	 }
	 b[i] = a[i];
	}
	for (i = 0;i < n;i++)
	{
	 for (j = i + 1;j < n;j++)
	 {
	  if (b[j] + a[i] == k)
	  {
	   System.out.print("yes");
	   t = 1;
	   break;
	  }
	 }
	  if (t == 1)
	  {
	  break;
	  }
	 if ((t == 0) && (i == n - 1))
	 {
	 System.out.print("no");
	 }
	}

	return 0;
	}
}

