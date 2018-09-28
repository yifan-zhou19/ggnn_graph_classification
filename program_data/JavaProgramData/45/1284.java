package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[100]);
	   String b = new String(new char[100]);
	   int i;
	   int j;
	   int l;
	   int r;
	   int c = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = tempVar2.charAt(0);
	   }
		 l = a.length();
		 r = b.length();
		 for (i = 0;i < r;i++)
		 {
			for (j = 0,c = 0;j < l;j++)
			{
			  if (a.charAt(j) == b.charAt(i + j))
			  {
					  c++;
			  }
			}
		if (c == l)
		{
			 System.out.printf("%d",i);
			 break;
		}
		 }
			   return 0;
	}
}

