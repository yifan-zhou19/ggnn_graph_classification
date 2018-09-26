package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{ //i??
			for (j = 3;j <= (int)i / 2;j = j + 2)
			{
					int num = 0; //j?????
					for (k = 1;k <= (int)Math.sqrt(j);k = k + 2)
					{
					   if (j % k == 0)
					   {
						   num++;
					   }
					}
					int num2 = 0;
					for (l = 1;l <= (int)Math.sqrt(i - j);l = l + 2)
					{ //i-j???????
					   if ((i - j) % l == 0)
					   {
						   num2++;
					   }
					}
					if (num == 1 && num2 == 1)
					{
						System.out.printf("%d=%d+%d\n",i,j,(i - j));
						break;
					}
			}
		}
			return 0;
	}

}

