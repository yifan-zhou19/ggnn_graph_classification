package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,p,m;
		int n;
		int p;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 6;p <= n;p++)
		{
			if (p % 2 == 0)
			{
				m = p;
				int i;
				int j;
				int f;
				int k;
				for (i = 3;i <= m / 2;i = i + 2)
				{
					f = 1;
					for (k = 2;k <= Math.sqrt(i);k++)
					{

						if (i % k == 0)
						{
							f = 0;
							break;
						}
					}
					if (f == 1)
					{
						j = m - i;
						 f = 1;
						for (k = 2;k <= Math.sqrt(j);k++)
						{

							if (j % k == 0)
							{
								f = 0;
								break;
							}
						}
						if (f == 1)
						{
							System.out.printf("%u=%u+%u\n",m,i,j);
							break;
						}
					}


				}

			}
			else
			{
				continue;
			}
		}


	}
}

