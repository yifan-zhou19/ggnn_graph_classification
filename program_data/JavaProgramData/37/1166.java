package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int t;
	  int i = 0;
	  int l;
	  int j;
	  int k;
	  int n;
	  String s = new String(new char[100000]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < t;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s = tempVar2.charAt(0);
		 }
		 l = s.length();
		 for (j = 0;;j++)
		 {
			 n = 0;
			 for (k = 0;k < l;k++)
			 {
				 if (j == k)
				 {
					 continue;
				 }
				 if (s.charAt(j) == s.charAt(k))
				 {
				   break;
				 }
				if (k == l - 1)
				{

					System.out.printf("%c\n",s.charAt(j));
					n++;
					break;
				}
			 }
			 if (n == 1)
			 {
				 break;
			 }
			 if (n == 0)
			 {
			   if (j + 1 == l)
			   {
				   System.out.print("no\n");
			   }
			 }
		 }
	  }


	  return 0;
	}

}

