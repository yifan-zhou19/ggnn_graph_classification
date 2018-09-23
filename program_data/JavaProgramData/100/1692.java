package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		char[] A = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i = 0;
		int sum = 0;
		char tmp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			tmp = str.charAt(i);
			if (tmp >= 'a' && tmp <= 'z')
			{
				tmp = tmp - 'a';
				a[(int)tmp]++;
			}
			else
			{
				if (tmp >= 'A' && tmp <= 'z')
				{
				tmp = tmp - 'A';
				A[(int)tmp]++;
				}


			}
		}
		for (i = 0;i < 26;i++)
		{
			if (A[i] != 0)
			{
				System.out.printf("%c=%d\n",('A' + i),A[i]);
				sum++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",('a' + i),a[i]);
				sum++;
			}

		}

		if (sum == 0)
		{
			System.out.print("No\n");
		}




		return 0;
	}
}

