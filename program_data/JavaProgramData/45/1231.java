package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] w = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 s = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 w = tempVar2.charAt(0);
	 }
	 int n;
	 int l;
	 int j;
	 int k = 0;
	 int b = 0;
	 int a = 2;
	 int c;
	 n = s.length();
	 l = w.length();
	 c = l - n;
	 for (j = 0;j < c + 1 && a == 2;j++)
	 {
	  if (s[0] == w[j])
	  {
		  a = 1;
	   b = j;
	   for (k = j;k < j + n;k++)
	   {
		if (s[k - j] != w[k])
		{
		 a = 2;
		 break;
		}
	   }
	  }
	 }
	 System.out.printf("%d",b);
	 return 0;
	}

}

