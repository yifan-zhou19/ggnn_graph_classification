package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[10]);
		String s2 = new String(new char[10]);
		int[] a = new int[128];
		int[] b = new int[128];
	  int i;
	  int j;
	  int n;
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  s2 = tempVar2.charAt(0);
	  }
	  m = s1.length();
	  n = s2.length();
	  if (m != n)
	  {
		  System.out.print("NO");
	  }
	   else
	   {
				 for (i = 0;i < 128;i++)
				 {
					 a[i] = 0;
					 b[i] = 0;
				   for (j = 0;j < m;j++)
				   {
						  if (i == s1.charAt(j))
						  {
							  a[i]++;
						  }
					  if (i == s2.charAt(j))
					  {
						  b[i]++;
					  }
				   }
					  if (a[i] != b[i])
					  {
						  break;
					  }
				 }
			if (i < 127)
			{
				System.out.print("NO");
			}
		   else if (a[127] != b[127])
		   {
			   System.out.print("NO");
		   }
			else
			{
				System.out.print("YES");
			}
	   }
	}

}

