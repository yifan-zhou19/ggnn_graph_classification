package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] order = new int[10000];
		for (i = 0;i < n;i++)
		{
			//printf("i=%d\n",i);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				order[i] = Integer.parseInt(tempVar2);
			}
			//printf("i=%d\n",i);
		}
		//printf("i+1=%d\n",order[3]);
		for (j = n - 1;j > -1;j--)
		{
			if (j > 0)
			{
			System.out.printf("%d ",order[j]);
			}
			else
			{
			System.out.printf("%d",order[j]);
			}
			//if(i<n-1){
			//	printf(" ");
			//}
		}
		return 0;
	}
}

