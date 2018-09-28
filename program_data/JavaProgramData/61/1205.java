package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int i;
		int[] A = new int[20];
		A[1] = 1;
		A[2] = 1;
		 for (i = 3;i <= n;i++)
		 {
			 A[i] = A[i - 1] + A[i - 2];
		 }
		return A[n];
	}

	public static int Main()
	{
		int n;
		int i;
		int p;
		int s;
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
				p = Integer.parseInt(tempVar2);
			}
			s = f(p);
			System.out.printf("%d\n",s);
		}

		return 0;
	}


}

