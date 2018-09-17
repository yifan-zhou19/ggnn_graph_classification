package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int i;
		 int j;
		 int[] a = new int[16];
		 int[] b = new int[100];
		 int changdu = 0;
		 int panduan = 1;
		 int geshu = 0;
		 while (true)
		 {
			 for (i = 0;i < 16;i++)
			 {
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 a[i] = Integer.parseInt(tempVar);
				 }
				 changdu = i;
				 if (a[i] == -1)
				 {
					 panduan = 0;
					 break;
				 }
				 if (a[i] == 0)
				 {
					 break;
				 }
			 }


			 if (panduan == 0)
			 {
				 break;
			 }



			 geshu = 0;

			 for (i = 0;i < changdu;i++)
			 {
				 for (j = 0;j < changdu;j++)
				 {
					 if (a[i] == a[j] * 2)
					 {
						 geshu++;
					 }
				 }
			 }

			 System.out.printf("%d\n",geshu);
		 }


	   return 0;
	 }

}

