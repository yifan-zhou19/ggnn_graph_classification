package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int[] A = new int[200];
		int[] B = new int[200];
		int[] C = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		0 < n <= 200;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				B[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				C[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			 if (B[i] == 1)
			 {
				 x = 1;
			 }
			 else if (B[i] == 2)
			 {
				 x = 31 + 1;
			 }
			 else if (B[i] == 3)
			 {
				 x = 31 + 28 + 1;
			 }
			 else if (B[i] == 4)
			 {
				 x = 31 + 28 + 31 + 1;
			 }
			 else if (B[i] == 5)
			 {
				 x = 31 + 28 + 31 + 30 + 1;
			 }
			 else if (B[i] == 6)
			 {
				 x = 31 + 28 + 31 + 30 + 31 + 1;
			 }
			 else if (B[i] == 7)
			 {
				 x = 31 + 28 + 31 + 30 + 31 + 30 + 1;
			 }
			 else if (B[i] == 8)
			 {
				 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 1;
			 }
			 else if (B[i] == 9)
			 {
				 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 1;
			 }
			 else if (B[i] == 10)
			 {
				 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 1;
			 }
			 else if (B[i] == 11)
			 {
				 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 1;
			 }
			 else if (B[i] == 12)
			 {
				 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 1;
			 }
			 if ((((A[i] % 4 == 0) && (A[i] % 100 != 0)) || (A[i] % 400 == 0)) && (B[i] > 2))
			 {
				 x = x + 1;
			 }
			 else
			 {
				 x = x;
			 }
			 if (C[i] == 1)
			 {
				 y = 1;
			 }
			 else if (C[i] == 2)
			 {
				 y = 31 + 1;
			 }
			 else if (C[i] == 3)
			 {
				 y = 31 + 28 + 1;
			 }
			 else if (C[i] == 4)
			 {
				 y = 31 + 28 + 31 + 1;
			 }
			 else if (C[i] == 5)
			 {
				 y = 31 + 28 + 31 + 30 + 1;
			 }
			 else if (C[i] == 6)
			 {
				 y = 31 + 28 + 31 + 30 + 31 + 1;
			 }
			 else if (C[i] == 7)
			 {
				 y = 31 + 28 + 31 + 30 + 31 + 30 + 1;
			 }
			 else if (C[i] == 8)
			 {
				 y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 1;
			 }
			 else if (C[i] == 9)
			 {
				 y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 1;
			 }
			 else if (C[i] == 10)
			 {
				 y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 1;
			 }
			 else if (C[i] == 11)
			 {
				 y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 1;
			 }
			 else if (C[i] == 12)
			 {
				 y = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 1;
			 }
			 if ((((A[i] % 4 == 0) && (A[i] % 100 != 0)) || (A[i] % 400 == 0)) && (C[i] > 2))
			 {
				 y = y + 1;
			 }
			 else
			 {
				 y = y;
			 }
			 if ((x - y) % 7 == 0)
			 {
			 System.out.print("YES\n");
			 }
			 else
			 {
			 System.out.print("NO\n");
			 }
		}
		return 0;
	}
}

