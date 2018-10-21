package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String w = new String(new char[256]);
		String v = new String(new char[256]);
		int i;
		int j;
		int slen;
		int wlen;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			v = tempVar3.charAt(0);
		}
			slen = s.length();
		wlen = w.length();
		   for (i = 0;i <= wlen - slen;i++)
		   {
			for (j = 0; j < slen; j++)
			{
				 if (w.charAt(i + j) != s.charAt(j))
				 {
					break;
				 }
			}
	if (j == slen)
	{
		break;
	}
		   }
		  if (j == slen)
		  {
			   for (k = 0;k < i;k++)
			   {
				System.out.printf("%c",w.charAt(k));
			   }
			   System.out.printf("%s",v);
			 if (w.charAt(i + slen) != 0)
			 {
			  for (k = i + slen;k < wlen;k++)
			  {
			System.out.printf("%c",w.charAt(k));
			  }
			 }

		  }
		 else if (i == wlen - slen + 1)
		 {
		 System.out.printf("%s",w);
		 }
		 return 0;
	}

}

