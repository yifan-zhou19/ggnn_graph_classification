package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[29]);
		int i;
		int j;
		int n;
		int k = 0;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			k = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		len = a.length();
		 if ((a.charAt(0) == '_') || (a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a') && (a.charAt(0) <= 'z'))
		 {
			 for (j = 1;j < len;j++)
			 {
			  if ((a.charAt(j) == '_') || (a.charAt(j) >= 'A') && (a.charAt(j) <= 'Z') || (a.charAt(j) >= 'a') && (a.charAt(j) <= 'z') || (a.charAt(j) >= '0') && (a.charAt(j) <= '9'))
			  {
			 k++;
			  }
			 }
		 if (k == len - 1)
		 {
			 System.out.print("yes\n");
		 }
		 if (k != len - 1)
		 {
			 System.out.print("no\n");
		 }
		 }
		 else
		 {
		 System.out.print("no\n");
		 }

		}

		 return 0;
	}

}

