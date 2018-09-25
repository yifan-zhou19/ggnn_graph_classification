package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int num;
	int n;
	int max;
	int sec;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (int i = 0 ;i < n;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 num = Integer.parseInt(tempVar2);
		 }

		 if (i == 0)
		 {
			 max = num;
		 }

		 else if (i != 0)
		 {

			 if (num > max)
			 {
				 sec = max;
				 max = num;
			 }
			 else if (num > sec && num < max)
			 {
				 sec = num;
			 }
		 }




	  }
		System.out.printf("%d\n%d\n",max,sec);
		return 0;
	}

}

