package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] ml = new int[5];
	int[] mh = new int[5];
	int[][] w = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(mh,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(ml,0x77777777,(Integer.SIZE / Byte.SIZE));
	for (int i = 0;i < N;i++)
	{
		for (int j = 0;j < N;j++)
		{
		w[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (w[i][j] > mh[i])
		{
			mh[i] = w[i][j];
		}
		if (w[i][j] < ml[j])
		{
			ml[j] = w[i][j];
		}
		}
	}
	int b = 1;
	for (int i = 0;i < N;i++)
	{
		for (int j = 0;j < N;j++)
		{
			if ((w[i][j] == mh[i]) && (w[i][j] == ml[j]))
			{
			b = 0;
			System.out.print(i + 1);
			System.out.print(' ');
			System.out.print(j + 1);
			System.out.print(' ');
			System.out.print(w[i][j]);
			}
		}
	}
	if (b != 0)
	{
		System.out.print("not found");
	}
	return 0;
	}

}

