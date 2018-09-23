package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int[][] array;
		int i;
		int j;
		int a = 1000;
		int b = 1000;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		array = new int[N];
		for (i = 0;i < N;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			array[i] = (int)malloc(N * (Integer.SIZE / Byte.SIZE));
			for (j = 0;j < N;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					array[i][j] = Integer.parseInt(tempVar2);
				}

				if (array[i][j] == 0 && i <= a != 0 && j <= b)
				{
					a = i;
					b = j;
				}
				if (array[i][j] == 0 && i >= c != 0 && j >= d)
				{
					c = i;
					d = j;
				}



			}
		}
		System.out.printf("%d",(c - a - 1) * (d - b - 1));
	}
}

