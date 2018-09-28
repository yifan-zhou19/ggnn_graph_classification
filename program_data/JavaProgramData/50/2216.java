package <missing>;

public class GlobalMembers
{
	public static int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
	int n;
	int i;
	int g;
	int k;
	int w;
	int d = 1;
	int month = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	w = n;
	for (i = 1;i <= 365;i++)
	{
		w++;

	   if (w == 8)
	   {
		 w = 1;
	   }
	   d++;
		 if (d > m[month])
		 {
		  month++;
		 d = 1;
		 }
	if (d == 13 && w == 5)
	{
	System.out.printf("%d\n",month);
	}

	}

	}

}

