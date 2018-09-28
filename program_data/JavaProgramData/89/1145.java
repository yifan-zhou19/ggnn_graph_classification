package <missing>;

public class GlobalMembers
{
	// ??????.cpp : ??????????????
	//



	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct celebrity
	//	{
	//		int num;
	//		int no;
	//	}
	//	knowed[10000];
		int x = 0;
		int y = 0;
		int temp;
		int n;
		int j = 0;
		int k = 0;
		int ins;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;;)
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ins = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (temp + ins == 0)
			{
				break;
			}
			if (knowed[ins].num < 0)
			{
				knowed[ins].num = 0;
			}
			if (knowed[ins].num >= 0)
			{
				knowed[ins].num++;
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			if (knowed[j].num == n - 1)
			{
				System.out.print(j);
				System.out.print("\n");
				y = 1;
				break;
			}
		}
		if (y == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

