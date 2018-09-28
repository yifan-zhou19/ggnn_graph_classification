package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int[] a = new int[1000];
	int i;
	int j;
	int f;
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
	f = 0;
	for (i = 0;i < n;i++)
	{
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i] = Integer.parseInt(tempVar3);
	   }
		if (f == 1)
		{
			break;
		}
		for (j = 0;j < i;j++)
		{
			 if (a[i] + a[j] == k)
			 {
					 f = 1;
				  break;
			 }
		}
	}
	if (f == 1)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}
	}
}

