package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int j = 0;
		int k = -1;
		int n;
		int p;
		int q;
		int s;
		int h = 0;
		int r;
		int[] d = new int[256];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		for (i = 0;i < 256;i++)
		{
						   if (a.charAt(i) == b.charAt(0))
						   {
										  k = 0;
										  d[j] = i;
										  j += 1;
						   }
		}
		n = b.length();
		p = c.length();
		q = a.length();
		if (k != -1)
		{
				  for (s = 0;s < j;s++)
				  {
				  for (i = d[s];i < d[s] + n;i++)
				  {
										   r = d[s];
										   if (a.charAt(i) != b.charAt(i - r))
										   {
															h += 1;
															 break;
										   }
				  }
				  if (i == d[s] + n)
				  {
							 for (r = 0;r < d[s];r++)
							 {
											  System.out.printf("%c",a.charAt(r));
							 }
							 for (r = 0;r < p;r++)
							 {
											  System.out.printf("%c",c.charAt(r));
							 }
							 for (r = d[s] + n;r < q;r++)
							 {
												System.out.printf("%c",a.charAt(r));
							 }
	break;
				  }
				  }
				  if (h == j)
				  {
						   System.out.printf("%s",a);
				  }
		}
		else
		{
			 System.out.printf("%s",a);
		}
		return 0;
	}


}

