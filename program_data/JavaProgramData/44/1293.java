package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reserve = int num;
		int num;
		int b;
		int[] a = new int[6];
		int i;
		for (i = 0;i <= 5;i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				num = a[i];
				b = reserve(num);
				System.out.printf("%d\n",b);
		}
	}
		public static int reserve(int num)
		{
		int c;
		int j;
		int n = 0;
		int s = 0;
		c = num;
		do
		{
				c = c / 10;
				n++;
		} while (c != 0);
		for (j = 1;j <= n;j++)
		{
				c = num;
				c = c / (Math.pow(10,(j - 1)));
				c = c % 10;
				s = s + c * Math.pow(10,(n - j));
		}
		return (s);
		}

}

