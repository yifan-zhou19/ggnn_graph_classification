package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  int t;
	  int sum = 0;
	  int flag = 0;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  t = i;
		 for (j = 1;j <= 2;j++)
		 {
			 if (i % 10 == 7)
			 {
				 flag = 1;
				 break;
			 }
			  else
			  {
			   i = i / 10;
			  }
		 }
		   i = t;
		  if (i % 7 != 0 && flag != 1)
		  {
			  sum = sum + i * i;
		  }
		  flag = 0;
	  }
	  System.out.printf("%d",sum);

	}

}

