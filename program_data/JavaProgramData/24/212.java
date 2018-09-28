package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		char[][] a = new char[60][30];
		{
			for (i = 0;i < 60;i++)
			{
			for (j = 0;j < 30;j++)
			{
			a[i][j] = '\0';
			}
			}
		}
		j = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[j] = tempVar.charAt(0);
			}
			j++;
		} while (System.in.read() != '\n');
		for (i = 0,k = 1;k < j;k++)
		{
			if (String.valueOf(a[i]).length() < String.valueOf(a[k]).length())
			{
				i = k;
			}
		}
		System.out.printf("%s\n",a[i]);
		for (m = 0,k = 1;k < j;k++)
		{
			if (String.valueOf(a[m]).length() > String.valueOf(a[k]).length())
			{
				m = k;
			}
		}
		System.out.println(a[m]);
	}
}

