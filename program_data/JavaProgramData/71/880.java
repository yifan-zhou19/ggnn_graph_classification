package <missing>;

public class GlobalMembers
{
	//?????
	public static int Main()
	{
	   int year; //c,d????a[12]?12??????sum????????
	   int c;
	   int d;
	   int n;
	   int j;
	   int i;
	   int[] a = new int[13];
	   int sum = 0;
	   a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = 31;
	   a[4] = a[6] = a[9] = a[11] = 30;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (j = 1;j <= n;j++)
	   {
		 year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		 {
			 a[2] = 29;
		 }
		 else
		 {
			 a[2] = 28; //??2????
		 }
		 c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 sum = 0;
		 if (c < d)
		 {
			for (i = c;i < d;i++)
			{
			sum = sum + a[i];
			}

		 }
		else if (c > d)
		{

		   for (i = d;i < c;i++)
		   {
			sum = sum + a[i];
		   }
		}
		 if (sum % 7 == 0) //????????
		 {
			 System.out.print("YES");
			 System.out.print("\n");
		 }
		 else
		 {
			 System.out.print("NO");
			 System.out.print("\n");
		 }


	   }
	   return 0;
	}

}

