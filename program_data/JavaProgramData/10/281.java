package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int d = 1;
		int[] b = new int[25];
		int[] c = new int[25];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < a;i++)
		{
			c[i] = b[i];
		}
		for (i = 1;i < a;i++)
		{
				 for (j = d - 1;j >= 0;j--)
				 {
						   if (b[i] <= c[j])
						   {
						   break;
						   }
				 }
				 c[j + 1] = c[i];
				 if (j == d - 1)
				 {
				 d++;
				 }
		}
		 System.out.printf("%d",d);

	}
}

