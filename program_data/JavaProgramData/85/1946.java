package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[100][21];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			if (zfc[i][0] == 95 || (zfc[i][0] >= 65 && zfc[i][0] <= 90) || (zfc[i][0] >= 97 && zfc[i][0] <= 122))
			{
				s = 0;
				for (k = 0;k < String.valueOf(zfc[i]).length();k++)
				{
					if ((zfc[i][k] >= 48 && zfc[i][k] <= 57) || (zfc[i][k] == 95) || (zfc[i][k] >= 65 && zfc[i][k] <= 90) || (zfc[i][k] >= 97 && zfc[i][k] <= 122))
					{
					s++;
					}

				}
				if (s == String.valueOf(zfc[i]).length())
				{
						System.out.print("yes\n");
				}
					else
					{
						System.out.print("no\n");
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

