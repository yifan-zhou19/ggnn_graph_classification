package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String s3 = new String(new char[100]);
		int i;
		int j;
		int k;
		int n;
		int m;
		int f;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
		m = s2.length();
		n = s1.length();
		for (i = 0;i < s1.length();i++)
		{
			f = 0;
			for (j = 0;j < s2.length();j++)
			{
				if (s2.charAt(j) != s1.charAt(i + j))
				{
					f = 1;
					break;
				}
			}
			if (f == 0)
			{
					q = i;
					break;
			}
		}
	   if (f == 1)
	   {
		   System.out.printf("%s\n",s1);
	   }
	   else
	   {
		   for (k = 0;k < q;k++)
		   {
			   System.out.printf("%c",s1.charAt(k));
		   }
		   System.out.printf("%s",s3);
		   for (k = q + m;k < n;k++)
		   {
		   System.out.printf("%c",s1.charAt(k));
		   }
		   System.out.print("\n");
	   }

	   return 0;
	}
}

