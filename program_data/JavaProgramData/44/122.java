package <missing>;

public class GlobalMembers
{
	public static int reserve(int num)
	{
		int[] a = new int[10];
		int b;
		int c;
		int d;
		int e;
		int i;
		int j;
		int l;
		for (i = 0;i < 10;i++)
		{
			 for (j = 9,a[i] = num;j > i;j--)
			 {
				   a[i] = a[i] / 10;
			 }
			 for (j = 9,b = 1;j > i;j--)
			 {
				   b = b * 10;
			 }
			 num = num - a[i] * b;
		}
		for (i = 0;i <= 9;i++)
		{
			 if (a[i] != 0)
			 {
			 break;
			 }
		}
		c = i;
		for (i = 9;i >= 0;i--)
		{
			 if (a[i] != 0)
			 {
			 break;
			 }
		}
		d = i;
		for (i = d,e = 0;i >= c;i--)
		{
			 for (j = d - c - (d - i);j > 0;j--)
			 {
				  a[i] = a[i] * 10;
			 }
			 e = e + a[i];
		}
		return e;
	}
	public static int Main()
	{
		int i;
		int a;
		for (i = 0;i < 6;i++)
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a = Integer.parseInt(tempVar);
			 }
			 System.out.printf("%d\n",reserve(a));
		}
		System.in.read();
		System.in.read();
	}



}

