package <missing>;

public class GlobalMembers
{
	public static void monkey(int a,int b)
	{
		int[] t = new int[500];
		int i;
		int j;
		int q = 0;
		int time;
		//sc("%d%d",&a,&b);

		for (i = 0;i < 500;i++)
		{
			t[i] = -3;
		}
		for (i = 0;i < a;i++)
		{
			t[i] = 0;
		}

		for (i = 0;i < a - 1;i++)
		{
			time = 0;
			for (j = 0;;j++)
			{
				if (q >= a)
				{
					q = q - a;
				}

				if (t[q] == 0)
				{
					time++;
				}
				q++;
				if (time == b)
				{
					t[q - 1] = 1;
					break;
				}

			}
		}
		for (i = 0;i < a;i++)
		{
			if (t[i] == 0)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}
	public static void Main()
	{
		int[] c = new int[100];
		int[] d = new int[100];
		int i;
		int j;
		for (i = 0;i < 100;i++)
		{
			c[i] = -1;
			d[i] = -1;
		}
		i = 0;
		while (!(c[i - 1] == 0 && d[i - 1] == 0))
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		for (j = 0;j < i - 1;j++)
		{
			monkey(c[j], d[j]);
		}
	}
}

