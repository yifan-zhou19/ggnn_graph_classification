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
		int l1;
		int l2;
		int i;
		int t = 1;
		int j;
		int m;
		int y;
		l1 = a.length();
		l2 = b.length();

		for (i = 0;i < l2;i++)
		{
		   if (b.charAt(i) == a.charAt(0))
		   {
			   m = i;

			   for (j = 1,y = m;j < l1;j++,y++)
			   {
				   if (b.charAt(y + 1) == a.charAt(j))
				   {
					   t++;
				   }
								  if (t == l1)
								  {
					   System.out.printf("%d",m);
					   break;
								  }
			   }
		   }
		}
	return 0;
	}

}

