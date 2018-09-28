package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int remain;
	 int last = 1;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 for (last = 1;last > 0;last++)
	 {
		 for (remain = last * n + k,i = 1;i < n;i++)
		 {
			  if (remain % (n - 1) == 0)
			  {
				 remain = remain * n / (n - 1) + k;
			  }
			  else
			  {
				  last = -last;
				  break;
			  }
		 }
		  if (last > 0)
		  {
			System.out.printf("%d",remain);
		  }
		  last = -last;
	 }
	}
}

