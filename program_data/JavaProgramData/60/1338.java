package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int s = 0;
		  j = i + 2;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= (n - 2);i++)
		  {
							   j = i + 2;
							   if (i == 1)
							   {
							   continue;
							   }
							   for (k = 2;;k++)
							   {
											if ((i % k == 0) || (j % k == 0))
											{
											break;
											}
							   }
											if ((k == i) && (j % k != 0) && (j % (k + 1) != 0))
											{
											s = s + 1;

																 System.out.printf("%d %d\n",i,j);
											}

		  }
																 if (s == 0)
																 {
																 System.out.print("empty");
																 }




	}


}

