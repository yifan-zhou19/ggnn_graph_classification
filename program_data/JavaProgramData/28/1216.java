package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int[] a = new int[999];
		int j = 0;
		int sp = 999;
		int k = 0;
		int sp2 = 99999;
		char c;
		for (i = 0;i < 999;i++)
		{
			a[i] = 0;
		}
		i = 0;
		for (j = 0;j < sp;j++)
		{
			c = System.in.read();
			if (c == '\n')
			{
				sp = j;
			}
			else if (c == ' ')
			{
				for (k = 0;k < sp2;k++)
				{
					if (c != ' ')
					{
						i = i + 1;
						a[i] = a[i] + 1;
						sp2 = k;
					}
					else
					{
						c = System.in.read();
					}
				}
				sp2 = 99999;
			}
			else
			{
				a[i] = a[i] + 1;
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d,",a[j]);
		}
		System.out.printf("%d",a[i]);
		return 0;
	}

}
