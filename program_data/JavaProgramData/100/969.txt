package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String z = new String(new char[300]);
	z = new Scanner(System.in).nextLine();
	String zm = new String(new char[30]);
	int[] num = new int[26];
	int len;
	len = z.length();
	int i;
	int j = 0;
	for (i = 0;i < len;i++)
	{
	if (z.charAt(i) >= 'a' && z.charAt(i) <= 'z')
	{
		num[z.charAt(i) - 'a']++;
	}
	}
	for (i = 0;i < 26;i++)
	{
	if (num[i] != 0)
	{
		System.out.printf("%c=%d\n",i + 'a',num[i]);
		j++;
	}
	}
	if (j == 0)
	{
		System.out.print("No");
	}
	return 0;
	}

}
