package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mzs = new int[12];
		int[] shis = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		mzs[0] = 31;
		for (i = 1;i < 12;i++)
		{
			mzs[i] = mzs[i - 1] + md[i];
		}
		shis[0] = 13 - 1;
		for (i = 1;i < 12;i++)
		{
			shis[i] = mzs[i - 1] + 13 - 1;
		}
		for (i = 0;i < 12;i++)
		{
			if (shis[i] % 7 == 0 && w == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
			else if (shis[i] % 7 == 1 && w == 4)
			{
				System.out.printf("%d\n",i + 1);
			}
			else if (shis[i] % 7 == 2 && w == 3)
			{
				System.out.printf("%d\n",i + 1);
			}
			else if (shis[i] % 7 == 3 && w == 2)
			{
				System.out.printf("%d\n",i + 1);
			}
			else if (shis[i] % 7 == 4 && w == 1)
			{
				System.out.printf("%d\n",i + 1);
			}
			else if (shis[i] % 7 == 5 && w == 7)
			{
				System.out.printf("%d\n",i + 1);
			}
			else if (shis[i] % 7 == 6 && w == 6)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}

}

