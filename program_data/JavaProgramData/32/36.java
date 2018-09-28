package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void minus(char x[],char y[]);
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = tempVar3.charAt(0);
				}
		}
			System.out.print("\n");
		for (i = 1;i <= n;i++)
		{

		minus(a[i], b[i]);
		}
	}
		public static void minus(String x, String y)
		{
			int i;
			int j;
			int c;
			int d;
			String min = new String(new char[1000]);
			c = x.length();
			d = y.length();
			for (i = c - 1,j = d - 1;i >= c - d + 1;i--,j--)
			{
				if (x[i].compareTo(y[j]) >= 0)
				{
					min = tangible.StringFunctions.changeCharacter(min, i, x[i] - y[j].Substring(48));
				}
				else if (x[i].compareTo(y[j]) < 0)
				{
					min = tangible.StringFunctions.changeCharacter(min, i, x[i].Substring(10) - y[j].Substring(48));
					x[i - 1] = x[i - 1] - 1;
				}
			}
			if (x[c - d].compareTo(y[0]) >= 0)
			{
				min = tangible.StringFunctions.changeCharacter(min, c - d, x[c - d] - y[0].Substring(48));
				for (i = 0;i <= c - d - 1;i++)
				{
					System.out.printf("%c",x[i]);
				}
				for (i = c - d;i <= c - 1;i++)
				{
					if (min.charAt(i) == 0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.printf("%c",min.charAt(i));
					}
				}
			}
			else
			{
				min = tangible.StringFunctions.changeCharacter(min, c - d, x[c - d].Substring(10) - y[0].Substring(48));
				x[c - d - 1] = x[c - d - 1] - 1;
				for (i = 0;i <= c - d - 1;i++)
				{
					System.out.printf("%c",x[i]);
				}
				for (i = c - d;i <= c - 1;i++)
				{
					if (min.charAt(i) == 0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.printf("%c",min.charAt(i));
					}
				}
			}
			System.out.print("\n");
		}




}

