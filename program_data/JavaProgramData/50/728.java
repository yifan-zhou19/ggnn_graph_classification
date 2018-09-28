package <missing>;

public class GlobalMembers
{
	public static int DJT(int m)
	{
		int i;
		int result = 0;
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
			result += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
			result += 30;
			}
			else
			{
			result += 28;
			}
		}
		result += 13;
		return result;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int DJT(int m);
	public static int Main()
	{
		int w;
		int i;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 13;i++)
		{
			m = DJT(i) % 7;
			if ((w == 1 && m == 5) || (w == 2 && m == 4) || (w == 3 && m == 3) || (w == 4 && m == 2) || (w == 5 && m == 1) || (w == 6 && m == 0) || (w == 7 && m == 6))
			{
				System.out.printf("%d\n",i);
			}
		}
	return 0;
	}



}

