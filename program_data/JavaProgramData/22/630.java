package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void trans(int * x,int * y);
		int[] a = new int[300];
		int i;
		int j;
		int n = 0;
		String c = new String(new char[300]);
		for (i = 1;i <= 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i - 1] = Integer.parseInt(tempVar);
			}
		 String tempVar2 = ConsoleInput.scanfRead(null, 1);
		 if (tempVar2 != null)
		 {
			 c = tangible.StringFunctions.changeCharacter(c, i - 1, tempVar2);
		 }
		 n++;
		 if (c.charAt(i - 1) == '\n')
		 {
			 break;
		 }
		}
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 1;i <= n - 1;i++)
		{
		   for (j = 1;j <= n - i;j++)
		   {
		   if (a[j - 1] < a[j])
		   {
		   trans((a + j - 1), (a + j));
		   }
		   }
		}
		for (i = 1;i <= n - 1;i++)
		{
		if (a[i - 1] > a[i])
		{
			System.out.printf("%d",a[i]);
			break;
		}
		if (i == n - 1)
		{
			System.out.print("No");
		}
		}
		}



		return 0;
	}
	  public static void trans(tangible.RefObject<Integer> x, tangible.RefObject<Integer> y)
	  {
		  int z;
		   z = x.argValue;
		   x.argValue = y.argValue;
		   y.argValue = z;
	  }


}

