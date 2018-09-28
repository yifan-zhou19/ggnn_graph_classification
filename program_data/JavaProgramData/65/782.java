package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] q = new int[n];
		int[] p = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
		if (q[i] == 0 && p[i] == 1 || (q[i] == 1 && p[i] == 2) || (q[i] == 2 && p[i] == 0))
		{
			a = a + 1;
		}
		if (p[i] == 0 && q[i] == 1 || (p[i] == 1 && q[i] == 2) || (p[i] == 2 && q[i] == 0))
		{
			b = b + 1;
		}
		} //printf("%d%d\n",a,b);
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;

	}
}

