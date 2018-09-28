package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int i = 0;
		int j;

				while (true)
				{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			if ((a[i][0] >= 65) && (a[i][0] <= 122))
			{
				;
			}
			else
			{
				break;
			}
			i++;

				}
		i--;
		for (j = i;j >= 1;j--)
		{
		System.out.printf("%s ",a[j]);
		}
		System.out.printf("%s",a[0]);

		return 0;
	}

}

