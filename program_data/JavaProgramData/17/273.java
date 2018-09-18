package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void function(char a[200]);
		String a = new String(new char[200]);
		while (scanf("%s",a) != EOF)
		{
			function(a);
			System.out.printf("%s\n",a);
		}
		return 0;
	}
	public static void function(String a)
	{
			int[] p = new int[200];
			int[] q = new int[200];
			int pa = 0;
			int qa = 0;
			int t1;
			int t2;
			int j;
			int i;
			int l;
			pa = 0;
			qa = 0;
			System.out.printf("%s\n",a);
			l = a.length() - 1;
			for (i = 0;i <= l;i++)
			{
				if (a[i].equals('('))
				{
					p[pa] = i;
					pa++;
				}
				else if (a[i].equals(')'))
				{
					q[qa] = i;
					qa++;
				}
				else
				{
					a[i] = ' ';
				}
			}
			for (i = pa - 1;i >= 0;i--)
			{
				for (j = 0;j < qa;j++)
				{
					 t1 = p[i];
					 t2 = q[j];
					if (p[i] < q[j] && !a[t2].equals(' '))
					{
						a[t1] = ' ';
						a[t2] = ' ';
						break;
					}
				}
				if (j == qa)
				{
					t1 = p[i];
					a[t1] = '$';
				}
			}
			for (j = 0;j < qa;j++)
			{
				t2 = q[j];
				if (a[t2].equals(')'))
				{
					a[t2] = '?';
				}
			}
	}
}
