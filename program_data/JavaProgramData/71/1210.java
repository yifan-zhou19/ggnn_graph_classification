package <missing>;

public class GlobalMembers
{
	public static int shirunnian(int a)
	{
		if (a % 4 != 0)
		{
			return 0;
		}
		else
		{
			if (a % 100 == 0 && a % 400 != 0)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] c = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int d;
		int e;
		int f;
		int s;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
					  sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				e = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				f = Integer.parseInt(tempVar4);
			}
			if (e > f)
			{
				s = e;
				e = f;
				f = s;
			}
			if (shirunnian(d) == 1)
			{
				for (i = e;i < f;i++)
				{
				sum += c[i];
				}
				if (sum % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				for (i = e;i < f;i++)
				{
				sum += b[i];
				}
				if (sum % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			n--;
		}
		return 0;
	}


}

