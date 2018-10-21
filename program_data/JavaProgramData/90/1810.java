package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static f(int a,int b)
	{
		int s = 0;
		int x;
		int y;
		if (a == 0 || a == 1 || b == 1)
		{
			s = 1;
		}

		else
		{
			if (a >= b)
			{
				x = f(a - b,b);
			   y = f(a,b - 1);
			}
			else
			{
				x = 0;
				y = f(a,a);
			}
			s = x + y;
		}
		return s;
	}



	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",f(m,n));
		}
		return 0;
	}
}

