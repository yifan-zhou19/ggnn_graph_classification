package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void pro(int n);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		pro(n);
	}
	public static void pro(int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *odd(int n),*head;
		int odd = int n;
		int[] head;
		int i;
		int j;
		head = odd(n);
		for (i = 0;head[i] <= n / 2;i++)
		{
			for (j = i;head[j] != 0;j++)
			{
				if (head[i] + head[j] == n)
				{
					System.out.printf("%d %d\n",head[i],head[j]);
				}
			}
		}
	}
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int *odd(int n)
	public static int odd(int n)
	{
		int i;
		int j;
		int k;
		int m = 0;
		int[] a = new int[1000];
		for (i = 3;i < n;i += 2)
		{
			k = Math.sqrt(i);
			for (j = 2;j <= k;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > k)
			{
				a[m] = i;
				m++;
			}
		}
		return (a);
	}


}

