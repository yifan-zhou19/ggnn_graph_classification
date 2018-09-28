package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int s;
	  s = 0;
	  i = 0;
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
		 else if (i % 10 == 7)
		 {
			 continue;
		 }
			 else if (i / 10 == 7)
			 {
			 continue;
			 }
		 else
		 {
			 s = s + i * i;
		 }
	  }
	  System.out.printf("%d\n",s);
	  return 0;
	}
}

