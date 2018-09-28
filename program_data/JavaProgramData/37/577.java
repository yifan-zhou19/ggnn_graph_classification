package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   t = Integer.parseInt(tempVar);
	   }
	   for (int v = 0;v < t;v++)
	   {
		  String s = new String(new char[100000]);
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s = tempVar2.charAt(0);
		  }
		  int[] a = new int[26];
		  for (int i = 0;i < s.length();i++)
		  {
			  int m = s.charAt(i) - 'a';
			  a[m]++;
		  }
		  int p = 0;
		  for (int i = 0;i < s.length();i++)
		  {
			 int m = s.charAt(i) - 'a';
			 if ((a[m] == 1) && (p == 0))
			 {
				 System.out.printf("%c\n",s.charAt(i));
				 p++;
				 break;
			 }
		  }
		  if (p == 0)
		  {
			  System.out.print("no\n");
		  }
	   }
	   System.in.read();
	   System.in.read();
	}

}

