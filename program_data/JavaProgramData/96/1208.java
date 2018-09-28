package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int i;
		int len;
		len = str.length();
		for (i = 0;i < len;i++)
		{
			a[i] = str.charAt(i) - '0';
		}
		b[0] = a[0];
		if (len == 1)
		{
			System.out.print("0");
		}
		if (len == 2 && a[1] < 3 && a[0] == 1)
		{
			System.out.print("0");
		}
		for (i = 0;i < len - 1;i++)
		{
			c[i] = b[i] * 10 + a[i + 1];
			b[i] = c[i] % 13;
			d[i] = (c[i] - b[i]) / 13;
			b[i + 1] = b[i];
			if (d[i] == 0 && i == 0)
			{
				;
			}
			else
			{
			System.out.printf("%d",d[i]);
			}
		}
		System.out.printf("\n%d",b[len - 1]);
	}
}

