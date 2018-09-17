package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int m;
	   int n;
	   int i;
	   int j;
	   int k;
	   int sign = 0;
	   String tt = new String(new char[301]);

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   tt = tempVar.charAt(0);
	   }
	   for (n = 65;n <= 90;n++)
	   {
		   int p = 0;
		   for (i = 0;tt.charAt(i) != '\0';i++)
		   {
			  if (tt.charAt(i) == n)
			  {
				  p++;
			  }
		   }
		   if (p != 0)
		   {
			   System.out.printf("%c=%d\n",n,p);
			   sign++;
		   }
	   }
	   for (n = 97;n <= 122;n++)
	   {
		   int p = 0;
		   for (i = 0;tt.charAt(i) != '\0';i++)
		   {
			  if (tt.charAt(i) == n)
			  {
				  p++;
			  }
		   }
		   if (p != 0)
		   {
			   System.out.printf("%c=%d\n",n,p);
			   sign++;
		   }
	   }
	   if (sign == 0)
	   {
		   System.out.print("No\n");
	   }
	}
}

