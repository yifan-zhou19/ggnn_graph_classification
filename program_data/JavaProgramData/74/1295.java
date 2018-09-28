package <missing>;

public class GlobalMembers
{
	/*?? 
	??????? m ?n ??????????????????m ? n?????m ???n???????????????
	???????????? no (??????????????????123321?121)?
	 
	???? 
	m ? n ?1??????1??????
	 
	???? 
	?????????????????????????? no
	 
	???? 
	100  200
	 
	???? 
	101,131,151,181,191*/
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int s = 0;
		int t;
		int k = 0;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int huiwen = int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			t = 0;
			for (j = 1;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					t++;
				}
			}
				if (t == 1)
				{
					a[s++] = i;
				}
		}
	//for(i=0;i<=s-1;i++) printf("%d ",a[i]);
		for (i = 0;i < s;i++)
		{
			if (huiwen(a[i]) != 0)
			{
				b[k++] = a[i];
			}
		}
		if (k == 0)
		{
			System.out.print("no\n");
		}
		else if (k == 1)
		{
			System.out.printf("%d\n",b[0]);
		}
		else
		{
			System.out.printf("%d",b[0]);
			for (i = 1;i <= k - 1;i++)
			{
				System.out.printf(",%d",b[i]);
			}
		}
		return 0;
	}

	 public static int huiwen(int d)
	 {
		int re = 0;
		if (d < 10)
		{
				re = 1;
		}
		else if (d < 100)
		{
				if (d / 10 == d % 10)
				{
					re = 1;
				}
		}
		else if (d < 1000)
		{
				if (d / 100 == d % 10)
				{
						re = 1;
				}
		}
		else if (d < 10000)
		{
			re = 0;
		}
		else if (d < 100000)
		{
				if ((d / 10000 == d % 10) && ((d / 1000) % 10 == (d / 10) % 10))
				{
						re = 1;
				}
		}
		else if (d < 1000000)
		{
			re = 0;
		}

		else if (d < 10000000)
		{
				if ((d / 1000000 == d % 10) && ((d / 100000) % 10 == (d / 10) % 10) && ((d / 10000) % 10 == (d / 100) % 10))
				{
						re = 1;
				}
		}
		else if (d < 100000000)
		{
			re = 0;
		}

		else if (d < 1000000000)
		{
				if (d / 100000000 == d % 10 && ((d / 10000000) % 10 == (d / 10) % 10) && ((d / 1000000) % 10 == (d / 100) % 10) && (((d / 100000) % 10) == ((d / 1000) % 10)))
				{
					re = 1;
				}
		}
		else
		{
			re = 0;
		}
			return re;
	 }


}

