package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			int[] x = new int[100];
			int n;
			int i;
			int p;
			int y;
			final String c = "";
			int a;
			int b;
			int m;
			int num = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
			n = c.length();
			for (i = n - 1;i >= 0;i--)
			{
					m = Math.pow(a,n - 1 - i);
					if (c.charAt(i) < 65)
					{
			num = num + m * (c.charAt(i) - 48);
					}
			else if (c.charAt(i) < 96)
			{
			  num = num + (c.charAt(i) - 55) * m;
			}
			else
			{
				num = num + (c.charAt(i) - 87) * m;
			}
			}
		 y = 0;
			for (i = 0;;i++)
			{
					y++;
					x[i] = num % b;
					m = Math.pow(b,i);
					p = num / b;
					if (p < b)
					{
							break;
					}
					num = num / b;
			}
					if (p <= 9 && p>0)
					{
							System.out.printf("%d",p);
					}
					else
					{
						if (p > 9)
						{
							System.out.printf("%c",p + 55);
						}
					}
			for (i = y - 1;i >= 0;i--)
			{
					if (x[i] <= 9)
					{
							System.out.printf("%d",x[i]);
					}
					else
					{
							System.out.printf("%c",(x[i] + 55));
					}
			}
			System.out.print("\n");
	}

}

