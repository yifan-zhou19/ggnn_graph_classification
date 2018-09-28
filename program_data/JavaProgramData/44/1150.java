package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int rev = int a;
		int length = int a;
		int i;
		int[] a = new int[6];
		int[] c = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c[i] = rev(a[i]);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
	}
	public static int rev(int a)
	{
			int i;
			int l;
			int m;
			int[] b = new int[15];
			int c = 0;
			l = length(a);
			m = Math.pow(10,l - 1);
			for (i = 0;i < l;i++)
			{
				b[i] = a / m;
				a = a % m;
				m = m / 10;
			if (m == 0)
			{
				break;
			}
			}
			for (i = 0;i < l;i++)
			{
				c = c + b[i] * Math.pow(10,i);
			}
			return (c / 10);
	}
	public static int length(int a)
	{
			int i;
			int b = 1;
			int c;
			c = -1;
			for (i = 0;c != 0;i++)
			{
				c = a / b;
				b = b * 10;
			}
			return (i);
	}
}

