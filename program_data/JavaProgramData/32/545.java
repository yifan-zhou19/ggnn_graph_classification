package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int l;
		int m;
		int i;
		int j;
		String c = new String(new char[101]);
		String d = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = tempVar3.charAt(0);
			}
			l = c.length();
			m = d.length();
			for (i = 0;i < l;i++)
			{
				a[i] = c.charAt(i) - '0';
			}
			for (j = 0;j < m;j++)
			{
				b[j + l - m] = d.charAt(j) - '0';
			}
			for (i = l - 1;i >= l - m;i--)
			{
				a[i] = a[i] - b[i];
				if (a[i] < 0)
				{
					a[i] += 10;
					a[i - 1]--;
				}
			}
			while (a[i] < 0 && i>0)
			{
				a[i] += 10;
				i--;
				a[i]--;
			}
			for (j = 0;j < l;j++)
			{
				if (a[j] != 0)
				{
					break;
				}
			}
			for (i = j;i < l;i++)
			{
				System.out.printf("%d",a[i]);
			}
			System.out.print("\n");
		}

	}
}

