package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int a;
	  int b;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i < 6;i++)
	  {
					  b = Math.pow(10,i);
					  a = (n % b) / Math.pow(10,i - 1);

					 if (a == 0)
					 {
						 break;
					 }
					 System.out.printf("%d",a);
	  }

	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	}


}

