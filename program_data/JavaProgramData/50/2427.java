package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int d;
		  int i;
		  int w;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  w = Integer.parseInt(tempVar);
		  }
		  d = (w + 5) % 7;
		  for (i = 1;i <= 12;i++)
		  {
							if (d % 7 == 5)
							{
								System.out.printf("%d\n",i);
							}
							if (i == 2)
							{
							d = d + 7;
							}
							else if (i == 4 || i == 6 || i == 9 || i == 11)
							{
							d = d + 2;
							}
							else
							{
								d = d + 3;
							}

		  }
	}


}

