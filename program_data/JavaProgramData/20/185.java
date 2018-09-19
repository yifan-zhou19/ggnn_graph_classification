package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void insert(char s[]);
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int i;
		int n;
		a[1] = new Scanner(System.in).nextLine();

		for (i = 2,n = 0;a[i - 1][0] != '\0';i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			n++;
		}
		//printf("%d",n);
		for (i = 1;i <= n;i++)
		{
		insert(a[i]);
		}
	}
		public static void insert(String s)
		{
			int n;
			int i;
			int j;
			int max = 0;
			int m;
			String a = new String(new char[3]);
			n = s.length();
			for (i = 1,j = n - 3;i <= 3;i++,j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, s[j]);
			}
			for (i = 0;i < n - 4;i++)
			{
				max = max > s[i] != null?max:s[i];
			}
			//printf("%c",max);
			for (i = 0;i < n - 4;i++)
			{
				if (s[i].equals(max))
				{
				m = i;
				break;
				}
			}

				//printf("%d",m);
			for (i = 0;i <= m;i++)
			{
				System.out.printf("%c",s[i]);
			}
			for (i = 1;i <= 3;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			for (i = m + 1;i < n - 4;i++)
			{
				System.out.printf("%c",s[i]);
			}
			System.out.print("\n");
		}






















}

