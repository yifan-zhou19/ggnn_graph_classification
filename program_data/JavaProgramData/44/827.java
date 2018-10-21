package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	  int n;
	  int i;
	  int b = 0;
	  int a;
	  int c = 0;
	  if (num == 0)
	  {
		  return 0;
	  }
	  else if (num < 0)
	  {
	   for (i = 1;num / i != 0;i = i * 10)
	   {
		 a = num % (10 * i) / i;
		 if (a == 0 && c == 0)
		 {
			 continue;
		 }
		 b = b * 10 + a;
		 c++;
	   }
	  return b;
	  }
	  else
	  {
	   for (i = 1;num / i != 0;i = i * 10)
	   {
		 a = num % (10 * i) / i;
		 if (a == 0 && c == 0)
		 {
			 continue;
		 }
		 b = b * 10 + a;
		 c++;
	   }
	  return b;
	  }
	}
	public static int Main()
	{
	 int i;
	 int num;
	 int res;
	 for (i = 1;i <= 6;i++)
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  num = Integer.parseInt(tempVar);
	  }
	  res = reverse(num);
	  System.out.printf("%d\n",res);
	 }
	 return 0;
	}

}

