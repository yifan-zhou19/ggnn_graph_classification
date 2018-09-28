package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static int i;
	public static int j;
	public static int lenth;
	public static String flag1;
	public static String flag2;
	public static String start = a;
	public static String move;


	public static void print()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		if (move != start)
		{
			for (p = flag1.Substring(1);p < flag2;p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.print(" ");
		}

		else
		{
			for (p = flag1;p < flag2;p++)
			{
		System.out.printf("%c",*p);
			}
		}
	}

	public static void Main()
	{
		a = new Scanner(System.in).nextLine();

		lenth = a.length();
		move = a.Substring(lenth) - 1;

		for (flag1 = move.Substring(1);move >= start;move--)
		{
			if (move == ' ' || move == start)
			{
				flag2 = flag1;
				flag1 = move;
				print();
			}


		}

	}
}
