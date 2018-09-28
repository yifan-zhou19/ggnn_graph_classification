package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[300][40];
		int[] b = new int[300];
		int c = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int r;
		int k;
		int p = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			b[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			c = c + b[i] + 1;
			if (c == 81)
			{
				for (j = p;j < i;j++)
				{
					System.out.printf("%s ",a[j]);
				}
				System.out.printf("%s\n",a[i]);
				c = 0;
				p = i + 1;
			}
			else if (c >= 82)
			{
				for (j = p;j < i - 1;j++)
				{
					System.out.printf("%s ",a[j]);
				}
				System.out.printf("%s\n",a[i - 1]);
				c = b[i] + 1;
				p = i;
			}
			else if (c < 81)
			{
				int d = 0;
				for (k = p;k < n;k++)
				{
					d = d + b[k] + 1;
				}
				if (d <= 80)
				{
				for (r = p;r < n - 1;r++)
				{
					System.out.printf("%s ",a[r]);
				}
				System.out.printf("%s",a[n - 1]);
	break;
				}
			}
		}
	}
}

