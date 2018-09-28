package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[20]);
		int n;
		int i;
		int j;
		int k = 0;
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
			k = 0;
			for (i = 0;s.charAt(i) != '\0';i++)
			{

				if (!((s.charAt(i) == '_') || (s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')))
				{
					k++;
				}
				else if (!(s.charAt(0) == '_' || (s.charAt(0) <= 'z' && s.charAt(0) >= 'a') || (s.charAt(0) <= 'Z' && s.charAt(0) >= 'A')))
				{

					k++;
				}



			}
			if (k > 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}

	}
}

