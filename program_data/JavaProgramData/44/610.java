package <missing>;

public class GlobalMembers
{
	public static int fanxu(int num)
	{
		System.out.print(num % 10);
		if (num / 10 != 0)
		{
			fanxu(num / 10);
		}
	} //?????????
	public static int Main()
	{
		int[] shu = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			shu[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 6;i++)
		{
						if (shu[i] != 0 && shu[i] % 10 == 0)
						{
										do
										{
											shu[i] = shu[i] / 10;
										}while (shu[i] % 10 == 0);
						} //??10??????????10????
						if (shu[i] >= 0)
						{
									 fanxu(shu[i]);
									 System.out.print("\n");
						} //????????
						else
						{
							 System.out.print("-");
							 shu[i] = -shu[i];
							 fanxu(shu[i]);
							 System.out.print("\n");
						} //???????
		}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	return 0;
	}

}

