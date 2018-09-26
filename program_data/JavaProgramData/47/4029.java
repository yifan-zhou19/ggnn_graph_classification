package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] m = new int[NUMBER];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		}
		int q;
		System.out.printf("%d",m[n - 1]);
		for (q = n - 2;q >= 0;q--)
		{
		System.out.printf(" %d",m[q]);
		}
	}
}

