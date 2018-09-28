package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[5000]);
		String[] ss = new String[50];

		int i;
		int n = 0;
		int max = 0;
		int min = 0;
		s = new Scanner(System.in).nextLine();
	ss[n++] = s;
	for (i = 0;s.charAt(i);i++)
	{
	if (s.charAt(i) == ' ')
	{
	s = s.substring(0, i);
	ss[n++] = s.Substring(i) + 1;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (String.valueOf(ss[i]).length() < String.valueOf(ss[min]).length())
	{
	min = i;
	}
	if (String.valueOf(ss[i]).length() > String.valueOf(ss[max]).length())
	{
	max = i;
	}
	}
	System.out.println(ss[max]);
	System.out.println(ss[min]);
	return 0;
	}


}
