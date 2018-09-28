package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int l;
		int j;
		int a;
		int b;
		float r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k = k + 2) //?n???????k,??
		{
			for (i = 3;i <= k;i = i + 2) //????i?????
			{
				a = 0;
				b = 0;
				for (j = 3;j <= Math.sqrt(i);j = j + 2)
				{
					r = i % j;
					if (r == 0F)
					{
					 a = 1;
					}
				}
				if (a == 0) //?i?????
				{
					l = k - i;
					for (j = 3;j <= Math.sqrt(l);j = j + 2) //????l?????
					{
						r = l % j;
						if (r == 0F)
						{
							b = 1;
						}
					}
					if (b == 0) //?l??????
					{
						System.out.printf("%d=%d+%d\n",k,i,l);
						break;
					}
					a = 0;
					b = 0;
				}
			}
		}
	}



}

