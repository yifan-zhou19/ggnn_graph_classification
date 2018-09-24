package <missing>;

public class GlobalMembers
{
	public static int find(int[] x, int y, int z)
	{
	 int count = 0;
	 for (int i = 0;i < y;i++)
	 {
		 if (x[i] == z)
		 {
			 count++;
		 }
	 }
	 return count;
	}

	public static int count(int[] x, int y)
	{
	  int count1 = 0;
	  for (int i = 0;i < y;i++)
	  {
		  count1 += find(x, y, 2 * x[i]);
	  }
	  return count1;
	}

	public static int Main()
	{
	 int[] temp = new int[16];
	 int len = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 temp[len] = Integer.parseInt(tempVar);
	 }
	 while (temp[len] != -1)
	 {
	  while (temp[len] != 0)
	  {
		  len++;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  temp[len] = Integer.parseInt(tempVar2);
	  }
	  }
	  System.out.printf("%d\n",count(temp, len));
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  temp[0] = Integer.parseInt(tempVar3);
	  }
	  len = 0;
	 }
	 return 0;
	}

}

