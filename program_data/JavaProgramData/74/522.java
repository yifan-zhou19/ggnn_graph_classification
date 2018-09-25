package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int ce = int o;
		int hui = int a;
		int m;
		int n;
		int i;
		int j = 0;
		int[] t = new int[10];
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
				if (ce(i) == 1 && hui(i) == 1)
				{
					t[j] = i;
				j++;
				}
			}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{

		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",t[i]);
		}
		System.out.printf("%d",t[j - 1]);
		}
	}
	public static int ce(int o)
	{
		int k;
		int t;
		k = Math.sqrt(o);
		for (t = 2;t <= k;t++)
		{
			if (o % t == 0)
			{
				break;
			}
		}

		if (t > k)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int hui(int a)
	{
		int k = 0;
		int[] b = new int[10];
		int place;
		int flag = 1;
		int i;
		if (a <= 999)
		{
			place = 3;
		}
		else if (a <= 9999)
		{
			place = 4;
		}
		else if (a <= 99999)
		{
			place = 5;
		}
		else if (a <= 999999)
		{
			place = 6;
		}
		k = 0;

		for (i = 0;i < place;i++)
		{
			b[k] = a % 10;
			a = (a - b[k]) / 10;
			k++;
		}
		for (i = 0;i < k / 2;i++)
		{
			if (b[i] != b[k - 1 - i])
			{
				flag = 0;
				break;
			}
		}
		if (flag == 1)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}




}

