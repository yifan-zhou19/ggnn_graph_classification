package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int sum = 0;
		int d;
		int e;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (sum = 0,i = 0; i < n; i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 c[i] = Integer.parseInt(tempVar4);
			 }
			 if (b[i] > c[i])
			 {
				 d = c[i];
				 c[i] = b[i];
				 b[i] = d;
			 }
			 if (a[i] % 4 == 0 && a[i] % 100 != 0 || a[i] % 400 == 0)
			 {
				 for (sum = 0,e = b[i]; e < c[i]; e++)
				 {
					 switch (e)
					 {
						case 1:
						case 3:
						case 5:
						case 7:
						case 8:
						case 10:
						case 12:
							sum += 31;
							break;
						case 2:
							sum += 29;
							break;

						case 4:
						 case 6:
						case 9:
						case 11:
							 sum += 30;
							break;
					 }
				 }
					 if (sum % 7 == 0)
					 {
						 System.out.print("YES\n");
					 }
						 else
						 {
							 System.out.print("NO\n");
						 }

			 }
				 else
				 {

					   for (sum = 0,e = b[i]; e < c[i]; e++)
					   {
					 switch (e)
					 {
						case 1:
						case 3:
						case 5:
						case 7:
						case 8:
						case 10:
						case 12:
							sum += 31;
							break;
						case 2:
							sum += 28;
							break;

						case 4:
						 case 6:
						case 9:
						case 11:
							 sum += 30;
							break;
					 }
					   }
					 if (sum % 7 == 0)
					 {
						 System.out.print("YES\n");
					 }
						 else
						 {
							 System.out.print("NO\n");
						 }

				 }
		 }
		return 0;
	}

}

