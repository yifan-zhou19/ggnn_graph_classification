package <missing>;

public class GlobalMembers
{
	public static void fun(String data)
	{
		 int len = data.length();
		 int i;
		 int ya;

		 ya = (data[0].equals('_') || (data[0].compareTo('A') >= 0 && data[0].compareTo('z') <= 0));

		 for (i = 1; i <= len - 1; i++)
		 {
			   if (!alphabet && !number)
			   {
						 ya = 0;
			   }
		 }

		 System.out.printf("%d\n", ya);
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		String data = new String(new char[81]);

		for (i = 1; i <= n; i++)
		{
			  data = new Scanner(System.in).nextLine();
			  fun(data);
		}

		return 0;
	}


}

