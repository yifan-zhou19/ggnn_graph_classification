package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] an = new int[100];
		int[] bn = new int[100];
		for (k = 0;k < n;k++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   an[k] = Integer.parseInt(tempVar2);
		   }
		   bn[n - 1 - k] = an[k];
		}
		for (i = 0;i < n - 1;i++)
		{
		   System.out.printf("%d ",bn[i]);
		}
		System.out.printf("%d",bn[n - 1]);
			   return 0;
	}

}

