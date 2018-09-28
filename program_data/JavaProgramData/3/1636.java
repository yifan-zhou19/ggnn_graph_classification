package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int[] sz = new int[1000];
	int b = 0;
	int c;
	int q;
	int i;
	int j;
	int e;
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
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n - 1;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			q = sz[i] + sz[j];
			if (q == k)
			{
				System.out.print("yes");
				return 0;
			}
		}
	}
	System.out.print("no");
	//for(e=0;e<b;e++)
	   //printf("%d ",q[e]);
	/*for(e=0;e<b;e++)
	{
		c=q[e]-k;
	    if(c==0)
		{
			printf("yes");
			return 0;
		}
	}
	if(c!=0)
	{
		printf("no");
	}*/

	return 0;
	}



}

