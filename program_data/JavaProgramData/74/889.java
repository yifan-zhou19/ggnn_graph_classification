package <missing>;

public class GlobalMembers
{
	public static int prime(int a)
	{
		int k;
		int i;
		  k = Math.sqrt(a);
		  for (i = 2;i <= k;i++)
		  {
			  if (a % i == 0)
			  {
			  return 0;
							break;
			  }
		  }
		  if (i > k)
		  {
			  return 1;
		  }
	}
	public static int hw(int b)
	{
		int[] a = new int[20];
		int j = 0;
		int l;
		  while (b != 0)
		  {
			 a[j] = b % 10;
			 b = (b - a[j]) / 10;
			 j++;
		  }
		  for (l = 0;l <= (j - 1);l++)
		  {
			  if (a[l] != a[j - 1 - l])
			  {
			  return 0;
									break;
			  }
		  }
			return 1;
	}
	public static void Main()
	{
		int s;
		int m;
		int n;
		int flag = 1;
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
		for (s = m;s <= n;s++)
		{
			if (prime(s) != 0 && hw(s) != 0)
			{
				if (flag == 0)
				{
					System.out.print(",");
				}
			System.out.printf("%d",s);
			flag = 0;
			}
		}
		if (flag == 1)
		{
			System.out.print("no\n");
		}
	}

}

