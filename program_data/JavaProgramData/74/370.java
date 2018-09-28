package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10];
	public static int Main()
	{
		int sushu = int i;
		int huiwen = int i;

		int num;
		int m;
		int n;
		int i;
		int flag = 0;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			c = sushu(i);
		 d = huiwen(i);
		 if (c == 1 && d == 1)
		 {
			 flag++;
		  if (flag == 1)
		  {
			  System.out.printf("%d",i);
		  }
		  else
		  {
			  System.out.printf(",%d",i);
		  }
		 }
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
	}

	public static int sushu(int i)
	{
		int j;
		for (j = 2;j < i;j++)
		{
			if (i % j == 0)
			{
			   return 0;
		break;
			}
		}
		if (j == i)
		{
			return 1;
		}
	}

	public static int huiwen(int i)
	{
		int j;
		int k;
		for (j = 0;;j++)
		{
			if (Math.pow(10,j) > i)
			{
				break;
			}
		}
		for (k = 0;k < j;k++)
		{
			a[j - 1 - k] = i % 10;
		i = i / 10;
		}
		for (k = 0;k < j;k++)
		{
			if (a[k] != a[j - 1 - k])
			{
			return 0;
		break;
			}
		}
		if (k == j)
		{
			return 1;
		}
	}

}

