package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int Main()
	{
		void minus(char a[999],char b[999]);
		String a = new String(new char[999]);
		String b = new String(new char[999]);
		int n;
		int i;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
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
			minus(a, b);
		}
	}
	public static void minus(String a, String b)
	{
		int x;
		int y;
		int w;
		x = a.length();
		y = b.length();
		for (w = x - 1;w >= x - y;w--)
		{
				if (a[w].compareTo(b[w - x + y]) >= 0)
				{
					a[w] = a[w] - b[w - x + y];
				}
				else
				{
					a[w - 1]--;
					a[w] = a[w].Substring(10) - b[w - x + y];
				}

		}
		for (w = 0;w <= x - 1;w++)
		{
			if (a[w].equals(0))
			{
				continue;
			}
			else
			{
				break;
			}
		}
		for (w = w;w <= x - y - 1;w++)
		{
		System.out.printf("%c",a[w]);
		}
		for (w = x - y;w <= x - 1;w++)
		{
		System.out.printf("%d",a[w]);
		}
		System.out.print("\n");
	}
}

