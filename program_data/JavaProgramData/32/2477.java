package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int i;
		int k;
		int la;
		int lb;
		String t = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = tempVar2.charAt(0);
			}
			la = t.length();
			for (i = la - 1;i >= 0;i--)
			{
				a[i] = t.charAt(la - i - 1) - '0';
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = tempVar3.charAt(0);
			}
			lb = t.length();
			for (i = lb - 1;i >= 0;i--)
			{
				b[i] = t.charAt(lb - i - 1) - '0';
			}

			for (i = 0;i < lb;i++)
			{
				a[i] = a[i] - b[i];
				if (a[i] < 0)
				{
					a[i] += 10;
					a[i + 1] -= 1;
				}
			}
			while (a[i] < 0)
			{
				a[i] += 10;
				a[++i] -= 1;
			}
			la--;
			while (a[la] == 0)
			{
				la--;
			}
			for (i = la;i >= 0;i--)
			{
				System.out.printf("%d",a[i]);
			}
			System.out.print("\n");
		}
	}

}

