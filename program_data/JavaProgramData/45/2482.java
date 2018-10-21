package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		char c;
		int i;
		int j;
		int d;
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
		for (i = 0;i < b.length();i++)
		{
			d = 0;
			if (a.charAt(0) == b.charAt(i))
			{
			   d = 1;
			   for (j = 0;j < a.length();j++)
			   {
					if (a.charAt(j) != b.charAt(i + j))
					{
					  d = 2;
					  break;
					}
			   }
			   if (d == 1)
			   {
				   System.out.printf("%d",i);
				   break;
			   }
			}
		}
		return 0;
	}

}

