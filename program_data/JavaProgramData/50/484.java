package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int w;
		int i;
		int[] a = {12, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			w = (a[i] + w) % 7;
			if (w == 5)
			{
				System.out.printf("%d\n",(i + 1));
			}
		}


	}


}

