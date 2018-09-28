package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static int[] b = new int[9999];
	public static int i;
	public static int j;
	public static int k;
	public static int l = 0;
	public static int p;
	public static int temp1 = 0;
	public static int temp2 = 0;
	public static void P(int m,int n)
	{
		void sushu();
		for (i = m;i <= n;i++)
		{
			sushu();
			if (temp1 == 0)
			{
				p = i;
				for (j = 0;p >= 10;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, p % 10);
					p = p / 10;
				}
				a = tangible.StringFunctions.changeCharacter(a, j, p);
				for (k = 0;k <= j;k++)
				{
					if (a.charAt(k) != a.charAt(j - k))
					{
						temp2 = 1;
						break;
					}
				}
				if (temp2 == 0)
				{
					b[l] = i;
					l++;
				}
			}
			temp1 = 0;
			temp2 = 0;
		}
		if (l == 0)
		{
			System.out.print("no");
		}
		else
		{
		for (i = 0;i < l - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[l - 1]);
		}
	}

	public static void Main()
	{
		int m;
		int n;
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
		P(m, n);
	}
	public static void sushu()
	{
	if (i != 2)
	{
				for (j = 2;j <= i / 2;j++)
				{
					if (i % j == 0)
					{
						temp1 = 1;
						break;
					}
				}
	}
	}
}

