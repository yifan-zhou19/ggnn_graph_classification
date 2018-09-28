package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int di;
	   int number;
	   int k;
	   int j;
	   int n;
	   n = 1;
	   di = 10;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   number = Integer.parseInt(tempVar);
	   }
	   do
	   {
		   j = number - di;
	   if (j > 0)
	   {
	   n = n + 1;
	   di = di * 10;
	   }
	   } while (j > 0);
	   j = 0;
	   di = 10;
	   do
	   {
		   k = ((number % di) - (number % (di / 10))) / (di / 10);
		   System.out.printf("%d",k);
		   di = di * 10;
		   j = j + 1;
	   } while (j < n);
	}



}

