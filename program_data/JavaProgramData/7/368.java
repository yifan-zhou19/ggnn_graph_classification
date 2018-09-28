package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String X = new String(new char[300]);
		String Y = new String(new char[100]);
		String Z = new String(new char[100]);
		X = new Scanner(System.in).nextLine();
		Y = new Scanner(System.in).nextLine();
		Z = new Scanner(System.in).nextLine();
		int l;
		int l1;
		int l2;
		l = X.length();
		l1 = Y.length();
		l2 = Z.length();
		int i;
		int A = -1;
		for (i = 0;i < l;i++)
		{
			if (X.charAt(i) == Y.charAt(0) && X.charAt(i + 1) == Y.charAt(1) && X.charAt(i + l1 - 1) == Y.charAt(l1 - 1) && X.charAt(i + l1 - 2) == Y.charAt(l1 - 2))
			{
				A = i;
				break;
			}
		}
		if (A != -1)
		{
		for (i = 0;i < A;i++)
		{
			System.out.printf("%c",X.charAt(i));
		}
		for (i = 0;i < l2;i++)
		{
			System.out.printf("%c",Z.charAt(i));
		}
		for (i = A + l1;i < l;i++)
		{
			System.out.printf("%c",X.charAt(i));
		}
		}
	else
	{
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",X.charAt(i));
		}
	}
		return 0;
	}


}
