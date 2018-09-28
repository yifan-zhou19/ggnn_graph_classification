package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int flag = 0;
		int j = 0;
		int a = 0;
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] c = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if ((w > 7) || (w < 1))
		{
			System.out.print("Error!");
		}
		else
		{
			for (i = 0;i < 12;i++)
			{
			a = a + b[i];
		   if ((w + 12 + a) % 7 == 5)
		   {
				 flag++;
			  c[j] = i;
			  j++;
		   }
			}
		  for (i = 0;i < j;i++)
		  {
			  System.out.printf("\n%d",c[i] + 1);
		  }
		}
		return 0;
	}

}

