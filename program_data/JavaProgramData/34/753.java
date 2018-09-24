package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = n;i != 1;)
	 {
	  if (n == 1)
	  {
	 System.out.print("End");
	  break;
	  }
	  if (i % 2 == 0)
	  {
	  System.out.printf("%d/2=%d\n",i,i / 2);
	  i = i / 2;
	  }
	  else
	  {
	   System.out.printf("%d*3+1=%d\n",i,i * 3 + 1);
	   i = i * 3 + 1;
	  }
	 }
	 System.out.print("End");
	}


}

