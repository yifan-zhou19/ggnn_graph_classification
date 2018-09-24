package <missing>;

public class GlobalMembers
{
	//***********************
	//*?????2?N??****
	//*??????**********
	//*???1000012832******
	//***********************
	public static int shumu(int[] a)
	{
		int k;
		for (k = 99; a[k] == 0; k--)
		{
		}
		return k;
	}
	public static int Main()
	{
		int N;
		int[] a = new int[100];
		int i;
		int m;
		int j;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE)); //?????
		a [0] = 2; //?a[0]???
		if (N == 0) //??0??????1
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else if (N == 1) //??1??????2
		{
			System.out.print(2);
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i <= N - 1; i++) //??N???2????????N-1?2
			{
				m = shumu(a) + 1; //????????????
				for (j = 0; j < m; j++)
				{
					a[j] = a[j] * 2; //?????????2
				}
				for (j = 0; j < m; j++)
				{
					if (a[j] >= 10) //????10?????
					{
					a[j + 1]++;
					a[j] = a[j] - 10;
					}
				}
			}
		if (a[m] == 0) //?????M+1????0
		{
			for (i = m - 1; i >= 0; i--) //??m???
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
		else if (a[m] != 0) //???1
		{
			for (i = m; i >= 0; i--) //??M+1???
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
		}
		return 0;
	}
}

