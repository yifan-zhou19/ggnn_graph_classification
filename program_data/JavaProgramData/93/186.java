package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int t = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			i = 1;
		}
		if (n % 5 == 0)
		{
			t = 1;
		}
		if (n % 7 == 0)
		{
			m = 1;
		}
		if (i == 1 && t == 1 && m == 1)
		{
			System.out.print("3 5 7");
		}
		else if (i == 1 && t == 1)
		{
			System.out.print("3 5");
		}
		else if (i == 1 && m == 1)
		{
			System.out.print("3 7");
		}
		else if (t == 1 && m == 1)
		{
			System.out.print("5 7");
		}
		else if (i == 1)
		{
			System.out.print("3");
		}
		else if (t == 1)
		{
			System.out.print("5");
		}
		else if (m == 1)
		{
			System.out.print("7");
		}
		else
		{
			System.out.print("n");
		}
	}


}

