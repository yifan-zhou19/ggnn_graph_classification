package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int k;
		String a = new String(new char[21]);

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
			k = 0;

			if ((a.charAt(0) == '_') || ((a.charAt(0) >= 'a') && (a.charAt(0) <= 'z')) || ((a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z')))
			{
				k++;
					for (j = 1;j < a.length();j++)
					{
						if ((a.charAt(j) == '_') || ((a.charAt(j) >= 'a') && (a.charAt(j) <= 'z')) || ((a.charAt(j) >= 'A') && (a.charAt(j) <= 'Z')) || ((a.charAt(j) >= '0') && (a.charAt(j) <= '9')))
						{
							k++;
						}
					}
					  if (k == a.length())
					  {
						  System.out.print("yes\n");
					  }
					  else
					  {
						  System.out.print("no\n");
					  }
			}
			else
			{
					System.out.print("no\n");
			}
		}
	}





}

