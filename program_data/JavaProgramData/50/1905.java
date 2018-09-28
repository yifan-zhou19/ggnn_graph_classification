package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 int i;
		 int j;
		 int n;
		 int sum = 0;
		 int[][] b = new int[200][4];
		 int temp = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 sum = n + 12;
		 if (sum % 7 == 5)
		 {
		 System.out.print("1\n");
		 }
		 for (i = 1 ;i <= 11; i++)
		 {
		 sum += month[i - 1];
		  if (sum % 7 == 5)
		  {
		  System.out.printf("%d\n",i + 1);
		  }
		 }
	}

}

