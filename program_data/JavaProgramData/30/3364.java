package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int n;
	 int sum = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
	  if (i % 7 == 0)
	  {
		  continue;
	  }
	  if (i % 10 == 7)
	  {
		  continue;
	  }
	  if (i - i % 10 == 70)
	  {
		  continue;
	  }
	 sum += i * i;
	 }
	 System.out.printf("%d\n",sum);
	 return 0;
	}

}

