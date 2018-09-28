package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int t = 0;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   x = Integer.parseInt(tempVar2);
			   }
			a[x]++;
		}
		for (i = 1;i <= 1000;i++)
		{
			if (a[i] != 0 && i % 2 != 0 && t == 0)
			{
			t++;
			System.out.printf("%d",i);
			}
			else if (a[i] != 0 && i % 2 != 0)
			{
				System.out.printf(",%d",i);
			}
		}
		//getchar();
		//getchar();
		return 0;
	}

}

