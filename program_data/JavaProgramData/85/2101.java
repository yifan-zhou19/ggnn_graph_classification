package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[21]);
		int n;
		int i;
		int j;
		int[] p = new int[100];
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
				s = tempVar2.charAt(0);
			}
			p[i] = 1;
			for (j = 1;j < s.length();j++)
			{
				if (s.charAt(0) == '_' || s.charAt(0) >= 'a' && s.charAt(0) <= 'z' || s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
				{
					if (s.charAt(j) == '_' || s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= 'A' && s.charAt(j) <= 'Z' || s.charAt(j) >= '0' && s.charAt(j) <= '9')
					{
						p[i] = 1;
					}
					else
					{
						p[i] = 0;
						break;
					}
				}
				else
				{
					p[i] = 0;
						break;
				}
			}
		}
		   for (i = 0;i < n;i++)
		   {
			   if (p[i] != 0)
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

