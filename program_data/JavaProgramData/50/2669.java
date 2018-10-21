package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int w;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  w = Integer.parseInt(tempVar);
		  }
		  int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

		  if ((w + 12 % 7) % 7 == 5)
		  {
			  System.out.print("1\n");
		  }
		  w = (w + 12 % 7) % 7;
		  for (i = 0;i < 11;i++)
		  {
			  if ((w + a[i] % 7) % 7 == 5)
			  {
				  System.out.printf("%d\n",i + 2);
			  }
			  w = (w + a[i] % 7) % 7;
		  }
	}

}

