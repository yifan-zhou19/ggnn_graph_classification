package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String a = new String(new char[50]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 50 && a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
			j = i;
			}
		}
		for (i = j + 1;i < a.length();i++)
		{
			if (a.charAt(i) == a.charAt(0))
			{
			k = i;
			break;
			}
		}
	   System.out.printf("%d",k - j - 1);
	   return 0;
	}
}
