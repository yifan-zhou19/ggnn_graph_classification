package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String su = new String(new char[100]);
		String zu = new String(new char[100]);
		String tu = new String(new char[100]);
		su = new Scanner(System.in).nextLine();
		zu = new Scanner(System.in).nextLine();
		tu = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < su.length();i++)
		{
			for (k = 0,j = i;su.charAt(j) == zu.charAt(k);j++,k++)
			{
		if (k == zu.length())
		{
		break;
		}
			}
		if (k == zu.length())
		{
		break;
		}
		}
		//printf("%d%d",i,j);
		if (j != i - 1)
		{
		for (t = 0;t < i;t++)
		{
		System.out.printf("%c",su.charAt(t));
		}
		System.out.printf("%s",tu);
		for (t = j;t < su.length();t++)
		{
			System.out.printf("%c",su.charAt(t));
		}
		}
		else
		{
			System.out.printf("%s",su);
		}
		return 0;
	}

}
