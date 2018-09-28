package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[100][50];
		char[][] gaiguo = new char[100][50];
		int n;
		int[] l = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			l[i] = String.valueOf(zfc[i]).length();
			if (zfc[i][l[i] - 3] == 'i' && zfc[i][l[i] - 2] == 'n' && zfc[i][l[i] - 1] == 'g')
			{
				gaiguo[i] = String.valueOf(zfc[i]).substring(0, l[i] - 3);

			}
			else if (zfc[i][l[i] - 2] == 'e' && zfc[i][l[i] - 1] == 'r')
			{
				gaiguo[i] = String.valueOf(zfc[i]).substring(0, l[i] - 2);

			}
			else if (zfc[i][l[i] - 2] == 'l' && zfc[i][l[i] - 1] == 'y')
			{
				gaiguo[i] = String.valueOf(zfc[i]).substring(0, l[i] - 2);

			}
		}
		for (int j = 0;j < n;j++)
		{
			System.out.printf("%s\n",gaiguo[j]);
		}
		return 0;
	}
}

