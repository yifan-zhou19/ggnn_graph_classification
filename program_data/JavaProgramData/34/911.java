package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	   int[] s = new int[1000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;;i++)
	   {
		   s[0] = n;
	if (s[i] > 1)
	{
		   if (s[i] % 2 == 0)
		   {
			  s[i + 1] = s[i] / 2;
			  System.out.printf("%d/2=%d\n",s[i],s[i + 1]);
		   }
		   else
		   {
			   s[i + 1] = 3 * s[i] + 1;
			   System.out.printf("%d*3+1=%d\n",s[i],s[i + 1]);
		   }
	}
	else
	{
	System.out.print("End");
	break;
	}
	   }
		 return 0;
	}
}

