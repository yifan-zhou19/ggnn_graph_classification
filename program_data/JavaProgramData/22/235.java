package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int n;
		int i = 1;
		int s = 0;
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		while ((t = System.in.read()) == ',')
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[++i] = Integer.parseInt(tempVar2);
		}
		}
		n = i;
		if (n == 1)
		{
			System.out.print("No");
			return;
		}
		for (i = 2;i <= n;i++)
		{
			if (a[i] != a[1])
			{
				break;
			}
		}
		if (i == n + 1)
		{
			System.out.print("No");
			return;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] > s)
			{
				s = a[i];
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == s)
			{
				a[i] = 0;
			}
		}
		s = 0;
		for (i = 1;i <= n;i++)
		{
			if (a[i] > s)
			{
				s = a[i];
			}
		}
		System.out.printf("%d",s);
		return;
	}




}

