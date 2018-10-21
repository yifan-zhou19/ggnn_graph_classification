package <missing>;

public class GlobalMembers
{
	//****************************************
	//???????2?N??
	//??????
	//?????2010.12.18
	//???????2?N??
	//****************************************
	public static int Main()
	{
		int N; //???????????i,j,m
		int i;
		int j;
		int m;
		int[] a = new int[31]; //???????????
		int[] b = new int[31];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE)); //?a????
		a[0] = 1;
		for (i = 1; i < 31; i++)
		{
			a[i] = 0; //?a????1
		}
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			for (m = 0; m < N; m++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(b,0,(Integer.SIZE / Byte.SIZE)); //??????b????
				i = 30;
				while (a[i] == 0)
				{
					i--; //?????????
				}
				//??????2
				for (j = 0; j <= i; j++)
				{
					b[j] = a[j] * 2;
				}
				for (j = 0; j < i + 1; j++)
				{
					//??10???
					if (b[j] >= 10)
					{
						b[j + 1] += b[j] / 10;
						b[j] %= 10;
					}
				}
				//?a????????2
				for (j = 0; j < i + 2; j++)
				{
					a[j] = b[j];
				}
			}
			j = i + 1;
			while (b[j] == 0)
			{
				j--; //????????????
			}
			for (; j >= 0; j--)
			{
				System.out.print(b[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

