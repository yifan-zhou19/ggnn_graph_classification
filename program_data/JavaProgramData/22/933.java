package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int A = 0;
		int B = 0;
		char c;


		for (;;)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a = Integer.parseInt(tempVar);
		   }
		   if (A < a)
		   {
			   B = A;
			   A = a;
		   }
		   if (a < A && a> B)
		   {
			   B = a;
		   }
		   String tempVar2 = ConsoleInput.scanfRead(null, 1);
		   if (tempVar2 != null)
		   {
			   c = tempVar2.charAt(0);
		   }
		   if (c != ',')
		   {
			   break;
		   }
		}

		if (B < A && B != 0)
		{
		System.out.printf("%d\n",B);
		}
		else if (B == A || B == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

