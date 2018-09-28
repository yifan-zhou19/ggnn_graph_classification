package <missing>;

public class GlobalMembers
{
	public static int check(char a)
	{
		if (a - 'a' >= 0 && a - 'z' <= 0)
		{
		return 1;
		}
	 else if (a - 'A' >= 0 && a - 'Z' <= 0)
	 {
		return 1;
	 }
	 else if (a - '_' == 0)
	 {
		return 1;
	 }
	   else
	   {
		return 0;
	   }
	}
	public static int check1(char a)
	{
		if (a - 'a' >= 0 && a - 'z' <= 0)
		{
		return 1;
		}
	 else if (a - 'A' >= 0 && a - 'Z' <= 0)
	 {
		return 1;
	 }
	 else if (a - '_' == 0)
	 {
		return 1;
	 }
	 else if (a - '0' >= 0 && a - '9' <= 0)
	 {
	   return 1;
	 }
	   else
	   {
		return 0;
	   }
	}
	public static int check2(String a, int n)
	{
		int i;
		int t;
		for (i = 1,t = 0;i < n;i++)
		{
		if (check1(a[i]) != 1)
		{
		  return 0;
		}
		}
		return 1;

	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[200][100];
		System.in.read();
		int i;
		int t;
		for (i = 1;i <= n;i++)
		{
		  a[i] = new Scanner(System.in).nextLine();
		t = String.valueOf(a[i]).length();
		if (check(a[i][0]) != 0 && check2(a[i], t) != 0)
		{
		 System.out.print("1\n");
		}
		 else
		 {
		 System.out.print("0\n");
		 }

		}



	}

}

