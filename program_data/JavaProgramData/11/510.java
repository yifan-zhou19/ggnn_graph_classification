package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
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


		 if (b == 1)
		 {
			 x = c;
		 }
		 if (b == 2)
		 {
			 x = 31 + c;
		 }
		 if (b == 3)
		 {
			 x = 31 + 28 + c;
		 }
		 if (b == 4)
		 {
			 x = 31 + 28 + 31 + c;
		 }
		 if (b == 5)
		 {
			 x = 31 + 28 + 31 + 30 + c;
		 }
		 if (b == 6)
		 {
			 x = 31 + 28 + 31 + 30 + 31 + c;
		 }
		 if (b == 7)
		 {
			 x = 31 + 28 + 31 + 30 + 31 + 30 + c;
		 }
		 if (b == 8)
		 {
			 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + c;
		 }
		 if (b == 9)
		 {
			 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + c;
		 }
		 if (b == 10)
		 {
			 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
		 }
		 if (b == 11)
		 {
			 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c;
		 }
		 if (b == 12)
		 {
			 x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c;
		 }

		if (b <= 2)
		{
			System.out.printf("%d\n",x);
		}
		else
		{
			if (a % 4 == 0)
			{
				if (a % 100 == 0)
				{
					if (a % 400 == 0)
					{
						System.out.printf("%d\n",x + 1);
					}
					else
					{
						System.out.printf("%d\n",x);
					}
				}
				else
				{
					System.out.printf("%d\n",x + 1);
				}
			}
			else
			{
				System.out.printf("%d\n",x);
			}
		}
			return 0;
	}
}

