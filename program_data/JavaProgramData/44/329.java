package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int p = 0;
		int s;
		int i;
		int n;
		int t;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n > 0)
			{
			p = 1;
			}
			else if (n < 0)
			{
				 p = -1;
			 n = -n;
			}
			 s = 0;
			 t = 0;


			 do
			 {
				 s = n % 10;
				 n = n / 10;

				 t = t * 10 + s;

			 } while (n != 0);
		if (p > 0)
		{
		System.out.printf("%ld\n",t);
		}
		else if (p < 0)
		{
		System.out.printf("-%ld\n",t);
		}
		else
		{
		System.out.print("0");
		}
		}
	}
}

