package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int a;
	 int b;
	 int i;
	 int j;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 j = 0;
	 k = 0;
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  if (a >= 90 && a <= 140)
	  {
		if (b >= 60 && b <= 90)
		{
			 j = j + 1;
		   if (j >= k)
		   {
		   k = j;
		   }
		}
		else
		{
			j = 0;
		}
	  }
	   else
	   {
		   j = 0;
	   }
	 }
	 System.out.printf("%d",k);
	 return 0;
	}
}

