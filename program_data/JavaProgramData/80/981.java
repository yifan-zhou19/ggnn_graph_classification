package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		int i = 0;
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			A = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			B = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			C = Integer.parseInt(tempVar6);
		}
	  while (a != A || b != B || c != C)
	  {
		if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12)
		{
			if (c == 31)
			{
				b++;
				c = 1;
			}
			else
			{
				c++;
			}
			if (b == 13)
			{
				a++;
				b = 1;
			}
		}
		else if (b == 4 || b == 6 || b == 9 || b == 11)
		{
			if (c == 30)
			{
				b++;
				c = 1;
			}
			else
			{
				c++;
			}
		}
		else if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			if (c == 29)
			{
				b++;
				c = 1;
			}
			else
			{
				c++;
			}

		}
		else
		{
			if (c == 28)
			{
				b++;
				c = 1;
			}
			else
			{
				c++;
			}

		}
		  i++;
	  }
		 System.out.printf("%d",i);
	}

}

