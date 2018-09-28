package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int m = 0;
	  int n;
	  int i;
	  int j;
	  int k;
	  String s = new String(new char[21]);

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

			if (s.charAt(0) < '0' || s.charAt(0)>'9')
			{
			   for (j = 0;s.charAt(j) != '\0';j++)
			   {
					if (('a' <= s.charAt(j) && s.charAt(j) <= 'z') || ('A' <= s.charAt(j) && s.charAt(j) <= 'Z') || ('0' <= s.charAt(j) && s.charAt(j) <= '9') || (s.charAt(j) == '_'))
					{
						;
					}
					else
					{
						break;
					}
			   }

				if (s.charAt(j) == '\0')
				{
					System.out.print("yes\n");
				}
				if (s.charAt(j) != '\0')
				{
					System.out.print("no\n");
				}
			}
			 if (s.charAt(0) <= '9' && s.charAt(0) >= '0')
			 {
				 System.out.print("no\n");
			 }

		}

	}
}

