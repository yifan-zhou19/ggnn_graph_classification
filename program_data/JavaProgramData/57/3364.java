package <missing>;

public class GlobalMembers
{
	public static int su(String m)
	{
		int n;
		int k;
		n = m.length();
		if (m[n - 1].equals('r'))
		{
			k = 1;
		}
		if (m[n - 1].equals('y'))
		{
			k = 2;
		}
		if (m[n - 1].equals('g'))
		{
			k = 3;
		}
		return (k);
	}


	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] str = new char[100][100];
		int i;
		for (i = 0;i <= n - 1;i++)
		{
		str[i] = new Scanner(System.in).nextLine();
		}

		int j;
		int m;
		for (j = 0;j <= n - 1;j++)
		{
			m = String.valueOf(str[j]).length();
		//printf("%d\n",m);
		//int c;
		//c=su(str[j]);
		//printf("%d\n",c);
		if (su(str[j]) == 3)
		{
			str[j][m - 3] = '\0';
		}
		else
		{
			str[j][m - 2] = '\0';
		}
		System.out.println(str[j]);
		System.out.print("\n");
		}


	}



}

