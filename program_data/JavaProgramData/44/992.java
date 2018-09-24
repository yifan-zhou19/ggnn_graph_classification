package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int c;
	  int i;
	  int[] b = new int[6];
	  for (i = 0;i < 6;i++)
	  {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 c = 0;
		 while (a != 0)
		 {
		   c = c * 10 + a % 10;
		   a = a / 10;
		 }
		 b[i] = c;
	  }

	  for (i = 0;i < 6;i++)
	  {
		  System.out.printf("%d\n",b[i]);
	  }
	}
}

