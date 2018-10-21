package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] A = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			A[i] = a;
		}
		for (i = n - 1;i >= 0;i--)
		{
			if (i > 0)
			{
			System.out.printf("%d ",A[i]);
			}
			else
			{
				System.out.printf("%d",A[i]);
			}
		}
		return 0;
	}

}

