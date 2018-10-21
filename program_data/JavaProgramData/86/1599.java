package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int Main()
	{
		int x; //bool ff=0;
		int k;
		int sum;
		int now;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int t = n;
		while (n-- != 0)
		{
			sum = now = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			//if(y==6||ff) {printf("n=%d y=%d\n",n,y);ff=1;}
			while (x-- != 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					k = Integer.parseInt(tempVar3);
				}
				if (k - sum + now > 60)
				{
					continue;
				}
				else
				{
					now += k - sum + 3,sum = k;
				}
				//if(n==0&&y==6) printf("sum=%d now=%d\n",sum,now);
			}
			if (now < 60)
			{
				sum += 60 - now;
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

