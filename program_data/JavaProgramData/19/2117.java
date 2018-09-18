package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int tag = 1;
		int flag = 1;
		int e = 0;
		String q = new String(new char[101]);
		char[][] tmp = new char[50][101];
		String p = new String(new char[101]);
		String t = new String(new char[101]);
		q = new Scanner(System.in).nextLine();
		p = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		for (i = 0;i < 50;i++)
		{
			k = 0;
			flag = 1;
			for (j = e;j < 101;j++)
			{
				if (q.charAt(j) != ' ' && q.charAt(j) != ',' && q.charAt(j) != '\0')
				{
					tmp[i][k] = q.charAt(j);
					k++;
				}
				else if (q.charAt(j) == ' ')
				{
					tmp[i][k] = '\0';
					e = j + 1;
					break;
				}
				else if (q.charAt(j) == ',')
				{
					tmp[i][k] = '\0';
					e = j + 2;
					break;
				}
				else if (q.charAt(j) == '\0')
				{
					tmp[i][k] = '\0';
					tag = 0;
					break;
				}
			}
			for (j = 0;j < 101;j++)
			{
				if (tmp[i][j] != p.charAt(j) && p.charAt(j) != '\0')
				{
					flag = 0;
					break;
				}
				else if (tmp[i][j] == p.charAt(j) && p.charAt(j) != '\0')
				{
					continue;
				}
				else if (p.charAt(j) == '\0')
				{
					break;
				}
			}
			if (tag == 1 && flag == 0 && i > 0)
			{
				System.out.printf(" %s",tmp[i]);
			}
			else if (tag == 1 && flag == 1 && i > 0)
			{
				System.out.printf(" %s",t);
			}
			else if (tag == 0 && flag == 0 && i > 0)
			{
				System.out.printf(" %s",tmp[i]);
				break;
			}
			else if (tag == 0 && flag == 1 && i > 0)
			{
				System.out.printf(" %s",t);
				break;
			}
			else if (tag == 1 && flag == 0 && i == 0)
			{
				System.out.printf("%s",tmp[i]);
			}
			else if (tag == 1 && flag == 1 && i == 0)
			{
				System.out.printf("%s",t);
			}
			else if (tag == 0 && flag == 0 && i == 0)
			{
				System.out.printf("%s",tmp[i]);
				break;
			}
			else if (tag == 0 && flag == 1 && i == 0)
			{
				System.out.printf("%s",t);
				break;
			}
		}
	}
}
