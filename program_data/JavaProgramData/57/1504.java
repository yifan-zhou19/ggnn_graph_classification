package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b;
		String a = new String(new char[50]);
		String p;
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		   b = a.length();
		   p = a.charAt(b - 2);
		   if ((p == 'l') || (p == 'e'))
		   {
				p = '\0';
				System.out.printf("%s\n",a);
		   }
		   else
		   {
			  p = a.charAt(b - 3);
			  p = '\0';
			System.out.printf("%s\n",a);
		   }
		}
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 d = tempVar3.charAt(0);
		 }
		 return 0;
	}
}

