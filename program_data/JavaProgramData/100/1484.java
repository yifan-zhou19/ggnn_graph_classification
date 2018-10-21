package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch = new String(new char[300]);
		int n;
		int k = 0;
		int[] a = new int[100];
		int p = 0;
		int l;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
		n = ch.length();
		for (i = 65;i <= 90;i++,k++)
		{
			for (j = 0;j < n;j++)
			{
				if (ch.charAt(j) == i)
				{
					a[k] = a[k] + 1;
				}
			}
			if (a[k] > 0)
			{
				System.out.printf("%c=%d\n",i,a[k]);
			}
		}
		for (i = 97;i <= 122;i++,k++)
		{
			for (j = 0;j < n;j++)
			{
				if (ch.charAt(j) == i)
				{
					a[k] = a[k] + 1;
				}
			}
			if (a[k] > 0)
			{
				System.out.printf("%c=%d\n",i,a[k]);
			}
		}
		for (l = 0;l < 52;l++)
		{
			if (a[l] > 0)
			{
				p = p + 1;
			}
		}
		if (p == 0)
		{
			System.out.print("No\n");
		}
	}
}

