package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int B = 0;
		int A = 0;
		int[][] h = new int[200][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[a][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h[a][1] = Integer.parseInt(tempVar3);
			}
		}
		for (b = 0;b < n;b++)
		{
			if (h[b][0] == 0 && h[b][1] == 1)
			{
				A += 1;
			}
			else if (h[b][0] == 1 && h[b][1] == 2)
			{
				A += 1;
			}
			else if (h[b][0] == 2 && h[b][1] == 0)
			{
				A += 1;
			}
			else if (h[b][1] == 0 && h[b][0] == 1)
			{
				B += 1;
			}
			else if (h[b][1] == 1 && h[b][0] == 2)
			{
				B += 1;
			}
			else if (h[b][1] == 2 && h[b][0] == 0)
			{
				B += 1;
			}
		}
		if (A > B)
		{
			System.out.print("A");
		}
		else if (B > A)
		{
			System.out.print("B");
		}
		else if (B == A)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

