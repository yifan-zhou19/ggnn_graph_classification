package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[50];
		int i;
		int n;
		int j;
		int p = 0;
		int q = 0;
		int c;
		for (i = 0;i <= 50;i++)
		{
			s[i] = -1;
		}
		s[0] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
		   for (i = 0;s[i] != -1;i++)
		   {
			   c = s[i] * 2;
		   s[i] = c % 10 + p;
		   if (c >= 10)
		   {
			   p = 1;
		   }
			  else
			  {
				  p = 0;
			  }

		   }
		   if (p != 0)
		   {
		   s[i] = 1;
		   }
		   p = 0;


		}
		   for (i = 0;s[i] != -1;i++)
		   {
			   q++;
		   }
		   for (i = q - 1;i >= 0;i--)
		   {
			   System.out.printf("%d",s[i]);
		   }
	return 0;
	}
}

