package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int c;
		int i;
		int f;
		int s;
		int m;
		int n;
		int x;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= c;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			f = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			s = Integer.parseInt(tempVar4);
		}
		m = n = 0;
		if (b % 4 == 0)
		{

			if (b % 100 == 0)
			{
				if (b % 400 == 0)
				{
				 int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

				for (x = 0;x < f - 1;x++)
				{
					m = m + a[x];
				}
				for (x = 0;x < s - 1;x++)
				{
					m = m - a[x];
				}
					if (m % 7 == 0)
					{
					System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else
				{
					 int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

				   for (x = 0;x < f - 1;x++)
				   {
					   m = m + a[x];
				   }
				   for (x = 0;x < s - 1;x++)
				   {
					   m = m - a[x];
				   }
					if (m % 7 == 0)
					{
					System.out.print("YES\n");
					}

					else
					{
						System.out.print("NO\n");
					}
				}
			}
			else
			{
				 int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

				for (x = 0;x < f - 1;x++)
				{
					m = m + a[x];
				}
				for (x = 0;x < s - 1;x++)
				{
					m = m - a[x];
				}
					if (m % 7 == 0)
					{
					System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
			}
		}
		else
		{

		   int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

				for (x = 0;x < f - 1;x++)
				{
					m = m + a[x];
				}
				for (x = 0;x < s - 1;x++)
				{
					m = m - a[x];
				}
					if (m % 7 == 0)
					{
					System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
		}
		}
	}







}

