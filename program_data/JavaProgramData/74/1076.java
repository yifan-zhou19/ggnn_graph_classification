package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int q;
		int p;
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		int t;
		int temp;
		int flag = 0;
		int[] a = new int[100];
		int[] s = new int[500];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}

		for (m = p;m <= q;m++)
		{
			n = m;
			for (i = 0;;i++)
			{
				if (n == 0)
				{
					break;
				}
				else
				{
					a[i] = n % 10;
					n = n / 10;
				}

			}
			for (j = 0;j < i;j++)
			{
				temp = 0;
				if (a[j] != a[i - j - 1])
				{
					temp = 1;
					break;
				}
			}

			if (temp == 0)
			{
				s[k] = m;
				k++;
			}
		}
		temp = 0;

		for (i = 0;i < k;i++)
		{
			for (j = 2;j < Math.sqrt(s[i]) + 1;j++)
			{
				if (s[i] % j == 0)
				{
					temp = 1;
					break;
				}
			}

			if (temp == 0)
			{
				if (flag == 0)
				{
					System.out.printf("%d",s[i]);
					flag++;
				}
				else
				{
					System.out.printf(",%d",s[i]);
					temp = 1;
				}

			}

			temp = 0;

		}

		if (flag == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}


}

