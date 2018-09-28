package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int b = 0;
	int[] num = new int[1002];
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		num[0] = Integer.parseInt(tempVar3);
	}
	for (i = 1;i <= n - 1;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		num[i] = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i <= n - 1;i++)
	{
		for (j = i + 1;j <= n - 1;j++)
		{
			 if (num[i] + num[j] == k)
			 {
				  System.out.print("yes");
			   b = 1;
				 break;
			 }
		}
	if (num[i] + num[j] == k)
	{
	break;
	}
	}
	if (b == 0)
	{
	System.out.print("no");
	}
	return 0;
	}
}

