package <missing>;

public class GlobalMembers
{
	//?????????? 

	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Test //???????????????????????????
	//	{
	//		double total;
	//		double eff;
	//		double rate;
	//	}
	//	test[100];

		for (i = 0;i < n;i++) //????????
		{
			test[i].total = ConsoleInput.readToWhiteSpace(true);
			test[i].eff = ConsoleInput.readToWhiteSpace(true);
			test[i].rate = test[i].eff / test[i].total;
		}

		for (i = 1;i < n;i++) //????????????????????
		{
			if (test[i].rate - test[0].rate > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}

			else if (test[0].rate - test[i].rate > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}

			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}

		return 0;
	}
}

