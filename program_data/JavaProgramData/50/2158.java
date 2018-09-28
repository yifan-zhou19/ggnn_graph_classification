package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int w;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  w = Integer.parseInt(tempVar);
	  }
	  int[] a = {13, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
	  int i;
	  for (i = 1;i < 12;i++)
	  {
		  a[i] += a[i - 1];
	  }
	  for (i = 0;i < 12;i++)
	  {
	  if (((a[i] - 1) % 7 + w) % 7 == 5)
	  {
		  System.out.printf("%d\n",i + 1);
	  }
	  }
	}
}

