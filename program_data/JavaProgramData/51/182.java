package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int f(String c, int i, int j)
	{
		int k;
		for (k = 0;k < n;k++)
		{
		if (!c[i + k].equals(c[j + k]))
		{
		return 0;
		}
		}
		return 1;
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_c = new String(new char[510]);
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[][] Main_s = new int[500][2];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int sum = 0;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static char c[510];
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int s[500][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		Main_c = new Scanner(System.in).nextLine();
		for (i = 0;Main_c.charAt(i) != 0;i++)
		{
			;
		}
		m = i;
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < sum;j++)
			{
			if (f(Main_c, i, Main_s[j][0]) != 0)
			{
				Main_s[j][1]++;
				break;
			}
			}
			if (j == sum)
			{
				Main_s[sum][0] = i;
				Main_s[sum][1] = 1;
				sum++;
			}
		}
		k = 0;
		for (i = 0;i < sum;i++)
		{
			k = (k > Main_s[i][1])?k:Main_s[i][1];
		}
		if (k == 1)
		{
		System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",k);
		for (i = 0;i < sum;i++)
		{
		if (k == Main_s[i][1])
		{
			for (j = 0;j < n;j++)
			{
		System.out.printf("%c",Main_c.charAt(Main_s[i][0] + j));
			}
		System.out.print("\n");
		}
		}
		}
	}

}

