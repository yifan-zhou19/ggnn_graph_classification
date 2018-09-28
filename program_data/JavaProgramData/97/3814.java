package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int[] sz = {100, 50, 20, 10, 5, 1};
	for (int i = 0;i <= 5;i++)
	{
	 if (m >= sz[i])
	 {
	 System.out.printf("%d\n",m / sz[i]);
	 m -= (m / sz[i]) * sz[i];
	 }
	 else
	 {
		 System.out.printf("%d\n",0);
	 }
	}
	return 0;
	}



}

