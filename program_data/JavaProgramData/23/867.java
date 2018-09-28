package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[50][20];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[0] = tempVar.charAt(0);
		}
		for (i = 1,n = 0;System.in.read() != '\n';i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			n++;
		}
		for (j = n;j >= 0;j--)
		{
			System.out.printf("%s",s[j]);
			if (j > 0)
			{
				System.out.print(" ");
			}
		}
	}
}

