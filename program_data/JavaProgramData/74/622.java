package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int t;
		int i;
		int p = 0;
		int k;
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = a;i <= b;i++)
		{
			String str = new String(new char[20]);
			int flag = 0;
			str = String.format("%d", i);
			k = str.length();
			for (t = 0;t < k;t++)
			{
				if (str.charAt(t) != str.charAt(k - t - 1))
				{
					flag = 1;
				}
			}
			for (t = 2;t < i;t++)
			{
				if (i % t == 0)
				{
					flag = 1;
				}
			}
			if (i == 2)
			{
				flag = 0;
			}
			if (flag == 0)
			{
				c[p] = i;
				p++;
			}
		}
		if (p == 0)
		{
			System.out.print("no");
		}
		if (p == 1)
		{
			System.out.printf("%d",c[0]);
		}
		if (p > 1)
		{
			System.out.printf("%d",c[0]);
			for (i = 1;i < p;i++)
			{
				System.out.printf(",%d",c[i]);
			}
		}
	return 0;
	}

}

