package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[6][99999];
	 int i;
	 int k;
	 int j;
	 int m;
	 int n;
	 int p;
	 int q;
	 void re(char x[99999]);
	 void xl(char x[99999]);
	 for (i = 0;i < 6;i++)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[i] = tempVar.charAt(0);
		 }
		 re(a[i]);
		 xl(a[i]);
	 }
	 for (i = 0;i < 6;i++)
	 {
	  System.out.printf("%s\n",a[i]);
	 }

	}


	 public static void re(String x)
	 {
		 int i;
		 int t;
	  int l = x.length();
	  if (strcmp(x,"-0") == 0)
	  {
		x = "0";
	  }
	  else
	  {
		   if (x[0].equals('-'))
		   {
			 for (i = 1;i <= (l / 2);i++)
			 {
			   t = x[i];
			   x[i] = x[l - i];
			   x[l - i] = t;
			 }
		   }
		 else
		 {
			 for (i = 0;i < (l / 2);i++)
			 {
			   t = x[i];
			   x[i] = x[l - i - 1];
			   x[l - i - 1] = t;
			 }
		 }
	  }
	 }
	 public static void xl(String x)
	 {
		 int i;
		 int p;
	  if (strcmp(x,"0") != 0)
	  {
			 if (x[0].equals('-'))
			 {
			   for (i = 1,p = 0;x[i].equals('0');i++)
			   {
				  p++;
			   }
			for (i = p + 1; !x[i].equals('\0');i++)
			{
				 x[i - p] = x[i];
			}
			x[x.length() - p] = '\0';
			 }
		  else
		  {
			   for (i = 0,p = 0;x[i].equals('0');i++)
			   {
				 p++;
			   }
			for (i = p; !x[i].equals('\0');i++)
			{
				 x[i - p] = x[i];
			}
			x[x.length() - p] = '\0';
		  }

	  }
	 }

}

