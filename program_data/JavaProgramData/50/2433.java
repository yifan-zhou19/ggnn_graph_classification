package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int w;
	 int t;
	 int i;
	 int s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 w = Integer.parseInt(tempVar);
	 }
	 int[] month = {12, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
	 s = 0;
	 for (i = 1; i <= 12; i++)
	 {

	  s = s + month[i - 1];

	  t = w + s;
	  if (t % 7 == 5)
	  {

		 System.out.printf("%d\n", i);
	  }
	 }
	}

}

