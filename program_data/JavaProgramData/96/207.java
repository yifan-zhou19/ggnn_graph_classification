package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int[] b = new int[100];

		int i;
		int x;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		s = a.length();
	if (((s == 2) && (a.charAt(0) > 48)) || (s > 2))
	{
		if ((a.charAt(0) == 49) && (a.charAt(1) < 52) && (s>2))
		{
			x = (a.charAt(0) - 48) * 100 + (a.charAt(1) - 48) * 10 + a.charAt(2) - 48;
			b[0] = x / 13;
			x = x % 13;
			for (i = 3;a.charAt(i) != '\0';i++)
			{
				x = 10 * x + (a.charAt(i) - 48);

				b[i - 2] = x / 13;
				x = x % 13;
			}
			for (i = 0;i < s - 2;i++)
			{
				System.out.printf("%d",b[i]);
			}
			System.out.printf("\n%d",x);
		}
		if (((a.charAt(0) - 48) * 10 + a.charAt(1) - 48) > 12)
		{
			x = (a.charAt(0) - 48) * 10 + a.charAt(1) - 48;

			b[0] = x / 13;
			x = x % 13;
			for (i = 2;i < s;i++)
			{
				x = 10 * x + a.charAt(i) - 48;

				b[i - 1] = x / 13;
				x = x % 13;
			}
			for (i = 0;i < s - 1;i++)
			{
				System.out.printf("%d",b[i]);
			}

			System.out.printf("\n%d",x);
		}
	}
	if (s == 1)
	{
	System.out.print("0\n");
	System.out.printf("%d",(a.charAt(0) - 48));
	}
	if ((s == 2) && (a.charAt(0) == 49) && (a.charAt(1) < 51))
	{
	   System.out.print("0\n");
	   System.out.printf("%d",(a.charAt(0) - 48) * 10 + a.charAt(1) - 48);
	}
	return 0;
	}








}

