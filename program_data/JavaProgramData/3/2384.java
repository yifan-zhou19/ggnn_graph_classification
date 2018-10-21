package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a;
		int b;
		int i;
		int j;
		int s;
		int[] sz = new int[2000];
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
		s = 0;
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
						 for (j = i + 1;j < n;j++)
						 {
							 a = sz[i];
											b = sz[j];
											if (a + b == k)
											{
												s++;
											}
						 }
		}
		if (s != 0)
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

