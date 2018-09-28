package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  int b = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
			  for (int i = 3;i < n - 1;i++)
			  {
				 for (int j = 2;j < i;j++)
				 {
					if (i % j != 0 && (i + 2) % j != 0)
					{
					  a = 1;
					}
					else
					{
						a = 0;
						break;
					}
				 }
				 if (a == 1)
				 {
				   System.out.printf("%d %d\n",i,i + 2);
				   b++;
				 }
			  }
			  if (b == 0)
			  {
					 System.out.print("empty");
			  }
	return 0;
	}
}

