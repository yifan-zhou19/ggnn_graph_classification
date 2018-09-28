package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sum;
		int j;
		int k;
		int[] a = new int[1000];
		int[] b = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		sum = Integer.parseInt(tempVar2);
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
	for (j = 0;j < n;j++)
	{
		for (k = j;k < n;k++)
		{
			if ((a[j] + b[k]) == sum)
			{
				System.out.print("yes");
				return 0;
			}
		}
	}
	 System.out.print("no");


	return 0;
	}
}

