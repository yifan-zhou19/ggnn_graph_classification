package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int s;
		int g;
		int shi;
		s = 0;
		for (i = 1;i <= n;i++)
		{

			j = i;
			if (i % 7 == 0)
			{
				j = 1;
			}
			else
			{
				g = i % 10;
				shi = (i - g) / 10;
				if ((g == 7) || (shi == 7))
				{
					j = 1;
				}
				else
				{
					s = s + j * j;
				}
			}
		}
		System.out.printf("%d",s);
		return 0;
	}
}

