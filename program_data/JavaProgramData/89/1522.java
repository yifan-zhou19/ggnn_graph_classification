package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int[] f = new int[10000];
		for (i = 0;i < n;i++)
		{
			f[i] = 0;
		}
		while (!(i == 0 && j == 0))
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   i = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   j = Integer.parseInt(tempVar3);
		   }
		   f[i]--;
		   f[j]++;
		}
	   for (i = 0;i < n;i++)
	   {
		if (f[i] == n - 1)
		{
		System.out.printf("%d",i);
		break;
		}
	   }
	   if (i == n)
	   {
		   System.out.print("NOT FOUND");
	   }
	return 0;
	}
}

