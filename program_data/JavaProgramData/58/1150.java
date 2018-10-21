package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int n;
		int ok;
		int[] legal = new int[300];
		String inf = new String(new char[90]);
		legal['_'] = 1;
		for (i = 'a';i <= 'z';i++)
		{
		legal[i] = 1;
		}
		for (i = 'A';i <= 'Z';i++)
		{
		legal[i] = 1;
		}
		for (i = '0';i <= '9';i++)
		{
		legal[i] = 1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		inf = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
		inf = new Scanner(System.in).nextLine();
		l = inf.length();
		ok = 1;
		for (j = 0;j < l;j++)
		{
			ok &= legal[inf.charAt(j)];
		}
		if (inf.charAt(0) >= '0' && inf.charAt(0) <= '9')
		{
			ok = 0;
		}
		System.out.printf("%ld\n",ok);
		}
		return 0;
	}

}

