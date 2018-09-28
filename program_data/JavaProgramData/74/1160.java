package <missing>;

public class GlobalMembers
{
	public static int check(int a)
	{
		int i;
		double k;
		k = Math.sqrt(a);
		for (i = 2;i <= k;i++)
		{
		  if (a % i == 0)
		  {
		  break;
		  }
		}
		if (i > k)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int checka(int b)
	{
	   int i;
	   int j;
	   int[] c = new int[100];
	   for (i = 0;b != 0;i++)
	   {
		  c[i] = b % 10;
		  b = b / 10;
	   }
	   for (j = 0;j <= i / 2;j++)
	   {
		   if (c[j] != c[i - 1 - j])
		   {
		   break;
		   }

	   }
	   if (j - 1 == i / 2)
	   {
	   return 1;
	   }
	   else
	   {
	   return 0;
	   }
	}
	public static int Main()
	{
		 int m;
		 int n;
		 int i;
		 int j;
		 int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = m;i <= n;i++)
		{
			if ((check(i) == 1) && (checka(i) == 1))
			{
				System.out.printf("%d",i);
			s++;
			break;
			}
		}
		for (j = i + 1;j <= n;j++)
		{
			if ((check(j) == 1) && (checka(j) == 1))
			{
				System.out.printf(",%d",j);
			s++;
			}
		}
	if (s == 0)
	{
		System.out.print("no");
	}
		System.in.read();
		System.in.read();
	}

}

