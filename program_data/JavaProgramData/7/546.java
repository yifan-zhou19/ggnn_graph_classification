package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int la;
		int lb;
		int f = 0;

		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		String tem = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();


		la = a.length();
		lb = b.length();

		for (i = 0;i < la;i++)
		{
			k = 0;
			for (j = i;j < lb + i;j++)
			{

				tem = tangible.StringFunctions.changeCharacter(tem, k++, a.charAt(j));
				if (j == lb + i - 1)
				{
					tem = tem.substring(0, k);
				}
			}
			if (!strcmp(tem,b) && f == 0)
			{
				f++;
				System.out.printf("%s",c);
				i += lb - 1;
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
	}
}

