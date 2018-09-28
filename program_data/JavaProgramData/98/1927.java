package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] A = new char[250][250];
		int n;
		int i;
		int a;
		int s;
		int b;
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
				A[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = String.valueOf(A[i]).length();
			s = a + s;
			if (s == 80)
			{
				System.out.printf("%s\n",A[i]);
				s = 0;
			}
			else if (s > 80)
			{
				if (i != n - 1)
				{
				System.out.printf("\n%s ",A[i]);
				}
				else
				{
					System.out.printf("\n%s\n",A[i]);
				}
				s = a + 1;
			}
			else
			{
				b = String.valueOf(A[i + 1]).length();
				if (i != n - 1)
				{
					if (s + b + 1 > 80)
					{
				System.out.printf("%s",A[i]);
					}
					else
					{
						System.out.printf("%s ",A[i]);
					}
				}
				else
				{
					System.out.printf("%s\n",A[i]);
				}
				s = s + 1;
			}
		}
		return 0;
	}



}

