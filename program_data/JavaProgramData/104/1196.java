package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int[][] a = new int[2][10];
		int i;
		int j;
		int k;
		int[] len = new int[2];
		int f;
		x = i = j = k = f = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(len, 0, (Integer.SIZE / Byte.SIZE));
		for (j = 0; j < 2; j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			i = 0;
			do
			{
				a[j][i] = x;
				if (x % 2 == 1)
				{
					x--;
				}
				x /= 2;
				i++;
			} while (x != 1 && x != 0);
			a[j][i] = 1;
			len[j] = i;
			/*
			for (; i>=0; i--)
				printf("%d ", a[j][i]);
			printf("\n");
			*/
		}
		if (a[0][0] == a[1][0])
		{
			System.out.printf("%d", a[0][0]);
			f = 1;
		}
		else
		{
			for (i = len[0], j = len[1]; i >= 0 && j >= 0; i--, j--)
			{
				if (a[0][i] != a[1][j])
				{
					System.out.printf("%d", a[0][i + 1]);
					f = 1;
					break;
				}
				if (i == 0)
				{
					System.out.printf("%d", a[0][0]);
					break;
				}
				if (j == 0)
				{
					System.out.printf("%d", a[1][0]);
					break;
				}
			}
		}
		//getchar();getchar();
		return 0;
	}

}

