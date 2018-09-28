package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int b;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100]);
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = tempVar2.charAt(0);
				}
				t = a.length();
				if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
				{
					b = 0;
					for (j = 1;j < t;j++)
					{
						if (a.charAt(j) == '_' || (a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z'))
						{
							b = 0;
						}
						else
						{
							b = 1;
							break;
						}
					}

					if (b == 1)
					{
						System.out.print("no\n");
					}
					else
					{
						System.out.print("yes\n");
					}

				}
				else
				{
					System.out.print("no\n");
				}
			}


		return 0;
	}

}

