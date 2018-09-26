package <missing>;

public class GlobalMembers
{
	public static int yue(int n,int m)
	{
		int[] b = new int[100000];

		int k;
		int s = 0;
		int t;
		int p;
		t = n;
		for (k = 0,p = m;;k = (k + 1) % n)
		{
			if (b[k] == 0)
			{
				s++;
				if (s == p)
				{
					s = 0;
					b[k] = 1;
					t--;
					if (t != 0)
					{
					if (m % t != 0)
					{
					p = m % t;
					}
					else
					{
					p = t;
					}
					}
					if (t == 0)
					{
					return (k + 1);
					}
				}
			}
		}
	}
	public static int Main()
	{
		int i;
		int l;
		int x;
		int y;
		int t;
		int[] a = new int[100];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			if (x == 0 && y == 0)
			{
			break;
			}
			else
			{
		   a[i] = yue(x, y);
			}
		}
		for (t = i,i = 0;i < t;i++)
		{
		System.out.printf("%d\n",a[i]);
		}
	}

}

