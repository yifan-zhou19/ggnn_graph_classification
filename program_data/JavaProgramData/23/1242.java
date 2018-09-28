package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int i;
		int l = a.length();
		int[] pos = new int[100];
		int j = 0;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ')
			{
				pos[j] = i;
				j++;
			}
		}
		pos[j] = l + 1;
		if (j - 1 < 0)
		{
			System.out.printf("%s\n",a);
		}
		else
		{
		int m;
		int n;
		for (n = pos[j - 1] + 1;n < l;n++)
		{
		  System.out.printf("%c",a.charAt(n));
		}
		for (m = j - 2;m >= 0;m--)
		{
			for (n = pos[m];n < pos[m + 1];n++)
			{
				System.out.printf("%c",a.charAt(n));
			}
		}
			System.out.print(" ");
		for (n = 0;n < pos[0];n++)
		{
				System.out.printf("%c",a.charAt(n));
		}
		System.out.print("\n");
		}
	}

}
