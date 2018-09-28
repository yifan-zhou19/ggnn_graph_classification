package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int s;
	s = 0;
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
	for (int i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	}
	for (int i = 0;i < n;i++)
	{
	  for (int j = 0;j < n;j++)
	  {
		if ((sz[j] + sz[i]) == k && j != i)
		{
		s++;
		}
	  }
	}
	if (s == 0)
	{
	   System.out.print("no");
	}
	else
	{
	   System.out.print("yes");
	}
	return 0;
	}


}

