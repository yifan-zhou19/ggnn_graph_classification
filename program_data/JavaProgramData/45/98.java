package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int j;
		int q;
		int p = 0;
		int l;
		for (;;)
		{
		   for (j = p;;j++)
		   {
			 if (a.charAt(0) == b.charAt(j))
			 {
			   p = j;
			   break;
			 }
		   }
		   for (l = 1;a.charAt(l) != '\0';l++)
		   {
			   if (a.charAt(l) != b.charAt(j + l))
			   {
				  q = 1;
				  break;
			   }
			   else
			   {
				   q = 0;
			   }
		   }
		   if (q == 0)
		   {
			 break;
		   }
		}
		   System.out.printf("%d\n",p);
		  return 0;
	}
}

