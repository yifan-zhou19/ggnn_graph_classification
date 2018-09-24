package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int x;
		int asd;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 2;j <= i;j++)
			{
				if (j == 2)
				{
					x = i - 2;
					if (x != 1)
					{
					asd = 1;

					for (k = 3;k <= Math.sqrt(x);k = k + 2)
					{
						if ((x % k) == 0)
						{
							asd = 0;
							break;
						}
					}
					if (x % 2 == 0)
					{
						asd = 0;
					}

					if (asd == 1)
					{
						System.out.printf("%d=2+%d\n",i,x);
					}
					}
				}
				else
				{
					asd = 1;


					for (k = 3;k <= Math.sqrt(j);k = k + 2)
					{
						 if ((j % k) == 0)
						 {
							 asd = 0;
							 break;
						 }
					}
					if (j % 2 == 0)
					{
						asd = 0;
					}
					if (asd == 1)
					{
						 x = i - j;
						 if (x != 1)
						 {
						 asd = 1;

						 for (k = 3;k <= Math.sqrt(x);k = k + 2)
						 {
							 if ((x % k) == 0)
							 {
								 asd = 0;
								 break;
							 }
						 }
						 if (x % 2 == 0)
						 {
							 asd = 0;
						 }
						 if (asd == 1)
						 {
							 System.out.printf("%d=%d+%d\n",i,j,x);
							 break;
						 }
						 }
					}
				}
			}
		}







	}
}

