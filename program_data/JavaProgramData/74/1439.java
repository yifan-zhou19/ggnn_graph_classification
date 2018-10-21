package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = int i;
		int m;
		int n;
		int i;
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
			if (f(i) == 1)
			{
				if (h == 0)
				{
					System.out.printf("%d",i);
					h = 1;
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (h == 0)
		{
			System.out.print("no");
		}
	}
	public static int f(int i)
	{
		int j;
		int t;
		int sum;
		int k;
		t = 0;
		sum = 0;
		k = i;
		for (j = 2;j < i;j++)
		{
			if (i % j == 0)
			{
				t = 1;
				break;
			}
		}
		if (t == 0)
		{
			do
			{
				sum = sum * 10 + i % 10;
				i = i / 10;
			} while (i != 0);
		  if (sum == k)
		  {
			return (1);
		  }
		}
		else
		{
			return (0);
		}
	}



}

