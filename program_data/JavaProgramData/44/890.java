package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		if (num == 0)
		{
		return 0;
		}
		else
		{
		if (num > 0)
		{
		int b;
		int x = 1;
		int y = 0;
		int i;
		int j;
		int k;
		int n = 0;
		b = num;
		for (i = 1;;i++)
		{
					 if (b % 10 == 0)
					 {
					 y++;
					 }
					 else
					 {
					 break;
					 }
					 b = b / 10;
		}
					 b = num;
		for (i = 1;;i++)
		{
					 if (b / 10 != 0)
					 {
					 x++;
					 }
					 else
					 {
					 break;
					 }
					 b = b / 10;
		}
					 b = num;
		int[] a = new int[x];
		int[] c = new int[x];
		for (j = 0;j < x;j++)
		{
						a[j] = b;
						b = b / 10;
		}
						int e;
		for (k = y;k < x;k++)
		{
						c[k] = a[k] % 10;
						e = x - k - 1;
						n += c[k] * Math.pow(10,e);
		}
						return n;
		}
						else
						{

		int b;
		int x = 1;
		int y = 0;
		int i;
		int j;
		int k;
		int n = 0;
		b = -num;
		for (i = 1;;i++)
		{
					 if (b % 10 == 0)
					 {
					 y++;
					 }
					 else
					 {
					 break;
					 }
					 b = b / 10;
		}
					 b = -num;
		for (i = 1;;i++)
		{
					 if (b / 10 != 0)
					 {
					 x++;
					 }
					 else
					 {
					 break;
					 }
					 b = b / 10;
		}
					 b = -num;
		int[] a = new int[x];
		int[] c = new int[x];
		for (j = 0;j < x;j++)
		{
						a[j] = b;
						b = b / 10;
		}
						int e;
		for (k = y;k < x;k++)
		{
						c[k] = a[k] % 10;
						e = x - k - 1;
						n += c[k] * Math.pow(10,e);
		}
						return (-n);
						}
		}
	}
	public static int Main()
	{
		  int n;
		  int a;
		  int b = 1;
		  for (b = 1;b <= 6;b++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  a = reverse(n);
		  System.out.printf("%d\n",a);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

