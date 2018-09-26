package <missing>;

public class GlobalMembers
{
	public static int fuck(int m,int n)
	{
		int s = 0;
		//printf("%d %d\n",m,n);
		switch (n)
		{
				 case 12 :
					 s += 2;
				 case 11 :
					 s += 3;
				 case 10 :
					 s += 2;
				 case 9 :
					 s += 3;
				 case 8 :
					 s += 3;
				 case 7 :
					 s += 2;
				 case 6 :
					 s += 3;
				 case 5 :
					 s += 2;
				 case 4 :
					 s += 3;
				 case 3 :
					 if ((m % 4 == 0 && m % 100 != 0) || m % 400 == 0)
					 {
						 s += 1;
					 }
				 case 2 :
					 s += 3;
		}
		return s;
	}
	public static int Main()
	{
		int n;
		int i;
		int y;
		int a;
		int b;
		int t;
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
							y = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							b = Integer.parseInt(tempVar4);
						}
						t = fuck(y, a) - fuck(y, b);
						if (t % 7 == 0)
						{
							System.out.print("YES\n");
						}
						else
						{
							System.out.print("NO\n");
						}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			n = Integer.parseInt(tempVar5);
		}
		return 0;

	}

}

