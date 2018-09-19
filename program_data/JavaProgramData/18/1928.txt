package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static int[][] a = new int[101][101];
	 public static void g0(int n)
	 {
		 if (n == 1)
		 {
			 return; //??????????????0
		 }
		 else
		 {
			int min;
			for (int i = 1;i <= n;i++)
			{
				min = a[i][1];
				for (int j = 1;j <= n;j++)
				{
						min = min <= a[i][j] != 0?min:a[i][j];
				}
				for (int j = 1;j <= n;j++)
				{
					a[i][j] -= min;
				}
			} //????????
			for (int i = 1;i <= n;i++)
			{
			min = a[1][i];
			for (int j = 1;j <= n;j++)
			{
					min = min <= a[j][i] != 0?min:a[j][i];
			}
			for (int j = 1;j <= n;j++)
			{
				a[j][i] -= min;
			}
			} //????????
			sum += a[2][2]; //??
			for (int i = 2;i <= n - 1;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					a[i][j] = a[i + 1][j]; //?????????????????
				}
			}
			for (int i = 2;i <= n - 1;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					a[j][i] = a[j][i + 1]; //?????????????
				}
			}
		 }
		 g0(n - 1); //??????0??
	 }
	public static int Main()
	{
		int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= n;k++)
		{
		sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 1;i <= n;i++)
			{
			   for (int j = 1;j <= n;j++)
			   {
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
			}
		g0(n);
		System.out.print(sum);
		System.out.print("\n");
		}
		return 0;

	}

}

