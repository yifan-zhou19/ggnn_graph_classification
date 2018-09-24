package <missing>;

public class GlobalMembers
{
	public static int issushu(int x)
	{
		int result;
		for (int k = 2;k <= x - 1;k++)
		{
		   if (x % k == 0)
		   {
			   result = 0;
			   {
				   break;
			   }
		   }
		   else
		   {
			   result = 1;
		   }
		}
		  return result;
	}
	public static int Main()
	{

	 int n;
	 int i;
	 int[] s = new int[10000];
	 int j = 0;
	 int p = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }

	 for (i = 2;i <= n;i++)
	 {
		 if (issushu(i) != 0)
		 {
			s[j] = i;
			j++;

		 }
	 }

		  for (int m = 1;m <= j - 1;m++)
		  {
				if (s[m] - s[m - 1] == 2)
				{
				   System.out.printf("%d %d\n",s[m - 1],s[m]);
				   {
					   p++;
				   }
				}
		  }
	   if (p == 0)
	   {
		   System.out.print("empty");
	   }


	 int y;
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 y = Integer.parseInt(tempVar2);
	 }

	 return 0;
	}





}

