package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int a;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = n;
		if (b == 1)
		{
			System.out.print("End");
		}

		else
		{
			for (i = 1;i < 1000000;i++)
			{
			if (b % 2 == 1)
			{
				a = b * 3 + 1;
			System.out.printf("%d*3+1=%d\n",b,a);
			b = a;
			}
			else if (b % 2 == 0)
			{
				a = b / 2;
			System.out.printf("%d/2=%d\n",b,a);
			b = a;
			}
			if (a == 1)
			{
				System.out.print("End");
			break;
			}
			}
		}



		return 0;
	}

}

