package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int f;
		int t;
		int[] a = new int[1000];
		int[] hash = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1,f = 0;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if (hash[t]++==0)
			{
				if (f++==0)
				{
					System.out.printf("%d",t);
				}
				else
				{
					System.out.printf(",%d",t);
				}
			}
		}
	}
}

