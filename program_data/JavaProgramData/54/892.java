package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num;
		int n;
		int k;
	  int change = new int(int n,int k,int num);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (i = n + k;;i = i + n)
	  {
		  num = i;
		num = change(n, k, num);
		if (num > 0)
		{
			System.out.printf("%d\n",i);
		break;
		}
	  }
	  return 0;
	}
	public static int change(int n,int k,int num)
	{
		int j;
	 for (j = 0;j < n;j++)
	 {
			 if (num / n == 0 || num % n != k)
			 {
		  break;
			 }
		  else
		  {
		  num = num - num / n - k;
		  }
	 }
	 if (j >= n)
	 {
		 return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}
}

