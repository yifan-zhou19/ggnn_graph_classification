package <missing>;

public class GlobalMembers
{
	public static int huiwen(int i,int w)
	{
		int k;
		k = Math.pow(10,w);
		int m;
		if (w == 0)
		{
			return (1);
		}
		if (w >= 1)
		{
			 if (i / k != i % 10)
			 {
				 return (0);
			 }
			 if (i / k == i % 10)
			 {
				 i = (i - k * (i / k)) / 10;
				 w = w - 2;
				 m = huiwen(i, w);
				 return (m);
			 }
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int w;
		int k;
		int j;
		int count = 0;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			w = Math.log10(i);
			k = huiwen(i, w);
			if (k == 1)
			{
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j == i)
				{
					a[count] = i;
					count++;
				}
			}
			else
			{
				continue;
			}
		}
		if (count == 0)
		{
			System.out.print("no");
		}
		if (count > 0)
		{
			for (i = 0;i < count - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[count - 1]);
		}
	}

}

