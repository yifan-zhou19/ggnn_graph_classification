package <missing>;

public class GlobalMembers
{
	public static int count(int a, int b)
	{
		if (a == 0 && b == 1)
		{
			return 1;
		}
		else if (a == 1 && b == 2)
		{
			return 1;
		}
		else if (a == 2 && b == 0)
		{
			return 1;
		}
		else if (a == b)
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[] A = new int[201];
		int[] B = new int[201];
		int a;
		int b;
		int i;
		int n;
		a = b = 0;
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
				A[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				B[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
						if (count(A[i], B[i]) == 1)
						{
							a++;
						}
						else if (count(A[i], B[i]) == 0)
						{
							b++;
						}
						else
						{
							;
						}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

