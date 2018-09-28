package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a;
	   int B;
	   int C;
	   int D;
	   int E;
	   int F;
	   int G;
	   int H;
	   int I;
	   int J;
	   int K;
	   int L;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   a = (13 + n - 1) % 7;
	   if (a == 5)
	   {
		   System.out.print("1\n");
	   }
	   B = (31 + 13 + n - 1) % 7;
	   if (B == 5)
	   {
		   System.out.print("2\n");
	   }
	   C = (31 + 28 + 13 + n - 1) % 7;
	   if (C == 5)
	   {
		   System.out.print("3\n");
	   }
	   D = (31 + 28 + 31 + 13 + n - 1) % 7;
	   if (D == 5)
	   {
		   System.out.print("4\n");
	   }
	   E = (31 + 28 + 31 + 30 + 13 + n - 1) % 7;
	   if (E == 5)
	   {
		   System.out.print("5\n");
	   }
	   F = (31 + 28 + 31 + 30 + 31 + 13 + n - 1) % 7;
	   if (F == 5)
	   {
		   System.out.print("6\n");
	   }
	   G = (31 + 28 + 31 + 30 + 31 + 30 + 13 + n - 1) % 7;
	   if (G == 5)
	   {
		   System.out.print("7\n");
	   }
	   H = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 13 + n - 1) % 7;
	   if (H == 5)
	   {
		   System.out.print("8\n");
	   }
	   I = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 13 + n - 1) % 7;
	   if (I == 5)
	   {
		   System.out.print("9\n");
	   }
	   J = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 13 + n - 1) % 7;
	   if (J == 5)
	   {
		   System.out.print("10\n");
	   }
	   K = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 13 + n - 1) % 7;
	   if (K == 5)
	   {
		   System.out.print("11\n");
	   }
	   L = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 13 + n - 1) % 7;
	   if (L == 5)
	   {
		   System.out.print("12\n");
	   }
	   return 0;
	}

}

