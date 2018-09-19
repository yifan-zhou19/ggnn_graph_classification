package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void sc(char * p[],char * q[]);
		String[] p = new String[100];
		String[] q = new String[100];
		int i;
		for (i = 0;i < 100;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(10);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q[i] = (String)malloc(5);
		}
		sc(p, q);
	}
	public static void sc(String[] p, String[] q)
	{
		int n;
		int m;
		int j;
		int max;
		int x;
		int i;
		for (i = 0;scanf("%s %s",p[i],q[i]) != EOF;i++)
		{
			n = p[i].length();
			m = q[i].length();
			for (j = 1,max = p[i];j < n;j++)
			{
				if (*(p[i] + j) > max)
				{
					max = (p[i] + j);
					x = j;
				}
			}
			for (j = n - x - 1;j >= 1;j--)
			{
				*(p[i] + x + j + m) = *(p[i] + x + j);
			}
			for (j = 0;j < m;j++)
			{
				*(p[i] + x + j + 1) = *(q[i] + j);
			}
			for (j = 0;j < m + n;j++)
			{
				System.out.printf("%c",*(p[i] + j));
				if (j == n + m - 1)
				{
					System.out.print("\n");
				}
			}
		}
	}
}
