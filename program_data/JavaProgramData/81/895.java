package <missing>;

public class GlobalMembers
{
	public static int check(int m)
	{
		if (m <= 5 && m >= 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


	public static int Main()
	{
		int m;
		int n;
		int i;
		String temp = new String(new char[10]);
		char[][] a = new char[6][10];
		for (i = 1;i <= 5;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (check(m + 1) != 0 && check(n + 1) != 0)
		{
					 temp = a[m + 1];
					 a[m + 1] = a[n + 1];
					 a[n + 1] = temp;
					 for (i = 1;i <= 5;i++)
					 {
					 System.out.println(a[i]);
					 }

		}
		else
		{
			System.out.print("error");
		}


		return 0;
	}
}

