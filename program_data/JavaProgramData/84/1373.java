package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int num;
	  int result1;
	  int result2;
	  int cha;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  int i = 1;
	  while (i <= a)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 num = Integer.parseInt(tempVar2);
		 }
		if (i == 1)
		{
		   result1 = num;
		}
		 else if (i == 2)
		 {
		   result2 = num;
		   if (result2 > result1)
		   {
			  cha = result1;
			  result1 = result2;
			  result2 = cha;
		   }
		 }
		 else if (i != 1 && i != 2)
		 {
		   if (num > result1)
		   {
		   result2 = result1;
		   result1 = num;
		   }
		   else if (num > result2 && num < result1)
		   {
		   result2 = num;
		   }
		 }
	  i++;
	  }
	  System.out.printf("%d\n%d\n",result1,result2);
	  return 0;
	}

}

