package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int max = 0;
		int secmax = 0;
		char b;

		do
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a = Integer.parseInt(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 b = tempVar2.charAt(0);
			 }
			 if (max < a)
			 {
						secmax = max;
						max = a;
			 }
			 else if (a < max && a> secmax)
			 {
				  secmax = a;
			 }
			 else if (a == max || a == secmax)
			 {
			 }
			 else if (a < secmax)
			 {
			 }


		} while (b == ',');
			 if (secmax == 0)
			 {
			 System.out.print("No\n");
			 }

			 else
			 {
				 System.out.printf("%d\n",secmax);
			 }









	  return 0;
	}

}

