package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[100]);
		String z = new String(new char[100]);
		String t = new String(new char[100]);
		m = new Scanner(System.in).nextLine();
		z = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		char[][] fz = new char[100][100]; //use this to seperate the words
		int len1 = m.length();
		int i; //use "num" to calculate the number of the words
		int k = 0;
		int j = 0;
		int num = 1;
		for (i = 0;i < len1;i++)
		{
			if (m.charAt(i) != 32)
			{
				fz[k][j] = m.charAt(i);
				j++;
			}
			else
			{
				num++;
				k++;
				j = 0;
			}
		}
		for (k = 0;k < num;k++)
		{
			if (k != num - 1)
			{
				int result = strcmp(fz[k],z);
				if (result == 0)
				{
					fz[k] = t;
					System.out.printf("%s ",fz[k]);
				}
				else
				{
					System.out.printf("%s ",fz[k]);
				}
			}
			if (k == num - 1)
			{
				int result = strcmp(fz[k],z);
				if (result == 0)
				{
					fz[k] = t;
					System.out.printf("%s",fz[k]);
				}
				else
				{
					System.out.printf("%s",fz[k]);
				}
			}

		}
		return 0;
	}







}
