package <missing>;

public class GlobalMembers
{
	public static int cutsign(String s, int len)
	{
		if (s[len - 1].equals('y') || s[len - 1].equals('r'))
		{
			return len - 2;
		}
		else
		{
			return len - 3;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sign = new int[50];
		char[][] s = new char[50][15];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		sign[i] = cutsign(s[i], String.valueOf(s[i]).length());
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < sign[i];j++)
			{
				System.out.printf("%c",s[i][j]);
			}
		System.out.print("\n");
		}
		return 0;
	}

}

