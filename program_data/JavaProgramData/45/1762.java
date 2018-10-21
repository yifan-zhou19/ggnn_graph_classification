package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		int same;
		int i;
		int k;
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			int result = 1;
		  for (k = 0;s.charAt(k) != '\0';k++)
		  {
			 if (w.charAt(i + k) != s.charAt(k))
			 {
			 same = 0;
			 }
			 else
			 {
			 same = 1;
			 }
			 result = result * same;
		  }
		  if (result == 1)
		  {
			  System.out.printf("%d",i);
		  break;
		  }
		}

	return 0;
	}

}

