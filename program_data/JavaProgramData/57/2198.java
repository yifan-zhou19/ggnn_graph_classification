package <missing>;

public class GlobalMembers
{
	public static void f(String str, int k)
	{
		int i;
		if (str[k - 3].equals('i') && str[k - 2].equals('n') && str[k - 1].equals('g'))
		{
			for (i = 0;i < k - 3;i++)
			{
				System.out.printf("%c",str[i]);
			}
		}
		else if (str[k - 2] = 'l' && str[k - 1].equals('y'))
		{
			for (i = 0;i < k - 2;i++)
			{
				System.out.printf("%c",str[i]);
			}
		}
		else if (str[k - 2] = 'e' && str[k - 1].equals('r'))
		{
			for (i = 0;i < k - 2;i++)
			{
				System.out.printf("%c",str[i]);
			}
		}
	}
	public static void Main()
	{
		int k;
		int t;
		int i;
		char[][] str = new char[50][30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i <= k;i++)
		{
			t = String.valueOf(str[i]).length();
			f(str[i], t);
			System.out.print("\n");
		}

	}



}

