package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	   String a = new String(new char[5]);
	   int i;
	   int j = 0;
	   int[] b = new int[5];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   int n = a.length();
	   for (i = n - 1; i >= 0; i--)
	   {
		 b[j++] = a.charAt(i) - '0';
	   }
	   for (j = 0;j < n;j++)
	   {
	   System.out.printf("%d",b[j]);
	   }
	   return 0;
	 }
}

