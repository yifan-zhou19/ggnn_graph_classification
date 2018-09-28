package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		int[] q = new int[100];
		int i = 1;
		int j = 0;
		int a;
		int r;
		int r1;
		int num = char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		r = num(c.charAt(0));
		if (c.charAt(1) == 0)
		{
			a = 0;
			System.out.printf("%d",a);
		}
		else
		{
		for (j = 0;;j++)
		{
			a = r * 10 + num(c.charAt(i));
			if (a >= 13)
			{
				q[j] = a / 13;
				r = a % 13;
				i = i + 1;
			}
			else
			{
				if (j != 0 && c.charAt(i + 1) != '\0')
				{
					q[j] = 0;
				j++;
				}
				if (c.charAt(i + 1) == '\0')
				{
					q[j] = 0;
					r = a;
					break;
				}
				a = r * 100 + num(c.charAt(i)) * 10 + num(c.charAt(i + 1));
				q[j] = a / 13;
				r = a % 13;
				i = i + 2;

			}
			if (c.charAt(i) == '\0')
			{
				break;
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("%d",q[i]);
		}
		}
		System.out.print("\n");
		System.out.printf("%d\n",r);
		return 0;
	}

	public static int num(char c)
	{
		int y;
		y = c - '0';
		return y;
	}
}

