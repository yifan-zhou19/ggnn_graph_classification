package <missing>;

public class GlobalMembers
{
	public static int huiwen(int x, int y)
	{
		if (x == 0)
		{
			return (y);
		}
		else
		{
			return (huiwen(x / 10, y * 10 + x % 10));
		}
	}
	public static int sushu(int x)
	{
		int j;
		for (j = 2;j <= x;j++)
		{
			if (x % j == 0)
			{
				if (j != x)
				{
				return (0);
				break;
				}
				else
				{
					return (1);
				}
			}
		}
	}
	public static void Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 int k = 0;
	 int temp;
	 int[] b = new int[10000];
	 int t;
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
		 if ((i == huiwen(i, 0)) && (sushu(i) == 1))
		 {
			 b[k] = i;
			 k = k + 1;
		 }
	 }

	 for (i = 0;i < k;i++)
	 {
		 t = i;
		 for (j = i + 1;j < k;j++)
		 {
			 if (b[j] < b[t])
			 {
				 t = j;
			 }
		 }
		 if (t != i)
		 {
			   temp = b[i];
			   b[i] = b[t];
			   b[t] = temp;
		 }
	 }
	if (b[0] == 0)
	{
		System.out.print("no");
	}
	else
	{
	 System.out.printf("%d",b[0]);

	 for (i = 1;i < k;i++)
	 {
		 System.out.printf(",%d",b[i]);
	 }
	}
	}

}

