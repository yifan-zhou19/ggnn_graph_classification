package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int counta = 0;
		int countc = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String legal = new String(new char[81]);
		System.in.read();

		for (i = 0;i < n;i++)
		{
			legal = new Scanner(System.in).nextLine();
			k = legal.length();

			if (k == 1)
			{
				countc = 0;
				if ((legal.charAt(0) >= 'A' && legal.charAt(0) <= 'Z') || (legal.charAt(0) >= 'a' && legal.charAt(0) <= 'z') || (legal.charAt(0) == '_'))
				{
					countc++;
				}
				if (countc == 1)
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("0\n");
				}
			}

			else
			{
				if ((*(legal) >= 'A' && *(legal) <= 'Z') || (*(legal) >= 'a' && *(legal) <= 'z') || (*(legal) == '_'))
				{
					counta = 0;
					for (j = 1;j < k;j++)
					{
						if ((*(legal.Substring(j)) >= 'A' && *(legal.Substring(j)) <= 'Z') || (*(legal.Substring(j)) >= 'a' && *(legal.Substring(j)) <= 'z') || (*(legal.Substring(j)) == '_') || (*(legal.Substring(j)) >= '0' && *(legal.Substring(j)) <= '9'))
						{
							counta++;
						}
					}
					if (counta == k - 1)
					{
						System.out.print("1");
						System.out.print("\n");
					}
					else
					{
						System.out.print("0");
						System.out.print("\n");
					}
				}
				else
				{
					System.out.print("0");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

