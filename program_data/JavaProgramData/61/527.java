package <missing>;

public class GlobalMembers
{
	public static int feibonaqi(int a)
	{
	  int i;
	  int[] sz = new int[21];
	  sz[0] = 1;
	  sz[1] = 1;
	  for (i = 2;i < a;i++)
	  {
		sz[i] = sz[i - 1] + sz[i - 2];
	  }
	  return sz[a - 1];
	}

//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int feibonaqi(int a);
	public static int Main()
	{
	  int n;
	  int[] result = new int[21];
	  int i;
	  int a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		result[i] = feibonaqi(a);
	  }
	  for (i = 0;i < n;i++)
	  {
		System.out.printf("%d\n", result[i]);
	  }
	scanf(" ");
	return 0;
	}
}

