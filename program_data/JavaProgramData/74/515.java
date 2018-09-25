package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] x = new int[1000];
		int count = 0;
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
			if (f(i) * g(i) == 1)
			{
				count++;
			x[count] = i;
			}
		}
		if (count == 0)
		{
			System.out.print("no");
		}
		if (count == 1)
		{
			System.out.printf("%d",x[1]);
		}
		if (count >= 2)
		{
			for (i = 1;i < count;i++)
			{
				System.out.printf("%d,",x[i]);
			}
			System.out.printf("%d",x[count]);
		}
	}

	public static int f(int a)
	{
		int b;
		int c;
		int temp = 0;
		if (a == 2)
		{
			return 1;
		}
		b = a / 2;
		for (c = 2;c <= b;c++)
		{
			if (a % c == 0)
			{
				temp = 1;
			break;
			}
		}
		if (temp == 0)
		{
			return 1;
		}
		if (temp == 1)
		{
			return 0;
		}
	}

	public static int g(int a)
	{
		int b = 0;
		int[] d = new int[100];
		int i;
		int temp = 0;
	   for (i = 0; ;i++)
	   {
		   b++;
	   d[i] = a % 10;
	   a = a / 10;
	   if (a == 0)
	   {
		   break;
	   }
	   }
	   for (i = 0;i < b;i++)
	   {
		if (d[i] != d[b - 1 - i])

		{
			temp = 1;
			break;
		}
	   }
	   if (temp == 1)
	   {
		   return 0;
	   }
	   if (temp == 0)
	   {
		   return 1;
	   }
	}






}

