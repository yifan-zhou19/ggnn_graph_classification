package <missing>;

public class GlobalMembers
{
	/*D&#161;��?���n�&#182;&#206;�&#196;�?&#196;&#203;&#216;�y&#182;&#212;*/

	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int n;
	 int s;
	 int flag = 9;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 s = 0;

	 for (i = 2; i < n - 1; i++)
	 {
	  flag = 0;
	  for (j = 2; j <= i / 2; j++)
	  {
	   if (i % j == 0)
	   {
		  flag++;
	   }
	  }
	  if (flag == 0) //&#212;�i&#206;a&#203;&#216;�y
	  {
	   for (j = 2; j <= (i + 2) / 2; j++)
	   {
		if ((i + 2) % j == 0)
		{
		   flag++;
		}
	   }
	   if (flag == 0)
	   {
		System.out.printf("%d %d\n", i, i + 2);
		s++;
	   }
	  }
	 }
	 if (s == 0)
	 {
		  System.out.print("empty\n");
	 }

	}

}

