package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int a;
		 int i;
		 int sum;
		 int som;
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = Integer.parseInt(tempVar2);
			 }
			 if (i == 0)
			 {
				 sum = a;
				 som = 0;
			 }
			 else if (sum < a)
			 {
					som = sum;
										 sum = a;
			 }
			 else if (som < a)
			 {
					 sum = sum;
					 som = a;
			 }
			 else if (som > a)
			 {
					 sum = sum;
					 som = som;
			 }
		 }
			 System.out.printf("%d\n%d\n",sum,som);
			 return 0;
	}


}

