package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int k;
		int huiwen = int k;
		int n;
		int m;
		int i;
		int[] a = new int[100];
		int h = 0;
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
			if ((sushu(i) == 1) && (huiwen(i) == 1))
			{
				a[h] = i;
				h++;
			}
		}
		if (h == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < h;i++)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}
	public static int sushu(int k)
	{
		int i;
		int j = 0;
		int s;
		for (i = 2;i <= Math.sqrt(k);i++)
		{
			if (k % i == 0)
			{
				j++;
			}
		}
		if (j == 0)
		{
			s = 1;
		}
		else
		{
			s = 0;
		}
		return (s);
	}
	public static int huiwen(int k)
	{
		int i = 0;
		int j;
		int s = k;
		int p = 0;
		int[] a = new int[10];
		while (k != 0)
		{
			a[i] = k % 10;
			k = k / 10;
			i++;
		}
		for (j = 0;j < i;j++)
		{
		   p = p * 10 + a[j];
		}
		if (p == s)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}


}

