package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int a1 = 3;
		int a2 = 5;
		int a3 = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		if (N % a1 == 0 && N % a2 == 0 && N % a3 == 0)
		{
			System.out.print("3 5 7\n");
		}
		else if (N % a1 == 0 && N % a2 == 0 && N % a3 != 0)
		{
		System.out.print("3 5\n");
		}
		else if (N % a2 == 0 && N % a3 == 0 && N % a1 != 0)
		{
			System.out.print("5 7\n");
		}
		else if (N % a1 == 0 && N % a3 == 0 && N % a2 != 0)
		{
			System.out.print("3 7\n");
		}
		else if (N % a1 == 0 && N % a2 != 0 && N % a3 != 0)
		{
			System.out.print("3\n");
		}
		else if (N % a2 == 0 && N % a1 != 0 && N % a3 != 0)
		{
			System.out.print("5\n");
		}
		else if (N % a3 == 0 && N % a1 != 0 && N % a2 != 0)
		{
			System.out.print("7\n");
		}
		else if (N % a1 != 0 && N % a2 != 0 && N % a3 != 0)
		{
			System.out.print("n\n");
		}
	}







}

