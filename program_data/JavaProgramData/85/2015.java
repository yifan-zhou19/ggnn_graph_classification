package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			k = 0;
			String sz = new String(new char[21]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz = tempVar2.charAt(0);
			}
			z = sz.length();
			if ((sz.charAt(0) <= 'z' && sz.charAt(0) >= 'a') || (sz.charAt(0) <= 'Z' && sz.charAt(0) >= 'A') || (sz.charAt(0) == '_'))
			{
				k++;
			}
		  else
		  {
			  k -= 100;
		  }
			for (int m = 1;m < z;m++)
			{
			if ((sz.charAt(m) <= 'z' && sz.charAt(m) >= 'a') || (sz.charAt(m) <= 'Z' && sz.charAt(m) >= 'A') || (sz.charAt(m) >= '0' && sz.charAt(m) <= '9') || (sz.charAt(m) == '_'))
			{
				k++;
			}
		  else
		  {
			  k -= 100;
		  }

			}

		  if (k > 0)
		  {
			  System.out.print("yes\n");
		  }
		  else
		  {
			  System.out.print("no\n");
		  }

		}

	return 0;
	}

}

