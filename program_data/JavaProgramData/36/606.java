package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int m;
		int flag1 = 0;
		int flag2 = 0;
		int lolo = 0;
		int p;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
	   n = a.length();
	   p = b.length();
	   if (n != p)
	   {
		   System.out.print("NO");
	   }
	   else
	   {
		   for (m = 97;m <= 122;m++)
		   {
		   for (i = 0;i < n;i++)
		   {
						if (a.charAt(i) == m)
						{
							flag1++;
						}
						if (b.charAt(i) == m)
						{
							flag2++;
						}
		   }
	   if (flag1 != flag2)
	   {
		   System.out.print("NO");
		   lolo = 1;
		   break;
	   }
	   else
	   {
		   lolo++;
	   }
		   }
	   if (lolo > 1)
	   {
		   System.out.print("YES");
	   }
	   }
	   return 0;
	}



}

