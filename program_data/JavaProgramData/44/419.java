package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int reverse = int num;
		for (i = 1;i <= 6;i++)
		{
						 String tempVar = ConsoleInput.scanfRead();
						 if (tempVar != null)
						 {
							 n = Integer.parseInt(tempVar);
						 }
						 System.out.printf("%d\n",reverse(n));
		}
		return 0;
	}
	public static int reverse(int num)
	{
		int x;
		int m;
		int i;
		int s;
		int t;
		int yu;
		int j;

		if (num == 0)
		{
			return 0;
		}
		else
		{
			 if (num > 0)
			 {
			 x = num;
			 s = 2;
			 t = 0;
		while (true)
		{
				if (num % 10 == 0)
				{
					num = num / 10;
					t++;
				}
				else
				{
				break;
				}
		}
		while (true)
		{
				if (x / 10 > 9)
				{
					s = s + 1;
					x = x / 10;
				}
				else
				{
					break;
				}
		}
		s = s - t;
		if (s == 1)
		{
			return num;
		}
		else
		{
			 int result = 0;
		for (i = 1;i <= s - 1;i++)
		{
			   yu = num % 10;
			   num = num / 10;
			   for (j = 1;j <= s - i;j++)
			   {
			   yu = yu * 10;
			   }
			   result = result + yu;
		}
		result = result + num;
		return result;
		}
			 }
		if (num < 0)
		{
				 System.out.print("-");
				 num = -num;
				  x = num;
			 s = 2;
			 t = 0;
		while (true)
		{
				if (num % 10 == 0)
				{
					num = num / 10;
					t++;
				}
				else
				{
				break;
				}
		}
		while (true)
		{
				if (x / 10 > 9)
				{
					s = s + 1;
					x = x / 10;
				}
				else
				{
					break;
				}
		}
		s = s - t;
		if (s == 1)
		{
			return num;
		}
		else
		{
			 int result = 0;
		for (i = 1;i <= s - 1;i++)
		{
			   yu = num % 10;
			   num = num / 10;
			   for (j = 1;j <= s - i;j++)
			   {
			   yu = yu * 10;
			   }
			   result = result + yu;
		}
		result = result + num;
		return result;
		}
		}
		}
	}
}

