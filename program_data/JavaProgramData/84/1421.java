package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t1 = 0;
		int t2 = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		/*if(i==0)
			{
				scanf("%d",&t);
		}*/
				while (i < n)
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i] = Integer.parseInt(tempVar2);
				}
				if (i == 0)
				{
						t1 = sz[i];
						t2 = sz[i];

				}
				else
				{
				if (t1 <= sz[i])
				{
					t1 = sz[i];
				}
				if (t2 <= sz[i] != 0 && t1> sz[i])
				{
					t2 = sz[i];
				}
				}
			i++;
				}
		System.out.printf("%d\n%d",t1,t2);
		return 0;
	}
}

