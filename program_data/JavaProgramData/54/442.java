package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int j;
	   int k;
	   int m;
	   int s = 1;
	   int a = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   j = 1;
	   for (;;)
	   {
		if (a == n)
		{
			System.out.printf("%d",m);
			break;
		}
		else if ((j * n) % (n - 1) != 0)
		{
			j = 1 + s++;
			a = 0;
		}
		 else
		 {
			   m = j * n / (n - 1) + k;
			   j = m;
			   a++;
		 }
	   }
	   System.out.print("\n");



	}


}

