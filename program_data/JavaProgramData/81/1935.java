package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int MtxSwap = new int(int [][5], int, int);
		int[][] mtx = new int[5][5];
		int i;
		int j;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					mtx[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int m;
		int n;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (MtxSwap(mtx, m, n) != 0)
		{
			for (i = 0; i < 5; i++)
			{
				for (j = 0; j < 4; j++)
				{
					System.out.printf("%d ", mtx[i][j]);
				}
				System.out.printf("%d\n", mtx[i][j]);
			}
		}
		else
		{
			System.out.print("error\n");
		}
		return 0;
	}
	public static int MtxSwap(int[][] mtx, int m, int n)
	{
		if (m < 0 || m>4 || n < 0 || n>4)
		{
			return 0;
		}
		int[] tmp = new int[5];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(tmp, mtx[m], (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(mtx[m], mtx[n], (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(mtx[n], tmp, (Integer.SIZE / Byte.SIZE));
		return 1;
	}

}

