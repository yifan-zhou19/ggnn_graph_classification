package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	 int[] num = new int[n];
	 int temp;
	 int i = 0;

	 while (i < n)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  num[i] = Integer.parseInt(tempVar2);
	  }
	  i++;
	 }
	 for (int x = 0;x < n - 1;x++)
	 {
	  for (int y = n - 1;y > x;y--)
	  {
	   if (num[y] > num[y - 1])
	   {
		temp = num[y];
		num[y] = num[y - 1];
		num[y - 1] = temp;
	   }
	  }
	 }
	 System.out.printf("%d\n%d\n",num[0],num[1]);
	return 0;
	}
}

