package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		int m = (int)Math.sqrt(a);
	 for (i = 2;i <= m;i++)
	 {
	   if (a % i == 0)
	   {
		   return 0;
	   }
	 }
	 if ((a != 1) && (a != 0))
	 {
	   return 1;
	 }
	 else
	 {
	   return 0;
	 }
	}
	public static int Main()
	{
	  int time = 0;
	  int n;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		if (sushu(i - 2) != 0 && sushu(i) != 0)
		{
		  System.out.printf("%d %d\n",i - 2,i);
		  time = 1;
		}
	  }
	  if (time == 0)
	  {
		  System.out.print("empty\n");
	  }
	  return 0;
	}

}

