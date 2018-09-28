package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		int j = 0;
		int m;
	  for (i = 2;i <= Math.sqrt(a) + 1;i++)
	  {
		  if (a % i == 0)
		  {
		  return 1;
		  j++;
	  break;
		  }
	  }

	  if (j == 0)
	  {
		  return 0;
	  }
	}
	public static int huiwen(int a)
	{
		int i;
		int j;
		int m;
		int n = 0;
	char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		for (i = 0;;i++)
		{
			if (a / 10 != 0 || a % 10 != 0)
			{
				c[i] = a % 10;
			a = a / 10;
			}
		else
		{
			break;
		}
		}
		for (j = 0;j <= i - 1;j++)
		{
			if (c[j] != c[i - 1 - j])
			{
		 n++;
			}
		}
		if (n == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int[] e = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
			for (i = a,j = 0;i <= b;i++)
			{
				d = huiwen(i) + sushu(i);
				if (d == 0)
				{
					e[j] = i;
				j++;
				}
			}

		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i <= j - 2;i++)
			{
		 System.out.printf("%d,",e[i]);
			}
		 System.out.printf("%d",e[j - 1]);
		}
	}

}

