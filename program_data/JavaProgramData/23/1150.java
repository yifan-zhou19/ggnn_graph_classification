package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[200]);
		int i;
		int n;
		int j;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		String p = s;
			for (i = n - 1;i >= 0;i--)
			{
				*(p.Substring(i) + 1) = *(p.Substring(i));
			}
			*(p.Substring(0)) = *(p.Substring(n) + 1) = ' '; //why????
			for (i = n;i >= 0;i--)
			{
				if (*(p.Substring(i)) == ' ')
				{
					for (j = i + 1; * (p.Substring(j)) != ' ';j++)
					{
						System.out.printf("%c",*(p.Substring(j)));
					}
					if (i != 0)
					{
						System.out.print(" ");
					}
				}
			}
	}




}
