package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String A = new String(new char[2013]);
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		while (N -- != 0)
		{
			A = new Scanner(System.in).nextLine();
			int L = A.length();
			int K = 0;
			for (int I = 0; I < L; I++)
			{
				int Flag = 0;
				if ('A' <= A.charAt(I) && A.charAt(I) <= 'Z')
				{
					Flag++;
				}
					else if ('a' <= A.charAt(I) && A.charAt(I) <= 'z')
					{
						Flag++;
					}
						else if ('0' <= A.charAt(I) && A.charAt(I) <= '9')
						{
							Flag++;
						}
							else if (A.charAt(I) == '_')
							{
								Flag++;
							}
				if (Flag == 0)
				{
					K = 1;
				}
			}
			if (('A' <= A.charAt(0) && A.charAt(0) <= 'Z') || ('a' <= A.charAt(0) && A.charAt(0) <= 'z') || (A.charAt(0) == '_'))
			{
				;
			}
			else
			{
				K = 1;
			}
			if (K == 0)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
				else
				{
					System.out.print("no");
					System.out.print("\n");
				}
		}
	}
}

