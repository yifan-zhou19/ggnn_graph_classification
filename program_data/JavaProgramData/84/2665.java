package <missing>;

public class GlobalMembers
{
	public static int mycompare(Object e1, Object e2)
	{
		return *((int)e2) - (int)e1;
	}

	public static int Main()
	{
		int n;
		int[] s = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		qsort(s, n, (Integer.SIZE / Byte.SIZE), mycompare);
		System.out.print(s[0]);
		System.out.print("\n");
		System.out.print(s[1]);
		System.out.print("\n");

		return 0;
	}
}

