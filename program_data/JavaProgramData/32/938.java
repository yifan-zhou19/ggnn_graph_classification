package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int la;
		int lb;
		int j;
		int t;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			t = 0;
			for (j = 0;j < 100;j++)
			{
				c[j] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			la = a.length();
			lb = b.length();
			for (j = 0;j < lb;j++)
			{
				c[j] = c[j] + a.charAt(la - 1 - j) - b.charAt(lb - 1 - j);
				if (c[j] < 0)
				{
					c[j] = c[j] + 10;
					c[j + 1] -= 1;
				}
			}
			for (j = lb;j < la;j++)
			{
				c[j] = c[j] + a.charAt(la - 1 - j) - 48;
			}
			for (j = 99;j >= 0;j--)
			{
				if (c[j] != 0)
				{
					System.out.printf("%d",c[j]);
					t = 1;
				}
				else if (t != 0)
				{
					System.out.printf("%d",c[j]);
				}
			}
			System.out.print("\n");
		}
	}
}

