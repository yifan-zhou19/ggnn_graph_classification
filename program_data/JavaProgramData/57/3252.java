package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[33]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		  int l = a.length();
		 if (a.charAt(l - 1) == 'r' || a.charAt(l - 1) == 'y')
		 {
			 a = a.substring(0, l - 2);
		 }
		 else if (a.charAt(l - 1) == 'g')
		 {
			 a = a.substring(0, l - 3);
		 }
			  System.out.printf("\n%s",a);
		}
		return 0;
	}



}

