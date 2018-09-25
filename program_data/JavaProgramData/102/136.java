package <missing>;

public class GlobalMembers
{
	public static int nancom(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int nvcom(Object a, Object b)
	{
		return *(int)b - (int)a;
	}

	public static int Main()
	{
		int[] nan = new int[40];
		int[] nv = new int[40];
		double hai = 0;
		int inthai = 0;

		final String tmp = "";
		int i = 0;
		int j = 0;
		int num = 0;
		int nanNum = 0;
		int nvNum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}

		while (i < num)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tmp = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				hai = Double.parseDouble(tempVar3);
			}
			inthai = hai * 1000;

			if (tmp.charAt(0) == 'm')
			{
				nan[nanNum++] = inthai;
			}
			else
			{
				nv[nvNum++] = inthai;
			}
			i++;
		}

		qsort(nan[0], nanNum, (Integer.SIZE / Byte.SIZE), nancom);
		qsort(nv[0], nvNum, (Integer.SIZE / Byte.SIZE), nvcom);
		for (i = 0;i < nanNum;i++)
		{
			hai = (double)nan[i] / 1000;
			System.out.printf("%.2f ",hai);
		}

		for (i = 0;i < nvNum;i++)
		{
			hai = (double)nv[i] / 1000;
			if (i == 0)
			{
				System.out.printf("%.2f",hai);
			}
			else
			{
				System.out.printf(" %.2f",hai);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

