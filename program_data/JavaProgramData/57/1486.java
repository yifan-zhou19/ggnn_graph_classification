package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		char[][] t = new char[100][100];
		int n;
		int i;
		int j;
		int[] l = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i++)
		{
			s = new Scanner(System.in).nextLine();
			l[i] = s.length();
		if (s.charAt(l[i] - 1) == 'r')
		{
			for (j = 0;j < l[i] - 2;j++)
			{
				t[i][j] = s.charAt(j);
			}
			l[i] = l[i] - 2;
		}
		else if (s.charAt(l[i] - 1) == 'y')
		{
			for (j = 0;j < l[i] - 2;j++)
			{
				t[i][j] = s.charAt(j);
			}
			l[i] = l[i] - 2;
		}
		else if (s.charAt(l[i] - 1) == 'g')
		{
			for (j = 0;j < l[i] - 3;j++)
			{
				t[i][j] = s.charAt(j);
			}
			l[i] = l[i] - 3;
		}
		}
		for (i = 0;i < n + 1;i++)
		{
			for (j = 0;j < l[i];j++)
			{
			System.out.printf("%c",t[i][j]);
			}
		if (i != 0)
		{
			System.out.print("\n");
		}
		}
	}

}

