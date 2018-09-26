package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[50]);
	 String s = new String(new char[50]);
	 int i;
	 int j;
	 int m;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 s = tempVar2.charAt(0);
	 }
	 n = a.length();
	 m = s.length();
	 for (i = 0;i <= m - 1;i++)
	 {
	  if (s.charAt(i) == a.charAt(0))
	  {
	   for (j = 1;j <= n - 1;j++)
	   {
		if (a.charAt(j) == s.charAt(i + j))
		{
			;
		}
		else
		{
		break;
		}
	   }
	   if (j == n)
	   {
	   System.out.printf("%d\n",i);
	   }
	   break;
	  }
	 }
	}




}

