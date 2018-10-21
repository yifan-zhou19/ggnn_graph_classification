package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int result = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 1;i <= n;i++)
	 {
		 if (i % 7 != 0)
		 {
		  for (int k = i;k > 0;k /= 10)
		  {
			  if (k % 10 == 7)
			  {
				  break;
			  }
			  if (k / 10 == 0)
			  {
				 result += i * i;
			  }
		  }
		 }
	 }
	 System.out.printf("%d",result);
	 return 0;
	}

}

