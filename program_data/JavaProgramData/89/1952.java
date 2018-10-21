package <missing>;

public class GlobalMembers
{
	//******************************************
	//*?????????.cpp                 **
	//*??: ??     1100012808              **
	//*???2011.12.07                       **
	//******************************************
	public static int Main() //???
	{ //?????
		int n;
		int i;
		int j;
		int[] a = new int[100000];
		int flag = 0;
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				(p[4 * j])++;
			}
		}
		for (; p < (a + 4 * n); p = p + 4)
		{
			if (p[0] >= n - 1)
			{
				System.out.print((p - a) / 4);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	} //?????

}

