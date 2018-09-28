package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int n = 0;
		int p = 0;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
			m = 3;
		}
		if (a % 5 == 0)
		{
			n = 5;
		}
		if (a % 7 == 0)
		{
			p = 7;
		}
		if (m + n + p == 15)
		{
			System.out.print("3 5 7");
		}
		else if (m + n + p == 8)
		{
			System.out.print("3 5");
		}
		else if (m + n + p == 10)
		{
			System.out.print("3 7");
		}
		else if (m + n + p == 12)
		{
			System.out.print("5 7");
		}
		else if (m + n + p == 3)
		{
			System.out.print("3");
		}
		else if (m + n + p == 5)
		{
			System.out.print("5");
		}
		else if (m + n + p == 7)
		{
			System.out.print("7");
		}
		else if (m + n + p == 0)
		{
			System.out.print("n");
		}


	}
}

