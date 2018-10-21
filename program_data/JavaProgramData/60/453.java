package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] p;
	  int n;
	  int i;
	  int e;
	  int r;
	  int k = 0;
	  int panduan = int a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  p = new int[n];
	  for (i = 0;i < n;i++)
	  {
		  p[i] = i + 1;
	  }
	  for (i = 0;i < n - 2;i++)
	  {
		 e = panduan(p[i]);
		 r = panduan(p[i] + 2);
		 if (e == 1 && r == 1)
		 {
			 System.out.printf("%d %d\n",p[i],p[i] + 2);
			 k = 1;
		 }

	  }
	  if (k == 0)
	  {
		  System.out.print("empty\n");
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(p);
	  return 0;
	}
	public static int panduan(int a)
	{
		int i;
		for (i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i == a)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

