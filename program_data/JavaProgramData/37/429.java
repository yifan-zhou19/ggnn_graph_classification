package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int l;
	  int j;
	  int k;
	  String a = new String(new char[100000]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  int count = 0;
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   l = a.length();
	   for (j = 0;j < l - 1;j++)
	   {
		 for (k = 0;k < l;k++)
		 {
			 if (a.charAt(j) == a.charAt(k) && j != k)
			 {
		   break;
			 }
		 }
		 if (k == l)
		 {
			 count++;
		  if (count == 1)
		  {
		  System.out.printf("%c\n",a.charAt(j));
		  }
		 }
	   }
	   if (count == 0)
	   {
	   System.out.print("no\n");
	   }
	  }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}

}

