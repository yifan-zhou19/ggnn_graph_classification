package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int j;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w--;
		for (i = 0;i < 12;i++)
		{
			for (j = 1;j <= day[i];j++)
			{
				   w++;
				   if (w > 7)
				   {
					   w = w - 7;
				   }
				   if ((j == 13) && (w == 5))
				   {
					  System.out.printf("%d\n",i + 1);
				   }
			}
		}
	}


}

