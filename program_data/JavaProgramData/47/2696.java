package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] shur = new int[100];
		 int[] shu = new int[100];
		 int n;
		 int i;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		  for (i = 0;i <= n;i++)
		  {
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		shur[i] = Integer.parseInt(tempVar2);
	}
	shu[n - i] = shur[i];
		  }
	for (i = 1;i <= n;i++)
	{
	if (i == n)
	{
		System.out.printf("%d",shu[i]);
		break;
	}
	System.out.printf("%d ",shu[i]);
	}
	return 0;
	}

}

