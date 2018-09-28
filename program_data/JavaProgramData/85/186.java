package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		String s = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n + 1;i++)
		{
			k = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (Character.isLetter(s.charAt(0)) || s.charAt(0) == '_')
			{
				for (j = 1;s.charAt(j) != '\0';j++)
				{
					if (Character.isLetterOrDigit(s.charAt(j)) || s.charAt(j) == '_')
					{
						k++;
					}

				}
				if (k == j)
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

