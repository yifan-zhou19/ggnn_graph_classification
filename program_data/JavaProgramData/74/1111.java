package <missing>;

public class GlobalMembers
{
	public static int q(int l)
	{
		int i;
		if (l % 2 == 0)
		{
			return 0;
		}
		else
		{
			for (i = 3;i <= Math.sqrt(l);i = i + 2)
			{
				if (l % i == 0)
				{
					break;
				}
			}
			if (i <= Math.sqrt(l))
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
	}
	public static int p(int l)
	{
		int i;
		int j;
		int h;
		String a = new String(new char[20]);
		i = 0;
		while (l != 0)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, l % 10);
			l = l / 10;
			i++;
		}
		for (j = 0;j < i;j++)
		{
			if (a.charAt(j) != a.charAt(i - j - 1))
			{
				break;
			}
		}
		if (j < i)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j = 0;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = n;i <= m;i++)
		{
			if (q(i) != 0 && p(i) != 0)
			{
				a[j] = i;
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < j;i++)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		System.out.print("\n");
	}

}

