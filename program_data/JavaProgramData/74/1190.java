package <missing>;

public class GlobalMembers
{
	public static int CF(int n)
	{
		int i;
		int a = 1;
		for (i = 1;i <= n;i++)
		{
		a = a * 10;
		}
		return a;
	}
	public static int SS(int n)
	{
		int i;
		int a;
		if (n == 2)
		{
		a = 1;
		}
		else
		{
		for (i = 2;i < n;i++)
		{
						if (n % i == 0)
						{
								  a = 0;
								  break;
						}
						else
						{
						a = 1;
						}
		}
		}
		return a;
	}
	public static int HW(int n)
	{
		int i;
		int j;
		int k;
		int l;
		int a;
		int b = 0;
		int c;
		a = n;
		c = n;
		for (i = 0;a > 0;i++)
		{
					 a = a / 10;
		}
		for (j = 1;j <= i;j++)
		{
					 k = c / CF(i - j);
					 b = b + k * CF(j - 1);
					 c = c - k * CF(i - j);
		}
		if (n == b)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j = 0;
		  int k;
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
		  if (SS(i) == 1 && HW(i) == 1)
		  {
								 if (j == 0)
								 {
								 System.out.printf("%d",i);
								 }
								 else
								 {
								 System.out.printf(",%d",i);
								 }
								 j++;
		  }
		  }
		  if (j == 0)
		  {
		  System.out.print("no");
		  }
		  System.in.read();
		  System.in.read();
	}

}

