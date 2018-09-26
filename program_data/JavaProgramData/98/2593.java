package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int sum = 0;
	int len = 0;
	String word = new String(new char[40]);
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
		word = tempVar2.charAt(0);
	}
	len = word.length();
	if (len + sum > 80)
	{
	 System.out.print("\n");
	 System.out.printf("%s",word);
	 sum = len;
	}
	else
	{
		if (sum == 0)
		{
		 System.out.printf("%s",word);
	 sum = sum + len;
		}
	 else
	 {
		sum = sum + len + 1;
	  if (sum > 80)
	  {
		 System.out.print("\n");
	 System.out.printf("%s",word);
	 sum = len;
	  }
	else
	{
	System.out.printf(" %s",word);
	}
	 }
	}
	}
	return 0;
	}

}

