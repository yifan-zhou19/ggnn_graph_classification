package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[101][101];
	public static int n;
	public static int ans = 0;
	public static int findm(int x, int y)
	{
		 int i;
		 int j;
		 int minn = 1000000;
		 for (i = 0;i < y;++i)
		 {
			 if (array[x][i] < minn)
			 {
				 minn = array[x][i];
			 }
		 }
		 return minn;
	}
	public static int findn(int x, int y)
	{
		 int i;
		 int j;
		 int minn = 1000000;
		 for (i = 0;i < y;++i)
		 {
			 if (array[i][x] < minn)
			 {
				 minn = array[i][x];
			 }
		 }
		 return minn;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a;
		int b;
		int m;
		int minm;
		int[][] temp = new int[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;++k)
		{
			ans = 0;
			for (i = 0;i < n;++i)
			{
				for (j = 0;j < n;++j)
				{
					array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			} //????
			m = n;
			while (m > 1) //?n-1?
			{
				for (i = 0;i < m;++i)
				{
					minm = findm(i, m);
					for (j = 0;j < m;++j)
					{
						array[i][j] -= minm;
					}
				}
				for (i = 0;i < m;++i)
				{
					minm = findn(i, m);
					for (j = 0;j < m;++j)
					{
						array[j][i] -= minm;
					}
				} //??????????
				ans += array[1][1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(temp,0,(Integer.SIZE / Byte.SIZE));
				a = 0;
				b = 0; //???
				for (i = 0;i < m;++i)
				{
					if (i == 1)
					{
						continue;
					}
					for (j = 0;j < m;++j)
					{
						if (j == 1)
						{
							continue;
						}
						temp[a][b] = array[i][j];
						b++;
					}
					a++;
					b = 0;
				} //?????????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(array,0,(Integer.SIZE / Byte.SIZE));
				for (i = 0;i < a;++i)
				{
					for (j = 0;j < a;++j)
					{
						array[i][j] = temp[i][j];
					}
				} //??????
				m--;
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}

}

