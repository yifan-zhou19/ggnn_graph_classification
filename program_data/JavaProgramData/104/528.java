package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int t;
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
		if (a == b)
		{
			System.out.printf("%d",a);
		}
		else
		{
			if (a < b)
			{
				t = a;
				a = b;
				b = t;
			}
			while (a / 2 != b)
			{
				a = a / 2;
				if (a / 2 < b)
				{
					t = a;
					a = b;
					b = t;
				}
			}
		System.out.printf("%d",b);
		}
	}
}

