package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[5000]);
		char[][] t = new char[50][50];
		int[] a = new int[50];
		int[] b = new int[50];
		String s;
		String p;
		s = str;
		s = new Scanner(System.in).nextLine();
		s += " ";
		int count = 0;
		while (s != null)
		{
			p = tangible.StringFunctions.strChr(s,' ');
			p = '\0';
			t[count] = s;
			a[count] = String.valueOf(t[count]).length();
			b[count] = a[count];
			count++;
			s = p.Substring(1);
		}
		int max = 0;
		int min = 0;
		for (int i = 0;i < count;i++)
		{
			if (a[i] > a[max])
			{
				max = i;
			}
		}
		for (int j = 0;j < count;j++)
		{
			if (b[j] < b[min])
			{
				min = j;
			}
		}
		System.out.printf("%s\n%s",t[max],t[min]);
		return 0;
	}
}

