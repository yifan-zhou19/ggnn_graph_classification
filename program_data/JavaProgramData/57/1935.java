package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] as =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				as[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			int l = String.valueOf(as[i]).length();
			if (as[i][l - 2] == 'e' && as[i][l - 1] == 'r')
			{
				as[i][l - 2] = 0;
				as[i][l - 1] = 0;
			}
			if (as[i][l - 2] == 'l' && as[i][l - 1] == 'y')
			{
				as[i][l - 2] = 0;
				as[i][l - 1] = 0;
			}
			if (as[i][l - 3] == 'i' && as[i][l - 2] == 'n' && as[i][l - 1] == 'g')
			{
				as[i][l - 3] = 0;
				as[i][l - 2] = 0;
				as[i][l - 1] = 0;
			}
			System.out.printf("%s\n",as[i]);
		}
	}












}

