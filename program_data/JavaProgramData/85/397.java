package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int j;
		int n;
		int i;
		int count = 0;
		int t;
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
			a[i] = tempVar2.charAt(0);
		}
		for (j = 0;j < String.valueOf(a[i]).length();j++)
		{
			if ((int)a[i][0] > 47 && (int)a[i][0] < 58)
			{
				count++;
				break;
			}
			if ((((int)a[i][j]) < 58 && ((int)a[i][j]>47)) || (((int)a[i][j] < 91) && ((int)a[i][j]>64)) || (((int)a[i][j] < 123) && ((int)a[i][j]>96)) || (((int)a[i][j] == 95)))
			{
				continue;
			}
			else
			{
				count++;
			}
		}
		   if (count == 0)
		   {
			System.out.print("yes\n");
		   }
			else
			{
				System.out.print("no\n");
			}
			count = 0;
		}

	return 0;
	}


}

