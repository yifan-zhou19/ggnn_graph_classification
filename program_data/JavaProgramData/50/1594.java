package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w = (w + 12) % 7;
		if (w == 5)
		{
			System.out.print("1\n");
		}
		for (i = 0;i < 11;i++)
		{
			w = (w + day[i]) % 7;
			if (w == 5)
			{
				System.out.printf("%d\n",i + 2);
			}
		}
	}

}

