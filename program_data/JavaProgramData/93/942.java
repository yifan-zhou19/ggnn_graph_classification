package <missing>;

public class GlobalMembers
{
	//***************************************************************************************************************************
	/* @file   2ndfor1
	 * @author ??
	 * @date   2012-9-26
	 * @desc   ???????????? - 
	 */
	public static int Main() //?????
	{
		int a; //????
		int b;
		int c;
		int z;
		z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = z % 3 == 0; //??z?3?5?7???????????a?b?c=1
		b = z % 5 == 0;
		c = z % 7 == 0;
		if (a != 0 && b != 0 && c != 0)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else if (a != 0 && b != 0)
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		else if (a != 0 && c != 0)
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		else if (b != 0 && c != 0)
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		else if (a)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (b)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (c)
		{
			System.out.print("7");
			System.out.print("\n");
		}
		else
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}
}

