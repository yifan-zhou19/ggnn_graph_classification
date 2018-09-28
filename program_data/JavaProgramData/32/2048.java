package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int leng_a;
		int leng_b;
		int tag = 0;
		int[] a = new int[128];
		int[] b = new int[128];
		String s1 = new String(new char[128]);
		String s2 = new String(new char[128]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			for (i = 0;i < 128;i++)
			{
				a[i] = 0;
				b[i] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
			leng_a = s1.length();
			leng_b = s2.length();
			for (i = 0;i < leng_a;i++)
			{
				a[i] = s1.charAt(leng_a - i - 1) - '0';
			}
			for (i = 0;i < leng_b;i++)
			{
				b[i] = s2.charAt(leng_b - i - 1) - '0';
			}
			for (i = 0;i < leng_a;i++)
			{
				if (a[i] >= b[i])
				{
					a[i] -= b[i];
				}
				else
				{
					a[i] = a[i] - b[i] + 10;
					a[i + 1]--;
				}
			}
			tag = 0;
				for (i = leng_a - 1; i >= 0; i--)
				{
					if (a[i] != 0)
					{
						tag = 1;
					}
					if (tag == 1)
					{
						System.out.printf("%d",a[i]);
					}
					if (tag == 0 && i == 0)
					{
						System.out.print("0");
					}
				}
				System.out.print("\n");
		}
		return 0;
	}
}

