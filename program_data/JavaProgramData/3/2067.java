package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int p;
		int m = 0;
		int[] sz = new int[1000];
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		 for (i = 0;i < n;i++)
		 {
		   for (p = 1;p < n - i;p++)
		   {
			 if (sz[i] == k - sz[i + p])
			 {
				 System.out.print("yes");
				 break;
			 }
			 else
			 {
				 m++;
			 }
		   }
		 if (sz[i] == k - sz[i + p])
		 {

				 break;
		 }
		 }

		if (m == n * (n - 1) / 2)
		{
			System.out.print("no");
		}
		return 0;
	}
}

