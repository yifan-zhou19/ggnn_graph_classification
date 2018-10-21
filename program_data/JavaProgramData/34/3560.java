package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:????
	 ***??:2012?11?15?
	 *************************/
	public static int num(int a) //????num????a???????
	{
		if (a % 2 == 0) //?a???
		{
			System.out.print(a);
			System.out.print("/2=");
			System.out.print(a / 2);
			System.out.print("\n");
			return (a / 2); //?num???a/2
		}
		else //?a???
		{
			System.out.print(a);
			System.out.print("*3");
			System.out.print("+1=");
			System.out.print(a * 3 + 1);
			System.out.print("\n");
			return (a * 3 + 1); //?num??a*3+1
		}
	}
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a != 1) //?a??1?????num
		{
			a = num(a);
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}
}

