package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int x;
	   int u;
	   int i;
	   int result;
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x = Integer.parseInt(tempVar);
	   }
	   u = Math.floor(Math.log10(x));
	   result = 0;
	   for (i = 1;i <= u + 1;i++)
	   {
		   t = Math.pow(10,i);
		  result = result + Math.floor(((x % t) / Math.pow(10,i - 1))) * Math.pow(10,u - i + 1);
	   }
	   System.out.printf("%ld",result);
	}

}

