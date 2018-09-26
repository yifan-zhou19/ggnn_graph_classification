package <missing>;

public class GlobalMembers
{
	public static int transfer(int i)
	{
			int b = 0;
			int t;
			int r;
			b += i % 10;
			for (r = 0;r < 5;r++)
			{
				i /= 10;
				if (i != 0)
				{
				b = (b * 10) + i % 10;
				}
				else
				{
					break;
				}
			}
			return b;
	}
	public static int Main()
	{
				int i;
				int j;
				int n = 6;
				while (n > 0)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						i = Integer.parseInt(tempVar);
					}
					System.out.printf("%d\n",transfer(i));
					n--;
				}
				return 0;

	}
}

