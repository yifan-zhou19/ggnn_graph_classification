package <missing>;

public class GlobalMembers
{
	public static int match(int n, int[] a, int[] b) //a ???b??
	{
		int i;
		int[] tempb = new int[1000];
		int[] tempa = new int[1000];
		for (i = 0;i < n;i++)
		{
			tempb[i] = b[i];
			tempa[i] = a[i];
		}
		if (n == 1)
		{
			if (a[0] > b[0])
			{
				return (200);
			}
			if (a[0] < b[0])
			{
				return (-200);
			}
			return (0);
		}
		else if (n > 1)
		{
			if (a[0] > b[0])
			{
				for (i = 0;i < n - 1;i++)
				{
				tempb[i] = tempb[i + 1];
				tempa[i] = tempa[i + 1];
				}
				return (match(n - 1, tempa, tempb) + 200);
			}
			else if (a[n - 1] > b[n - 1])
			{
				return (match(n - 1, a, b) + 200);
			}
			else
			{
				for (i = 0;i < n - 1;i++)
				{
					tempb[i] = tempb[i + 1];
				}
				if (a[n - 1] < b[0])
				{
					return (match(n - 1, a, tempb) - 200);
				}
				return (match(n - 1, a, tempb));
			}
		}
	}
	public static void Main()
	{
		int match = new int(int n,int a[1000],int b[1000]);
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
		int t1;
		int t2;
		int prize;
		int i;
		int j;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			else
			{
				for (i = 0;i < n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
				}
				for (i = 0;i < n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[i] = Integer.parseInt(tempVar3);
					}
				}
				for (i = 0;i < n;i++)
				{
					for (j = i + 1;j < n;j++)
					{
					if (a[j] > a[i])
					{
						t1 = a[j];
						a[j] = a[i];
						a[i] = t1;
					}
					if (b[j] > b[i])
					{
						t2 = b[j];
						b[j] = b[i];
						b[i] = t2;
					}
					}
				}
				prize = match(n, a, b);
				System.out.printf("%d\n",prize);
			}
		}
	}



































}

