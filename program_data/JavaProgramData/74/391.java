package <missing>;

public class GlobalMembers
{
	public static int f1(int x)
	{
		int i;
		int j = 1;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				j = 0;
				break;
			}
		}
		return (j);
	}
	public static int f2(int x)
	{
		int[] s = new int[10];
		int i;
		int j;
		int k = 1;
		for (i = 0;x != 0;i++)
		{
			s[i] = x % 10;
			x = x / 10;
		}
		for (j = 0;j < i - 1;j++,i--)
		{
			if (s[i - 1] != s[j])
			{
				k = 0;
				break;
			}
		}
		return (k);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
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
		j = 1;
		for (i = m;i <= n;i++)
		{
			if (f1(i) != 0 && f2(i) != 0)
			{
			  System.out.printf("%d",i);
			  j = 0;
			  break;
			}
		}
		if (j == 1)
		{
			System.out.print("no");
		}
		for (j = i + 1;j <= n;j++)
		{
			if (f1(j) != 0 && f2(j) != 0)
			{
				System.out.printf(",%d",j);
			}
		}
	}
}

