package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int w;
		int d = 12;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] p = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < 13;i++)
		{
			d += p[i];
			if (d % 7 + w == 5 || d % 7 + w == 12)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}



}

