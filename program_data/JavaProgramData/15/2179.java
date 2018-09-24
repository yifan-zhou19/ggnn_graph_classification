package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int z;
	int w;
	int n;
	int i;
	int j;
	int t;
	int s;
	int tz = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	  for (j = 0;j < n;j++)
	  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 t = Integer.parseInt(tempVar2);
			 }
				 if (t == 0 && tz == 0)
				 {
					 tz++;
					 x = i;
					 y = j;
				 }
			 if (t == 0)
			 {
				 z = i;
				 w = j;
			 }
	  }
	}
							   System.out.printf("%d",(z - x - 1) * (w - y - 1));
	}
}

