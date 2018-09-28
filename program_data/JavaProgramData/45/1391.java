package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int num;
		int la;
		int lb;
		num = 0;
		m = 0;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
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
		la = a.length();
		lb = b.length();
		for (i = 0;i < lb - la;i++)
		{
		   if (m != 0)
		   {
			   break;
		   }
		   for (j = 0;j < la;j++)
		   {
			  if (a.charAt(j) != b.charAt(j + i))
			  {
				 num = num + 1;
				 break;
			  }
			  m = 1;
		   }
		}
		System.out.printf("%d",num);
		return 0;
	}
}

