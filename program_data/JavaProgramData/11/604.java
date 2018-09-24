package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int p;
		int a;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p = Integer.parseInt(tempVar3);
		}
		if (m % 4 != 0 || (m % 100 == 0 && m % 400 != 0))
		{
		if (n == 1)
		{
			a = p;
		}
		else if ((n + 1) % 2 == 0 && (n + 1) > 9)
		{
		a = 61 * (n - 1) / 2 - 1 + p;
		}
		else if ((n - 1) % 2 == 0 && (n + 1) < 9)
		{
		a = 61 * (n - 1) / 2 - 2 + p;

		}
	else if (n == 2)
	{
			a = 31 + p;
	}


			else
			{
			a = 61 * (n - 2) / 2 + 29 + p;
			}

		}
		else
		{
		if ((n - 1) % 2 == 0 && (n + 1) < 9)
		{
		a = 61 * (n - 1) / 2 - 1 + p;

		}
		else if ((n + 1) % 2 == 0 && (n + 1) > 9)
		{
		a = 61 * (n - 1) / 2 + p;
		}
		else if (n == 1)
		{
			a = p;
		}
	else if (n == 2)
	{
			a = 31 + p;
	}


			else
			{
			a = 61 * (n - 2) / 2 + 30 + p;
			}

		}


		System.out.printf("%d",a);
	}


}

