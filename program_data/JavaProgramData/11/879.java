package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int[] d = new int[12];
		   int a;
		   int b;
		   int c;
		   int i;
		   int sum = 0;
		   int run = int x;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   c = Integer.parseInt(tempVar3);
		   }
		   for (i = 1;i < b;i++)
		   {
			   if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10))
			   {
				   d[i] = 31;
				   sum += d[i];
			   }
			   else if ((i == 4) || (i == 6) || (i == 9) || (i == 11))
			   {
				   d[i] = 30;
				   sum += d[i];
			   }
			   else
			   {
				   if (run(a) == 1)
				   {
					   d[i] = 29;
				   }
				   else
				   {
					   d[i] = 28;
				   }
				   sum += d[i];
			   }
		   }
		   sum += c;
		   System.out.printf("%d\n",sum);
	}
	public static int run(int x)
	{
		int z;
		if ((x % 400 == 0) || ((x % 100 != 0) && (x % 4 == 0)))
		{
			z = 1;
		}
		return z;
	}
}

