package <missing>;

public class GlobalMembers
{
	public static int wer(int a)
	{
		  int n;
		  int i;
		  n = a % 2;
		 if (n == 1)
		 {
			  i = 3 * a + 1;
		 }
		 else
		 {
			  i = a / 2;
		 }
		 return i;
	}
	public static int Main()
	{
		 int a;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
	if (a == 1)
	{
	System.out.print("End");
	}
	else
	{
		 for (;;)
		 {
		 if (a % 2 == 1)
		 {
						System.out.printf("%d*3+1=%d\n",a,wer(a));
						 a = wer(a);
		 }
		 else
		 {
						System.out.printf("%d/2=%d\n",a,wer(a));
						a = wer(a);
		 }
		  if (a == 1)
		  {
			  System.out.print("End");
		  break;
		  }
		 }
	}
	}

}

