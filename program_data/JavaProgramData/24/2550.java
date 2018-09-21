package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String c = new String(new char[200]);
		int n;
		int i;
		int max;
		int min;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
			b = a;
			c = a;
		for (i = 0;i < n - 1;i++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a = tempVar3.charAt(0);
		  }
		  if (a.length() > b.length())
		  {
			  b = a;
		  }
		  if (a.length() < c.length())
		  {
			  c = a;
		  }
		}
		System.out.printf("%s\n",b);
		System.out.printf("%s\n",c);
		return 0;
	}
}

