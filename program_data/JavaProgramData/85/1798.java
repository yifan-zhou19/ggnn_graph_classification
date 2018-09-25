package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int l;
		int pd = 1;
		char[][] jj = new char[1000][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
	for (i = 0;i < a;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jj[i] = tempVar2.charAt(0);
			}
			l = String.valueOf(jj[i]).length();
		if (jj[i][0] == 95 || (jj[i][0] >= 65 && jj[i][0] <= 90) || (jj[i][0] >= 97 && jj[i][0] <= 122))
		{
			for (j = 1;j < l;j++)
			{
				 if (jj[i][j] != 95 && (jj[i][j] < 48 || (jj[i][j]>57 && jj[i][j] < 65) || (jj[i][j]>90 && jj[i][j] < 97) || jj[i][j]>122))
				 {
					 System.out.print("no\n");
					 pd = 0;
					 break;
				 }
			}
			if (j = l - 1 && pd == 1)
			{
			System.out.print("yes\n");
			}
			pd = 1;
		}
		else
		{
		System.out.print("no\n");
		}
	}
		return 0;
	}
}

