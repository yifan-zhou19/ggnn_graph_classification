package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int k;
	  int num = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] shuzu = new int[n];
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			shuzu[i] = Integer.parseInt(tempVar2);
		}
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  k = Integer.parseInt(tempVar3);
	  }
	  for (i = 0;i < n;i++)
	  {
		if (shuzu[i] == k)
		{
		  num++;
		}
	  }
	  num = n - num;
	 for (i = 0;i < n;i++)
	 {
		if (shuzu[i] != k)
		{
		  num--;
		  if (num > 0)
		  {
			System.out.printf("%d ",shuzu[i]);
		  }
		  if (num == 0)
		  {
			System.out.printf("%d",shuzu[i]);
		  }
		}
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(shuzu);
	  return 0;
	}
}

