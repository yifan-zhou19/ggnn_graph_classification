package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[LEN]);
		String w = new String(new char[LEN]);
		int len1;
		int len2;
		int i;
		int j;
		int l;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		len1 = z.length();
		len2 = w.length();
		for (i = 0;i < len1;i++)
		{
		   for (j = 0;j < len2;j++)
		   {
			  if (z.charAt(i) == w.charAt(j))
			  {
				   l = j;
				   for (i = 0;i < len1;i++)
				   {
					  if (z.charAt(i) != w.charAt(i + j))
					  {
									   flag = 1;
									   break;
					  }
				   }
				   if (flag == 0)
				   {
							   System.out.printf("%d\n",l);
				   }
			  }
		   }
		}
			   return 0;
	}
}

