package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i;
		int t;
		int num;
		int j;
		int k;
		int max = new int(int a,int b);
		int min = new int(int a,int b);
		char c;
	//input the sequence
		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i - 1] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
		}

		num = i;
	//???
		for (j = 1;j <= num - 1;j++)
		{
			for (k = num;k >= j + 1;k--)
			{
				t = max(a[k - 1], a[k - 2]);
				a[k - 1] = min(a[k - 1], a[k - 2]);
				a[k - 2] = t;
			}
		}
	//find the sec_max
		for (i = 1;i <= num - 1;i++)
		{
			if (a[i - 1] != a[i])
			{
			break;
			}
		}
		if (i < num - 1)
		{
			System.out.printf("%d",a[i]);
		}
		else
		{
			if (i == num - 1)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.print("No");
			}
		}
		return 0;
	}


	//the function to find the larger and the smaller

	public static int max(int a,int b)
	{
		int e;
		if (a < b)
		{
			e = b;
		}
		else
		{
			e = a;
		}
		return e;
	}

	public static int min(int a,int b)
	{
		int e;
		if (a > b)
		{
			e = b;
		}
		else
		{
			e = a;
		}
		return e;
	}
}

