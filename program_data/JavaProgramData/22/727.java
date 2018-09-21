package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 0;
		int c;
		int i;
		char x;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			if (x == 44)
			{
			for (i = 1;i <= 300;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c = Integer.parseInt(tempVar3);
				}
				if (c > a)
				{
					b = a;
					a = c;
				}
				if (c == a)
				{
					a = a;
					b = b;
				}
				if (a > c && c >= b)
				{
					a = a;
					b = c;
				}
				if (c < b)
				{
					a = a;
					b = b;
				}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				x = tempVar4.charAt(0);
			}
			if (x != 44)
			{
				break;
			}
			}
			}
			if (b != 0)
			{
				System.out.printf("%d",b);
			}
			if (b == 0)
			{
				System.out.print("No");
			}
			return 0;
	}
}

