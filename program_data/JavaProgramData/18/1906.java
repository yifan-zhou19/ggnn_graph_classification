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

	public static void cut1(int[][] a, int b, int num) //&#182;&#212;&#195;&#191;�&#187;DD&#189;&#248;DD1��&#227;
	{
		int[][] a1 = new int[N][N];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(a1,a,N * N * (Integer.SIZE / Byte.SIZE));
		for (int i = num - 2;i >= 0;i--)
		{
			a1[b][i] = Math.min(a1[b][i],a1[b][i + 1]);
		}
		for (int i = 0;i < num;i++)
		{
			a[b][i] -= a1[b][0];
		}
	}

	public static void cut2(int[][] a, int b, int num) //&#182;&#212;&#195;&#191;�&#187;�D&#189;&#248;DD1��&#227;
	{
		int[][] a1 = new int[N][N];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(a1,a,N * N * (Integer.SIZE / Byte.SIZE));
		for (int i = num - 2;i >= 0;i--)
		{
			a1[i][b] = Math.min(a1[i][b],a1[i + 1][b]);
		}
		for (int i = 0;i < num;i++)
		{
			a[i][b] -= a1[0][b];
		}
	}

	public static int remain(int[][] a, int num, int out) //&#182;&#212;&#195;&#191;�&#187;&#184;&#246;&#190;&#216;&#213;�&#189;&#248;DD1��&#227;o�&#207;&#251;&#188;&#245;?&#196;2���?&#172;2?&#188;&#198;&#203;&#227;out
	{
		for (int i = 0;i < num;i++) //&#182;&#212;&#195;&#191;�&#187;DD1��&#227;
		{
			cut1(a, i, num);
		}
		for (int i = 0;i < num;i++) //&#182;&#212;&#195;&#191;�&#187;�D1��&#227;
		{
			cut2(a, i, num);
		}
		out = out + a[1][1]; //�&#219;&#188;�a[1][1]
		for (int i = 1;i < num - 1;i++) //&#207;&#251;&#188;&#245;?�&#182;tDD
		{
			for (int j = 0;j < num;j++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		for (int i = 1;i < num - 1;i++) //&#207;&#251;&#188;&#245;?�&#182;t�D
		{
			for (int j = 0;j < num - 1;j++)
			{
				a[j][i] = a[j][i + 1];
			}
		}
		num--; //&#190;&#216;&#213;����&#187;&#189;�
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
			int[][] a = new int[N][N]; //&#214;&#216;&#214;&#195;a[200][200]
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,N * N * (Integer.SIZE / Byte.SIZE));
			for (int i = 0;i < n;i++) //�&#228;�&#235;&#190;&#216;&#213;�
			{
				for (int j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int p = remain(a, n, 0); //&#188;&#198;&#203;&#227;a[1][1]?&#196;o�
			System.out.print(p);
			System.out.print("\n");
		}
		return 0;
	}

}

