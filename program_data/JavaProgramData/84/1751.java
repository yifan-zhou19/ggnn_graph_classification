package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int fir;
		int sen;
		int x;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 1 && n < 100)
		{
			if (n == 1)
			{
				int a;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				fir = sen = a;
			}
			else
			{
				for (i = 0;i < n;i++)
				{
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   x = Integer.parseInt(tempVar3);
				   }
					if (i == 0)
					{
						fir = x;
						sen = 0;
					}
					else
					{
						if (fir < x)
						{
							sen = fir;
							fir = x;
						}
						else if (sen < x)
						{
							fir = fir;
							sen = x;
						}
					}

				}
			}
			System.out.printf("%d\n%d",fir,sen);
		}
	}
}

