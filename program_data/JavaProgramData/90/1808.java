package <missing>;

public class GlobalMembers
{
	//?????



	//???? ??????????
	public static int placeMethodCounts(int m, int n)
	{

		//??????, ?????????????????????????
		if (m == 0 || n == 1)
		{
			return 1;
		}

		if (m >= n) //????????
		{
			return placeMethodCounts(m - n, n) + placeMethodCounts(m, n - 1);
		}
		else //??????????????????????
		{
			return placeMethodCounts(m, m);
		}
	}

	public static int Main()
	{
		int t;
		int i;
		int[] m = new int[MAX_T];
		int[] n = new int[MAX_T];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}

		for (i = 0; i < t; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0; i < t; i++)
		{
			System.out.printf("%d\n", placeMethodCounts(m[i], n[i]));
		}

		return 0;
	}
}

