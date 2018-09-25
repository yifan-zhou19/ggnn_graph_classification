package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sr = 0;
		int px = new int(int a[100],int x,int k);
		void hb(int a[100],int b[100],int x,int y);
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		int x;
		int y;
		x = sr();
		y = sr();
		for (i = 0;i < x;i++)
		{
			a[i] = sr();
		}
		for (i = 0;i < y;i++)
		{
			b[i] = sr();
		}
		for (i = 0;i < x;i++)
		{
			a[i] = px(a, x, i);
		}
		for (i = 0;i < y;i++)
		{
			b[i] = px(b, y, i);
		}
		hb(a, b, x, y);
		return 0;
	}
	public static int sr()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		return (a);
	}
	public static int px(int[] a, int x, int k)
	{
		int i;
		int j;
		int temp;
		for (i = x - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		temp = a[k];
		return (temp);
	}
	public static void hb(int[] a, int[] b, int x, int y)
	{
		int i;
		for (i = 0;i < x;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}
		for (i = 0;i < y;i++)
		{
				System.out.printf(" %d",b[i]);
		}
	}

}

