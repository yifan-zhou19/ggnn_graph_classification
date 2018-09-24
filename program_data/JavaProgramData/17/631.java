package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int n1;
		int n2;
		int[] k = new int[100];
		char[][] a = new char[100][100];
		String b = new String(new char[100]);
		i = 0;
		while (gets(a[i]))
		{
			k[i] = String.valueOf(a[i]).length(); //??????????
			if (k[i] == 0)
			{
				break;
			}
			i++;
		} //????????????????
		t = i;
		for (i = 0;i < t;i++)
		{
			n1 = 0;
			n2 = 0;
			for (j = 0;j < k[i];j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, ' ');
			} //???b??????� �
			for (j = 0;j < k[i];j++) //????
			{
				if (n1 < 0)
				{
					n1 = 0; //?n1???0
				}
				if (a[i][j] == '(')
				{
					n1++;
				} //???????n1?1
				if (a[i][j] == ')')
				{
					if (n1 == 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '?');
					}
					 n1--;
				} //???????n1?1????1?n1?0??b?j?=�?�
			}
			for (j = k[i] - 1;j >= 0;j--) //????
			{
				if (n2 < 0)
				{
					n2 = 0; //?n2???0
				}
				if (a[i][j] == ')')
				{
					n2++;
				} //???????n2?1
				if (a[i][j] == '(')
				{
					if (n2 == 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '$');
					}
					n2--;
				} //???????n2?1????1?n2?0??b?j?=�$�
			}
			for (j = 0;j < k[i];j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
			for (j = 0;j < k[i];j++)
			{
				System.out.print(b.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}




}

