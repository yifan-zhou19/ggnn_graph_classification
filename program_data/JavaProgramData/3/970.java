package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int f;
	int k;
	int s;
	int[] sz = new int[1000];
	f = 0;
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
	for (int i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar3);
	}
	}




	for (int j = 0;j < n;j++)
	{
	 for (int m = j + 1;m < n;m++)
	 {
	  s = sz[j] + sz[m];
	if ((s == k) && (f == 0))
	{
	f = 1;
	System.out.print("yes");
	break;
	}
	 }
	if (f == 1)
	{
		break;
	}
	}
	if (f == 0)
	{
		System.out.print("no");
	}

	return 0;
	}

}

