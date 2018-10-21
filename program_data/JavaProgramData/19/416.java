package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		char[][] c = new char[100][100];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String[] p = new String[100];
		int i;
		int j;
		int k;
		int m;
		int n;
		int t = 1;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;k <= n - 1;i++,k++)
		{
			for (j = 0;k <= n - 1;j++,k++)
			{
				if (s.charAt(k) != 32)
				{
				c[i][j] = s.charAt(k);
				}
				else
				{
					c[i][j] = '\0';
					t++; //t??????//
					break;
				}
			}
		}
		c[t - 1][j + 1] = '\0';
		//printf("%d",c[t-1][j+1]);
		//printf("%d",t);
		for (i = 0;i < t;i++)
		{
			p[i] = c[i];
		}
		//printf("%s",p[1]);
		for (i = 0;i < t;i++)
		{
		if (strcmp(p[i],a) == 0)
		{

		p[i] = b;
		}
		}
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%s ",p[i]);
		}
		System.out.printf("%s",p[t - 1]);
	}


















}

