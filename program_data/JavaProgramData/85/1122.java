package <missing>;

public class GlobalMembers
{
	public static String juzi = new String(new char[1000]);
	public static int islegal(String juzi, int n)
	{
		int q;
		if ((juzi[0].compareTo('z') > 0 || juzi[0].compareTo('a') < 0) && (juzi[0].compareTo('Z') > 0 || juzi[0].compareTo('A') < 0) && !juzi[0].equals('_'))
		{
			return 0;
		}
		for (q = 1;q < n;q++)
		{
			if ((juzi[q].compareTo('z') > 0 || juzi[q].compareTo('a') < 0) && (juzi[q].compareTo('Z') > 0 || juzi[q].compareTo('A') < 0))
			{
				if (juzi[q].compareTo('9') > 0 || juzi[q].compareTo('0') < 0)
				{
					if (!juzi[q].equals('_'))
					{
						return 0;
					}
				}
			}
		}
		return 1;
	}





	public static void Main()
	{
		int n;
		String m = new String(new char[6]);
		m = new Scanner(System.in).nextLine();
		n = Integer.parseInt(m);
		while (n-- != 0)
		{
			juzi = new Scanner(System.in).nextLine();
			int len = juzi.length();
			if (islegal(juzi, len) == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}

}
