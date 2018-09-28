package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[110]);
		int[][] a = new int[50][2];
		char s;
		int L;
		int i;
		int j;
		int k = 0;
		int p = 0;
		int t;
		int q;
		int m = 0;
		cin.get(str,110,'\n'); //??
		L = str.length(); //???????
		s = str.charAt(0);
	while (m != L)
	{
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == s)
			{
				for (j = i + 1;j < L;j++)
				{
					if (str.charAt(j) == 'a')
					{
						continue;
					}
					else if (str.charAt(j) == s)
					{
						break;
					}
					else
					{
						a[p][0] = i;
						a[p][1] = j;
						str = tangible.StringFunctions.changeCharacter(str, i, 'a');
						str = tangible.StringFunctions.changeCharacter(str, j, 'a');
						p++;
						break;
					}
				}
			}
		} //????
	m = 0;
	for (q = 0;str.charAt(q) != '\0';q++)
	{
			if (str.charAt(q) == 'a')
			{
				m++;
			}
	}
	}


			for (i = 0;i < L / 2 - 1;i++)
			{
				for (j = i + 1;j < L / 2;j++) //??
				{
				 if (a[i][1] > a[j][1])
				 {
					 t = a[i][1];
					 a[i][1] = a[j][1];
					 a[j][1] = t;
					 t = a[i][0];
					 a[i][0] = a[j][0];
					 a[j][0] = t;
				 }
				}
			}
			for (i = 0;i < L / 2;i++)
			{
				System.out.print(a[i][0]);
				System.out.print(" ");
				System.out.print(a[i][1]);
				System.out.print("\n");
			}
			return 0;
	}

}

