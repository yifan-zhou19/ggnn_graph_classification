package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String q = new String(new char[256]);
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
				q = tempVar2.charAt(0);
			}
			for (j = 0;q.charAt(j) != '\0';j++)
			{
				 if (q.charAt(j) == 'A')
				 {
					System.out.print("T");
				 }
				else
				{
					if (q.charAt(j) == 'T')
					{
						System.out.print("A");
					}
					else
					{
						if (q.charAt(j) == 'C')
						{
							System.out.print("G");
						}
						else
						{
							if (q.charAt(j) == 'G')
							{
								System.out.print("C");
							}
						}
					}
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

