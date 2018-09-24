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
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
		{
			if (b == 1)
			{
				System.out.printf("%d\n",c);
			}
			else if (b == 2)
			{
				System.out.printf("%d\n",c + 31);
			}
			else if (b == 3)
			{
				System.out.printf("%d\n",c + 31 + 29);
			}
			else if (b == 4)
			{
				System.out.printf("%d\n",c + 31 + 29 + 31);
			}
			else if (b == 5)
			{
				System.out.printf("%d\n",c + 31 + 29 + 31 + 30);
			}
			else if (b == 6)
			{
				System.out.printf("%d\n",c + 31 + 29 + 31 + 30 + 31);
			}
			else if (b == 7)
			{
				System.out.printf("%d\n",c + 31 + 29 + 31 + 30 + 31 + 30);
			}
			else if (b == 8)
			{
				System.out.printf("%d\n",c + 31 + 29 + 31 + 30 + 31 + 30 + 31);
			}
			else if (b == 9)
			{
				System.out.printf("%d\n",c + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31);
			}
			else if (b == 10)
			{
				System.out.printf("%d\n",c + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30);
			}
			else if (b == 11)
			{
				System.out.printf("%d\n",c + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31);
			}
			else
			{
				System.out.printf("%d\n",c + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30);
			}
		}
		else
		{
			if (b == 1)
			{
				System.out.printf("%d\n",c);
			}
			else if (b == 2)
			{
				System.out.printf("%d\n",c + 31);
			}
			else if (b == 3)
			{
				System.out.printf("%d\n",c + 31 + 28);
			}
			else if (b == 4)
			{
				System.out.printf("%d\n",c + 31 + 28 + 31);
			}
			else if (b == 5)
			{
				System.out.printf("%d\n",c + 31 + 28 + 31 + 30);
			}
			else if (b == 6)
			{
				System.out.printf("%d\n",c + 31 + 28 + 31 + 30 + 31);
			}
			else if (b == 7)
			{
				System.out.printf("%d\n",c + 31 + 28 + 31 + 30 + 31 + 30);
			}
			else if (b == 8)
			{
				System.out.printf("%d\n",c + 31 + 28 + 31 + 30 + 31 + 30 + 31);
			}
			else if (b == 9)
			{
				System.out.printf("%d\n",c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31);
			}
			else if (b == 10)
			{
				System.out.printf("%d\n",c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30);
			}
			else if (b == 11)
			{
				System.out.printf("%d\n",c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31);
			}
			else
			{
				System.out.printf("%d\n",c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30);
			}
		}
	}

}

