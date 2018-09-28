package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		void suan(int a);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		suan(n);

	}
	public static void suan(int a)
	{
		int s;
		if (a == 1)
		{
			System.out.print("End");
		}
		else if (a % 2 == 0)
		{
			s = a / 2;
			if (s != 1)
			{
				System.out.printf("%d/2=%d\n",a,s);
			suan(s);
			}
			else
			{
				System.out.printf("%d/2=%d\n",a,s);
			System.out.print("End");
			}

		}
		else if (a % 2 != 0)
		{
			s = a * 3 + 1;
			System.out.printf("%d*3+1=%d\n",a,s);
			suan(s);
		}
	}
}

