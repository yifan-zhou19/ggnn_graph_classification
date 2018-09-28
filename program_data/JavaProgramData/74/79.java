package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
			  int i;
			  int a;
			  int z;
			   a = Math.sqrt(n);
			  for (i = 2;i <= a;i++)
			  {
				if (n % i == 0)
				{
				  z = 0;
				  break;
				}
			  }
			if (i > a)
			{
				z = 1;
			}
			return (z);
	}
	public static int huiwen(int n)
	{
		int y;
		int i;
		int t;
		int w = 0;
		int s = 0;
		s = n;
		for (i = n;i > 0;i = (i / 10))
		{
			t = i % 10;
			w = w * 10 + t;
		}
		if (w == s)
		{
			y = 1;
		}
		else
		{
			y = 0;
		}
		return (y);
	}


	public static void Main()
	{
		int m;
		int n;
		int i;
		int k;
		int t;
		int j = 0;
		int s = 0;
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
			 k = sushu(i);
			t = huiwen(i);
			if (k == 1 && t == 1)
			{
			 s = s + 1;
			}
		}
		 if (s == 0)
		 {
			 System.out.print("no");
		 }


			for (i = m;i <= n;i++)
			{
			k = sushu(i);
			t = huiwen(i);
			if (k == 1 && t == 1)
			{
				System.out.printf("%d",i);
				break;
			}

			}
		 for (j = i + 1;j <= n;j++)
		 {
			k = sushu(j);
			t = huiwen(j);
			if (k == 1 && t == 1)
			{
				System.out.printf(",%d",j);
			}
		 }

	}

}

