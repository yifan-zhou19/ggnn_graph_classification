package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int c;
		  int i;
		  int c1;
		  int c2;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = Integer.parseInt(tempVar);
		  }
		  for (i = 1;;i++)
		  {
			  if (c % 2 == 1 && c != 1)
			  {
			  c1 = c * 3 + 1;
			  System.out.printf("%d*3+1=%d\n",c,c1);
			  c = c1;
			  }
			  if (c % 2 == 0)
			  {
			  c2 = c / 2;
			  System.out.printf("%d/2=%d\n",c,c2);
			  c = c2;
			  }
			  if (c == 1)
			  {
			  break;
			  }
		  }
		  System.out.print("End\n");
	}
}

