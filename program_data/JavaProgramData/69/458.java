package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[251];
		int[] b1 = new int[251];
		int[] c = new int[251];
		int i;
		int i1;
		int i2;
		int j1;
		int j2;
		int j3;
		int j4;
		int j5;
		int c1;
		int c2;
		int jinwei;
		int head;
		String a = new String(new char[251]);
		String b = new String(new char[251]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		c1 = a.length();
		c2 = b.length();
		a1[0] = b1[0] = 0;
		for (i1 = 1; i1 <= c1; i1++)
		{
			a1[i1] = a.charAt(i1 - 1) - '0';
		}
		for (i2 = 1; i2 <= c2; i2++)
		{
			b1[i2] = b.charAt(i2 - 1) - '0';
		}
		if (c1 >= c2)
		{
			for (i = c1; i >= c1 - c2 + 1; i--)
			{
				b1[i] = b1[i - c1 + c2];
			}
			for (j1 = c1 - c2; j1 >= 1; j1--)
			{
				b1[j1] = 0;
			}
			jinwei = 0;
			for (j2 = c1; j2 >= 0; j2--)
			{
				c[j2] = a1[j2] + b1[j2] + jinwei;
				jinwei = 0;
				if (c[j2] >= 10)
				{
					c[j2] = c[j2] - 10;
					jinwei++;
				}
			}
			head = 0;
			for (j4 = 0; j4 <= c1; j4++)
			{
				if (c[j4] != 0)
				{
						head = j4;
						break;
				}
			}
			if (head == 0 && c[0] == 0)
			{
				 System.out.print("0");
			}
			else
			{
				for (j3 = head; j3 <= c1; j3++)
				{
					System.out.printf("%d", c[j3]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			for (i = c2; i >= c2 - c1 + 1; i--)
			{
				a1[i] = a1[i - c2 + c1];
			}
			for (j1 = c2 - c1; j1 >= 1; j1--)
			{
				a1[j1] = 0;
			}
			jinwei = 0;
			for (j2 = c2; j2 >= 0; j2--)
			{
				c[j2] = a1[j2] + b1[j2] + jinwei;
				jinwei = 0;
				if (c[j2] >= 10)
				{
					c[j2] = c[j2] - 10;
					jinwei++;
				}
			}
			head = 0;
			for (j4 = 0; j4 <= c2; j4++)
			{
				if (c[j4] != 0)
				{
						head = j4;
						break;
				}
			}
			if (head == 0 && c[0] == 0)
			{
				 System.out.print("0");
			}
			else
			{
				for (j3 = head; j3 <= c2; j3++)
				{
					System.out.printf("%d", c[j3]);
				}
				System.out.print("\n");
			}
		}

			return 0;
	}
}

