package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int w;
		int s;
		int s1 = 0;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			s1 += m[i];
			s = w + 12 + s1;
			if (s % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}

		}




	}


}

