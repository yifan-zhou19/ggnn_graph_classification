package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int k;
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
		for (k = 0;w.charAt(k) != '\0';k++)
		{

				  for (i = 0;s.charAt(i) != '\0';i++)
				  {
					   if (s.charAt(i) != w.charAt(k + i))
					   {
							break;
					   }
				  }
				  if (s.charAt(i) == 0)
				  {
					   System.out.printf("%d",k);
					   break;
				  }

		}
		return 0;
	}

}

