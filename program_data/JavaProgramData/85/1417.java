package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m = 1;
	String s = new String(new char[MAX + 1]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}

	  for (i = 0;s.charAt(i) != '\0';i++)
	  {
			if (!((s.charAt(i) == '_') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9' && i>0)))
			{
			m = 0;
			break;
			}
			else
			{
				m = 1;
			}

	  }
	  if (m == 0)
	  {
					System.out.print("no\n");
	  }
				else if (m == 1)
				{
				System.out.print("yes\n");
				}
	}
	return 0;
	}










}

