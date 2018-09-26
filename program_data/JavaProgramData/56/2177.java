package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int x;
	  int i = 0;
	  int l;
	  int[] a = new int[5];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	 while (x > 0)
	 {
		 a[i] = x - x / 10 * 10;
		 x = x / 10;
		 i++;
	 }
	  l = i;
	  for (i = 0;i < l;i++)
	  {
	  System.out.printf("%d",a[i]);
	  }
	}
}

