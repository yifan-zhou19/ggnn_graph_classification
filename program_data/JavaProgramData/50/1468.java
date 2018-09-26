package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int a;
		int[] sz = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w += 12;
		if ((w % 7) == 5)
		{
		   System.out.print("1\n");
		}
		for (i = 1;i < 12;i++)
		{
			w += sz[i];
			if ((w % 7) == 5)
			{
			   a = i + 1;
			   System.out.printf("%d\n",a);
			}
		}
		return 0;
	}
}

