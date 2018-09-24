package <missing>;

public class GlobalMembers
{
	public static int max(String a, int j)
	{
		int i;
		int k;
		k = a.length();
		for (i = 0;i < k;i++)
		{
			if (a[i].compareTo(a[j]) > 0)
			{
				return (0);
			}
		}
		return (1);
	}
	public static void cha(String a, String b)
	{
		int i;
		int k;
		int j;
		k = a.length();
		for (i = 0;i < k;i++)
		{
			if (max(a, i) == 1)
			{
				for (j = 0;j < i + 1;j++)
				{
					System.out.printf("%c",a[j]);
				}
				for (j = 0;j < 3;j++)
				{
					System.out.printf("%c",b[j]);
				}
				for (j = i + 1;j < k;j++)
				{
					System.out.printf("%c",a[j]);
				}
					System.out.print("\n");
					break;
			}
		}
	}
	public static void Main()
	{
		char[][] str = new char[100][11];
		char[][] substr = new char[100][4];
		char d;
		int n = 0;
		int i;
		do
		{
			if (n != 0)
			{
				for (i = 1;;i++)
				{
					if ((d = System.in.read()) != ' ')
					{
					str[n][i] = d;
					}
					else
					{
						str[n][i] = '\0';
						break;
					}
				}
			}
			else
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					str[n] = tempVar.charAt(0);
				}
			}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					substr[n] = tempVar2.charAt(0);
				}
				n++;
				d = System.in.read();
				str[n][0] = System.in.read();
		} while (str[n][0] != EOF);
		for (i = 0;i < n;i++)
		{
			cha(str[i], substr[i]);
		}
	}

}

