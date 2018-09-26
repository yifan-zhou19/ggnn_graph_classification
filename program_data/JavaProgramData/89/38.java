package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10001];
	public static int Main()
	{
		int n;
		int tag;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if (!(i != 0 || j != 0))
			{
				break;
			}
			a[i] = 1;
		}
		for (int i = 0;i < n;i++)
		{
			if (a[i] == 0)
			{
				System.out.printf("%d\n",i);
				return 0;
			}
		}
		System.out.print("NOT FOUND\n");
		/*
		for(int i=0;i<n;i++){
			tag=1;
			for(int j=0;j<n;j++){
				if(i==j) continue;
				if(a[i][j] || !(a[j][i]) ) {
					tag=0;
					break;
				}
			}
			if(tag==1){
				printf("%d\n",i);
				return 0;
			}
		}
		printf("NOT FOUND\n");*/


	}
}

