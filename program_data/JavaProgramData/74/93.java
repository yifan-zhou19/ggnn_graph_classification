package <missing>;

public class GlobalMembers
{
	public static int su(int a)
	{
		int i;
		int z = 1;
		for (i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
				z = 0;
			}
		}
		return z;
	}

	public static int hui(int a)
	{
		int temp;
		int b = 0;
		temp = a;
		while (temp != 0)
		{
			b = b * 10 + temp % 10;
			temp = temp / 10;
		}
		if (a == b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int m;
		int n;
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
		int i;
		int l = 0;
		int[] a = new int[100];
		int[] x = a;
		//i=hui(12321);
		for (i = m;i <= n;i++)
		{
				if (su(i) * hui(i) == 1)
				{
					l++;
					x[0] = i;
					x++;
				}
			 else
			 {
				 ;
			 }
		}
		if (x - a == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
		for (i = 1;i < l;i++)
		{
			System.out.printf(",%d",a[i]);
		}
		}
	}

}

