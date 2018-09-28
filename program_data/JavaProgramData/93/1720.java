package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if ((x % 3 == 0) && (x % 5 == 0) && (x % 7 == 0))
		{
			System.out.print("3 5 7\n");
		}
		if ((x % 3 == 0) && (x % 5 == 0) && !(x % 7 == 0))
		{
			System.out.print("3 5\n");
		}
		if ((x % 3 == 0) && (x % 7 == 0) && !(x % 5 == 0))
		{
			System.out.print("3 7\n");
		}
		if ((x % 5 == 0) && (x % 7 == 0) && !(x % 3 == 0))
		{
			System.out.print("5 7\n");
		}
		if ((x % 3 == 0) && !(x % 5 == 0) && !(x % 7 == 0))
		{
			System.out.print("3\n");
		}
		if ((x % 5 == 0) && !(x % 3 == 0) && !(x % 7 == 0))
		{
			System.out.print("5\n");
		}
		if ((x % 7 == 0) && !(x % 5 == 0) && !(x % 3 == 0))
		{
			System.out.print("7\n");
		}
		if (!(x % 3 == 0) && !(x % 5 == 0) && !(x % 7 == 0))
		{
			System.out.print("n\n");
		}
	}

}

