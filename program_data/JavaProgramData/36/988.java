package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String str = new String(new char[50]);
	  String s = new String(new char[50]);
	  int p;
	  int i;
	  int k;
	  int m;
	  int n;
	  int[] a = new int[128];
	  int[] b = new int[128];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  str = tempVar2.charAt(0);
	  }
	  m = s.length();
	  n = str.length();
	  if (m != n)
	  {
		  System.out.print("NO");
	  }
	  else
	  {
		 for (i = 0;i <= 127;i++)
		 {
			 a[i] = 0;
			 b[i] = 0;
		 }
		 for (i = 0;i < m;i++)
		 {
			p = s.charAt(i);
			a[p]++;
		 }
		 for (i = 0;i < m;i++)
		 {
			p = str.charAt(i);
			b[p]++;
		 }
		 k = 0;
		 for (i = 1;i <= 127;i++)
		 {
		 if (a[i] != b[i])
		 {
			 k = 1;
		 }
		 }
		 if (k == 0)
		 {
			 System.out.print("YES");
		 }
		 else
		 {
			 System.out.print("NO");
		 }
	  }
	}


}

