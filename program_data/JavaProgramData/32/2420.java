package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		int m;
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
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
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = tempVar3.charAt(0);
		  }
		   p = a.length();
		   q = b.length();
		 for (j = 0;j < q;j++)
		 {
			 m = a.charAt(p - 1 - j) - b.charAt(q - 1 - j);
		   if (m < 0)
		   {
			   m += 10,a.charAt(p - 2 - j) -= 1;
		   }
		   c[p - 1 - j] = '0' + m;
		 }
		for (j = 0;j < p - q;j++)
		{
		  c[j] = a.charAt(j);
		}
		 for (j = 0;j < p;j++)
		 {
		  if (c[j] != '0')
		  {
			  break;
		  }
		 }
		 for (;j < p;j++)
		 {
		  System.out.printf("%c",c[j]);
		 }
		System.out.print("\n");
		}
	}
}

