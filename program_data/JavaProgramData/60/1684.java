package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j = 1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *primeNum;
		int primeNum;
		int Nprime = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		primeNum = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		if (n == 1)
		{
			System.out.print("empty");
		}
		if (n == 2)
		{
			System.out.print("empty");
		}
		if (n == 3)
		{
			System.out.print("empty");
		}
		if (n == 4)
		{
			System.out.print("empty");
		}
		if (n >= 5)
		{
			for (m = 2;m <= n;m++)
			{
				for (i = 2;i < m;i++)
				{
					if (m % i == 0)
					{
						break;
					}
				}
				if (m <= i)
				{
					*(primeNum + Nprime) = m;
					Nprime = Nprime+1;
				}
			}
			for (j = 1;j < Nprime;j++)
			{
				if (*(primeNum + j + 1) - *(primeNum + j) == 2)
				{
					System.out.printf("%d %d\n",*(primeNum + j),*(primeNum + j + 1));
				}
			}
		}
	}
}

