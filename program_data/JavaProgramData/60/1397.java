package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int i;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n >= 5)
		 {
				  for (i = 5;i <= n;i++)
				  {
			 int a;
			 int b = 0;
			 int c;
			 for (a = 2;a < i;a++)
			 {
				if (i % a == 0)
				{
				b = b + 1;
				}
			 }
			  if (b == 0)
			  {

			   for (c = 2;c < i - 2;c++)
			   {
				if ((i - 2) % c == 0)
				{
				b = b + 1;
				}
			   }

				if (b == 0)
				{
				System.out.printf("%d %d\n",i - 2,i);
				}
			  }
				b = 0;
				  }
		 }

			  else
			  {
				  System.out.print("empty");
			  }

		 return 0;
	 }
}

