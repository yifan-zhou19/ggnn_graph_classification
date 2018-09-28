package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int M;
	   int N;
	   int K;
	   int t;
	   int i;
	   int num = new int(int a,int b);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   t = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= t;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   M = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   N = Integer.parseInt(tempVar3);
		   }
		K = num(M, N);
		System.out.printf("%d\n",K);
	   }
	}
	public static int num(int a,int b)
	{
		int z;
		if (b == 1)
		{
		  z = 1;
		}
		if (a <= b)
		{
			if (a == 1)
			{
				z = 1;
			}
			if (a == 2)
			{
				z = 2;
			}
			if (a == 3)
			{
				z = 3;
			}
			if (a == 4)
			{
				z = 5;
			}
			if (a == 5)
			{
				z = 7;
			}
			if (a == 6)
			{
				z = 11;
			}
			if (a == 7)
			{
				z = 15;
			}
			if (a == 8)
			{
				z = 22;
			}
			if (a == 9)
			{
				z = 30;
			}
		}
		if (a > b && b != 1)
		{
		  z = num(a, b - 1) + num(a - b, b);
		}
		return (z);
	}
}

