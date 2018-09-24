package <missing>;

public class GlobalMembers
{
	public static int minf(int p, int min)
	{
		int x = 0;
		int i;
		i = min;
		for (i;i <= (int)Math.sqrt(p);i++)
		{
			if (p % i == 0)
			{
				x += minf(p / i, i) + 1;
			}
		}

		return x;
	}
	public static int Main()
	{
		int n;
		int i;
		int k;
		int p;
		int[] zs = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			//for(min=2;min<=(int)sqrt(p);min++){
				//if(p%min==0){
					zs[i] = minf(p, 2);
					//printf("%d\n",minf(p,min));
			//	}			
			//}
			zs[i]++;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d\n",zs[i]);
		}
		System.out.printf("%d",zs[n - 1]);
		//scanf("%d",&n);
		return 0;
	}
}

