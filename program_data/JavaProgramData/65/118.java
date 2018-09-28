package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int A;
		int B;
		A = 0;
		B = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int j = 0;j < n;j++)
		{
			if (a[j] == b[j])
			{
				A++;
				B++;
			}
			else if ((a[j] == 0) && (b[j] == 1))
			{
				A++;
			}
			else if ((a[j] == 1) && (b[j] == 2))
			{
				A++;
			}
			else if ((a[j] == 2) && (b[j] == 0))
			{
				A++;
			}
			else
			{
				B++;
			}
		}
		if (A > B)
		{
			System.out.print("A");
		}
		if (B > A)
		{
			System.out.print("B");
		}
		if (B == A)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

