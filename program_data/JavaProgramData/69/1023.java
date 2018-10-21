package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		int[] c = new int[250];
		int i;
		int j = 0;
		int d;
		int s;
		int n1;
		int n2;
		int max;
		int pan = 0;
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
		n1 = a.length();
		n2 = b.length();
		if (n1 > n2)
		{
			max = n1;
			d = n1 - n2;
			for (i = n1 - 1;i - d >= 0;i--)
			{
				s = a.charAt(i) + b.charAt(i - d) - '0'-'0';
				if (s + j > 9)
				{
					c[i] = s - 10 + j;
					j = 1;
				}
				else
				{
					c[i] = s + j;
					j = 0;
				}
			}
			for (i = d - 1;i >= 0;i--)
			{
				s = a.charAt(i) + j - '0';
				if (s > 9)
				{
					c[i] = s - 10;
					j = 1;
				}
				else
				{
					c[i] = s;
					j = 0;
				}
			}
		}
		else
		{
			max = n2;
			d = n2 - n1;
			for (i = n2 - 1;i - d >= 0;i--)
			{
				s = b.charAt(i) + a.charAt(i - d) - '0'-'0';
				if (s + j > 9)
				{
					c[i] = s - 10 + j;
					j = 1;
				}
				else
				{
					c[i] = s + j;
					j = 0;
				}
			}
			for (i = d - 1;i >= 0;i--)
			{
				s = b.charAt(i) + j - '0';
				if (s > 9)
				{
					c[i] = s - 10;
					j = 1;
				}
				else
				{
					c[i] = s;
					j = 0;
				}
			}
		}
		if (j == 1)
		{
			System.out.print("1");
		}
		for (i = 0;i < max;i++)
		{
			if (c[i] != 0)
			{
				pan = 1;
			}
			if (pan == 1 || (pan == 0 && j == 1))
			{
				System.out.printf("%d",c[i]);
			}
		}
		if (pan == 0 && j == 0)
		{
			System.out.print("0");
		}
	}


}

