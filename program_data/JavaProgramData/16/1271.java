package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*    ??   1100012931                                 *
	//*    ??:  ?????                                 *
	//*    ???  2011.10.23                                *
	//********************************************************
	public static int Main()
	{
		int n;
		int b;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = n;
		if (b == 0)
		{
			System.out.print(b);
		}
		for (i = 0;b >= 1;i++)
		{
			k = b % 10; //?????????????
			b = b / 10; //????????
			System.out.print(k);
		}
		return 0;
	}







}

