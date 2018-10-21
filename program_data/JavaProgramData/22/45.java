package <missing>;

public class GlobalMembers
{
	public static int checkprime(int x)
	{
		int i;
		if (x == 2)
		{
			return 1;
		}
		else
		{
			for (i = 2;i <= Math.sqrt(x) + 1;i++)
			{
				if (x % i == 0)
				{
					return 0;
				}
			}
			return 1;
		}

	}

	public static int zuida(int x,int y)
	{
		if (y == 1)
		{
			return 1;
		}
		else
		{
		if (x % y == 0)
		{
			return y;
		}
		else
		{

		return zuida(y, x % y);
		}
		}
	}


	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[400];
		int n = 0;
		int max = 0;
		int max1 = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String s = new String(new char[1300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (p = s; * p != '\0';p++)
		{
			if (*p == ',')
			{
				n++;
			}
			else
			{
				a[n] = a[n] * 10 + (*p - '0');
			}
		}

		if (n == 0)
		{
			System.out.print("No");
			return 0;
		}
		for (i = 0;i <= n;i++)
		{
			if (a[i] > a[max])
			{
				max = i;
			}
		}

		for (i = 0;i <= n;i++)
		{
			if (a[i] < a[max])
			{
				break;
			}
		}
		if (i == (n + 1))
		{
			System.out.print("No");
			return 0;
		}
		else
		{
			max1 = i;
		for (j = i;j <= n;j++)
		{
				if (a[j] == a[max])
				{
					continue;
				}
				else
				{
				if (a[j] > a[max1])
				{
					max1 = j;
				}
				}
		}
		}

		System.out.printf("%d",a[max1]);

		return 0;

	}



}

