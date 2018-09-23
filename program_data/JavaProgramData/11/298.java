package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			if (b == 1)
			{
				System.out.printf("%d",c);
			}
			else if (b == 2)
			{
				System.out.printf("%d",31 + c);
			}
			else if (b == 3)
			{
				System.out.printf("%d",60 + c);
			}
			else if (b == 4)
			{
				System.out.printf("%d",91 + c);
			}
			else if (b == 5)
			{
				System.out.printf("%d",121 + c);
			}
			else if (b == 6)
			{
				System.out.printf("%d",152 + c);
			}
			else if (b == 7)
			{
				System.out.printf("%d",182 + c);
			}
			else if (b == 8)
			{
				System.out.printf("%d",213 + c);
			}
			else if (b == 9)
			{
				System.out.printf("%d",244 + c);
			}
			else if (b == 10)
			{
				System.out.printf("%d",274 + c);
			}
			else if (b == 11)
			{
				System.out.printf("%d",305 + c);
			}
			else if (b == 12)
			{
				System.out.printf("%d",336 + c);
			}
		}
		else
		{
			if (b == 1)
			{
				System.out.printf("%d",c);
			}
			else if (b == 2)
			{
				System.out.printf("%d",31 + c);
			}
			else if (b == 3)
			{
				System.out.printf("%d",59 + c);
			}
			else if (b == 4)
			{
				System.out.printf("%d",90 + c);
			}
			else if (b == 5)
			{
				System.out.printf("%d",120 + c);
			}
			else if (b == 6)
			{
				System.out.printf("%d",151 + c);
			}
			else if (b == 7)
			{
				System.out.printf("%d",181 + c);
			}
			else if (b == 8)
			{
				System.out.printf("%d",212 + c);
			}
			else if (b == 9)
			{
				System.out.printf("%d",243 + c);
			}
			else if (b == 10)
			{
				System.out.printf("%d",273 + c);
			}
			else if (b == 11)
			{
				System.out.printf("%d",304 + c);
			}
			else if (b == 12)
			{
				System.out.printf("%d",335 + c);
			}
		}

	}
}

