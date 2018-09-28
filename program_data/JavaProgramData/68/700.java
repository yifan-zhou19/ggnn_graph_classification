package <missing>;

public class GlobalMembers
{
	/*
	????5.cpp
	??????
	???2010.10.23
	???????????
	*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sqr;
		int k1;
		int k2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i = i + 2) //??6?12???????
		{
			for (k1 = 3;k1 <= i / 2;k1 = k1 + 2) //?k1????????
			{
				sqr = (int) Math.sqrt(k1);
				for (j = 2;j <= sqr;j++)
				{
					if (k1 % j == 0)
					{
						break;
					}
				}
				if (j == sqr + 1) //?k1?????k2=i-k1???k2
				{
					k2 = i - k1;
					sqr = (int) Math.sqrt(k2);
					for (j = 2;j <= sqr;j++)
					{
						if (k2 % j == 0)
						{
							break;
						}
					}
					if (j == sqr + 1) //?k2???????????????
					{
						System.out.print(i);
						System.out.print("=");
						System.out.print(k1);
						System.out.print("+");
						System.out.print(k2);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

