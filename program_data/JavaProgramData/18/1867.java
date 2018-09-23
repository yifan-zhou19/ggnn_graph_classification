package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 2.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static void putout(int[][] a, int num)
	{
		for (int i = 0;i < num;i++)
		{
			for (int j = 0;j < num;j++)
			{
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("%3d", "\n");
		}
	}

	public static void cut1(int[][] a, int b, int num) //????????
	{
		int[][] a1 = new int[200][200];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(a1,a,40000);
		for (int i = num - 2;i >= 0;i--)
		{
			a1[b][i] = Math.min(a1[b][i],a1[b][i + 1]);
		}
		for (int i = 0;i < num;i++)
		{
			a[b][i] -= a1[b][0];
		}
	}

	public static void cut2(int[][] a, int b, int num) //????????
	{
		int[][] a1 = new int[200][200];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(a1,a,40000);
		for (int i = num - 2;i >= 0;i--)
		{
			a1[i][b] = Math.min(a1[i][b],a1[i + 1][b]);
		}
		for (int i = 0;i < num;i++)
		{
			a[i][b] -= a1[0][b];
		}
	}

	public static int remain(int[][] a, int num, int out) //????????????????????out
	{
		for (int i = 0;i < num;i++) //??????
		{
			cut1(a, i, num);
		}
		for (int i = 0;i < num;i++) //??????
		{
			cut2(a, i, num);
		}
		out = out + a[1][1]; //??a[1][1]
		for (int i = 1;i < num - 1;i++) //?????
		{
			for (int j = 0;j < num;j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (int i = 1;i < num - 1;i++) //?????
		{
			for (int j = 0;j < num - 1;j++)
			{
				a[j][i] = a[j][i + 1];
			}
		}
		num--; //?????
		if (num == 1)
		{
			return out;
		}
		else
		{
			return remain(a, num, out);
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int[][] a = new int[200][200]; //??a[100][100]
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,40000);
			for (int i = 0;i < n;i++) //????
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int p = remain(a, n, 0); //??a[1][1]??
			System.out.print(p);
			System.out.print("\n");
		}
		return 0;
	}

}

