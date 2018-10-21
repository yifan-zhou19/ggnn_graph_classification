package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int s;
		int h = 0;
		int t = 0;
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
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (int i = 0;i < n - 1;i++)
		{
		   for (int j = i + 1;j < n;j++)
		   {
			s = a[i] + a[j];
			if (s == k)
			{
			 h = 1;
			}
		   }
		}
	   if (h == 1 && t == 0)
	   {
		System.out.print("yes");
	   }
	   else
	   {
		System.out.print("no");
	   }
	   return 0;
	}
}

