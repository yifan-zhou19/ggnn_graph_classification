package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] num = new int[101];
		String a = new String(new char[101]);
		char B;
		char G;
		a = new Scanner(System.in).nextLine();
		n = a.length(); //n???
		B = a.charAt(0); //??????????
		G = a.charAt(n - 1);
		for (i = 0;i <= n - 1;i++) //??????
		{
			num[i] = i;
		}
		for (i = 1;i <= (n / 2);i++) //?i?
		{
			for (j = 0;j <= ((n - 1) - 2 * (i - 1) - 1);j++) //???i??a?????
			{
				if (a.charAt(j) == B && a.charAt(j + 1) == G)
				{
					System.out.printf("%d %d",num[j],num[j + 1]);
					System.out.print("\n");
					for (k = j + 2;k <= ((n - 1) - 2 * (i - 1));k++)
					{
						a = tangible.StringFunctions.changeCharacter(a, k - 2, a.charAt(k));
						num[k - 2] = num[k];
					}
					j = -1;
				}
			}
		}
	}


}

