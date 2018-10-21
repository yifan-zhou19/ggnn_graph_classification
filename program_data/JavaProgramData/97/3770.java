package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int yuan;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yuan = Integer.parseInt(tempVar);
		}
		int n = 6;
		int[] shu = new int[n];
		int[] mian = new int[n];
		mian[0] = 100,mian[1] = 50,mian[2] = 20,mian[3] = 10,mian[4] = 5,mian[5] = 1;
		for (int i = 0;i < 6;i++)
		{
			e = yuan / mian[i];
			shu[i] = e;
			yuan = yuan - mian[i] * e;
			System.out.printf("%d\n",shu[i]);
		}
		return 0;
	}

}

