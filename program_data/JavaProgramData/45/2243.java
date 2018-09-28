package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String sor = new String(new char[20]);
	   String wt = new String(new char[20]);
	   int i;
	   int j;
	   int tag;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   wt = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   sor = tempVar2.charAt(0);
	   }
	   int n = sor.length();
	   int k = wt.length();
	   for (i = 0;i < n - k + 1;i++)
	   {
		   tag = 0;
		   for (j = i;j <= i + k - 1;j++)
		   {
			   if (wt.charAt(j - i) != sor.charAt(j))
			   {
				   tag = 1;
				   break;
			   }
		   }
		   if (tag == 0)
		   {
			   System.out.printf("%d",i);
			   break;
		   }
	   }
		return 0;
	}



}

