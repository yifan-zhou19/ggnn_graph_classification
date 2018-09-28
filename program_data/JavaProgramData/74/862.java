package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int p;
		int flag;
		int a;
		int ok;
		int w;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		ok = 1;
		for (i = m;i <= n;i++)
		{
			a = 0;
			flag = 1;
			for (p = 2;p <= i / 2;p++)
			{
				if (i % p == 0)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				continue;
			}
			w = i;
			while (w != 0)
			{
				b = w % 10;
				a = a * 10 + b;
				w = w / 10;
			}
			if (a == i)
			{
				printf((ok == 0)?",%d":"%d",i);
				ok = 0;
			}
		}
		if (ok == 1)
		{
			System.out.print("no");
		}
	}

}

