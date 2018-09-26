package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int mid;
		int i;
		int n;
		int high;
		int low;
		int stop;
		a = 0;
		b = 0;
		c = 0;
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
				high = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				low = Integer.parseInt(tempVar3);
			}
			if ((high >= 90) && (high <= 140) && (low <= 90) && (low >= 60))
			{
				a++;
				c = a;
			}
			else
			{
				//if(n==1){
			//		printf("0");
			//	}
				if (a > 0)
				{
					mid = b;
					if (a > mid)
					{
						b = a;
					}
					a = 0;
				}
			}
		}
		if (c < b)
		{
			System.out.printf("%d",b);
		}
		else
		{
			System.out.printf("%d",c);
		}
		return 0;
	}
}

