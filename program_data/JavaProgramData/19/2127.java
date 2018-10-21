package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String d = new String(new char[100]);
		char[][] b = new char[100][50];
		int i;
		int j = 0;
		int k = 0;
		int n;
		int m;
		int l;
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) != ' ')
			{
				b[j][k] = s.charAt(i);
				k++;
			}
			else
			{
				b[j][k] = '\0';
				j++;
				k = 0;
			}
		}
		b[j][k] = '\0';
		for (m = 0;m < j + 1;m++)
		{
			l = strcmp(a,b[m]);
			if (l == 0)
			{
				b[m] = d;
			}
			if (m == 0)
			{
				System.out.printf("%s",b[m]);
			}
			else
			{
				System.out.printf(" %s",b[m]);
			}
		}
		return 0;
	}
}

