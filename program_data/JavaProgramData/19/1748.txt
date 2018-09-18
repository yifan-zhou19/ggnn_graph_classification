package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	String c = new String(new char[100]);
	int i;
	int j;
	int k;
	int lena;
	int lenb;
	int lenc;
	int flag;
	for (i = 0;i < 100;i++)
	{
	a = a.substring(0, i);
	}
	a = new Scanner(System.in).nextLine(); //????????
	b = new Scanner(System.in).nextLine();
	c = new Scanner(System.in).nextLine();
	lena = a.length(); //?????????
	lenb = b.length();
	lenc = c.length();
	for (i = 0;i <= lena - lenb;i++) //??????a???b?????
	{
		if (i == 0 || a.charAt(i - 1) == ' ')
		{
			flag = 1;
			for (j = 0;j < lenb;j++)
			{
				if (a.charAt(i + j) != b.charAt(j))
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				if (lenb >= lenc) //????????
				{
					for (k = i,j = 0;k < i + lenc,j < lenc;k++,j++) //?????
					{
							a = tangible.StringFunctions.changeCharacter(a, k, c.charAt(j));
					}
					for (k = i + lenc;k < lena;k++) //?????????
					{
							a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + lenb - 1));
					}
					i += lenc - 1;
					lena -= lenb - lenc;
				}
				if (lenb < lenc) //????????
				{
					for (k = lena - 1 + lenc - lenb;k >= i + lenc;k--) //??????????
					{
							a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k - lenc + lenb));
					}
					for (k = i,j = 0;k < i + lenc,j < lenc;k++,j++) //??????
					{
							a = tangible.StringFunctions.changeCharacter(a, k, c.charAt(j));
					}
					i += lenc - 1;
					lena += lenc - lenb; //??????
				}
			}
		}
	}
	System.out.print(a);
	System.out.print("\n");
	return 0;
	}

}

