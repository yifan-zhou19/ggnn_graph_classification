package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int max = 0;
		int min = 50;
		int[] sp = new int[100];
		int i;
		int j;
		int k;
		int[] lg = new int[100];
		int count = 0;
		int len;
		s = new Scanner(System.in).nextLine();
	len = s.length();
	for (i = 0;i < len;i++)
	{
		if (*(s.Substring(i)) == ' ')
		{
		++count;
		sp[count] = i;
		}
	}
	sp[count + 1] = len;
	sp[0] = -1;
	lg[0] = 0;
	for (i = 1;i <= count + 1;++i)
	{
		lg[i] = sp[i] - sp[i - 1] - 1;
	}
	for (i = 1;i <= count + 1;++i)
	{
		if (max < lg[i])
		{
			max = lg[i];
			k = i;
		}
		if (min > lg[i])
		{
			min = lg[i];
			j = i;
		}
	}
	for (i = sp[k - 1] + 1;i < sp[k];++i)
	{
		System.out.printf("%c",*(s.Substring(i)));
	}
		System.out.print("\n");
	for (i = sp[j - 1] + 1;i < sp[j];++i)
	{
	System.out.printf("%c",*(s.Substring(i)));
	}
			return 0;
	}
}
