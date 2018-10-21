package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] z = new char[20][DefineConstants.NUM];
		int n;
		int i = 0;
		int j = 0;
		int len;
		int k;
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
				z[i] = tempVar2.charAt(0);
			}

		}

		for (i = 0;i < n - 1;i++)
		{

			len = String.valueOf(z[i]).length();

			for (j = 0;j < len;j++)
			{

			   if (j == 0)
			   {
				if (z[i][j] == '_' || (z[i][j] >= 'a' && z[i][j] <= 'z') || (z[i][j] >= 'A' && z[i][j] <= 'Z'))
				{
					continue;
				}
				else
				{
				System.out.print("no\n");
				break;
				}

			   }
			   else
			   {
				if ((z[i][j] == '_') || (z[i][j] >= 'a' && z[i][j] <= 'z') || (z[i][j] >= 'A' && z[i][j] <= 'Z') || (z[i][j] >= '0' && z[i][j] <= '9'))
				{
					continue;
				}
				 else
				 {
					 System.out.print("no\n");
					 break;
				 }
			   }

			}
			if (j == len)
			{
				System.out.print("yes\n");
			}

		}
		if (i == n - 1)
		{
		 k = String.valueOf(z[n - 1]).length();
		 for (j = 0;j < k;j++)
		 {
				if (j == 0)
				{

				if ((z[n - 1][j] == '_') || (z[n - 1][j] >= 'a' && z[n - 1][j] <= 'z') || (z[n - 1][j] >= 'A' && z[n - 1][j] <= 'Z'))
				{
					continue;
				}
				else
				{
					System.out.print("no");
					break;
				}

				}
				else
				{

				if ((z[n - 1][j] == '_') || (z[n - 1][j] >= 'a' && z[n - 1][j] <= 'z') || (z[n - 1][j] >= 'A' && z[n - 1][j] <= 'Z') || (z[n - 1][j] >= '0' && z[n - 1][j] <= '9'))
				{
					continue;
				}
				 else
				 {
					 System.out.print("no");
					 break;
				 }

				}

		 }
			   if (j == k)
			   {
				   System.out.print("yes");
			   }
		}





		return 0;

	}



}

final class DefineConstants
{
	public static final int NUM = 100;
}

