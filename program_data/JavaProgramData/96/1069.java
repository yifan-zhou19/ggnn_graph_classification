package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		String a0 = new String(new char[100]);
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a0 = tempVar.charAt(0);
		}
		len = a0.length();
		for (int t = 0;t < len;t++)
		{
			a[t] = a0.charAt(t) - '0';
		}
		c[0] = a[0];
		if (len == 1 || (len == 2 && a[0] == 1 && a[1] < 3))
		{
		System.out.printf("%d",0);
		}
		for (int i = 0;i < len - 1;i++)
		{
			b[i] = 10 * c[i] + a[i + 1];
			c[i] = b[i] % 13;
			d[i] = (b[i] - c[i]) / 13;
			c[i + 1] = c[i];
			if (d[i] == 0 && i == 0)
			{
				;
			}
			else
			{
			System.out.printf("%d",d[i]);
			}
		}
		System.out.printf("\n%d",c[len - 1]);
	}
}

