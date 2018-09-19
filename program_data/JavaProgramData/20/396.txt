package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		while (scanf("%s %s",str,substr) != EOF)
		{
				 int i;
				 int n;
				 int max = 0;
				 int num;
			n = str.length();
					  String p = str;
			for (i = 0;i < n;i++)
			{
				if (*(p.Substring(i)) > max)
				{
					max = (p.Substring(i));
					num = i;
				}
			}
			for (i = n + 2;i > num + 3;i--)
			{
				*(p.Substring(i)) = str.charAt(i - 3);
			}
					  *(p.Substring(n) + 3) = '\0';
			for (i = num + 3;i > num;i--)
			{
				*(p.Substring(i)) = substr.charAt(i - num - 1);
			}
			for (i = 0;i < n + 3;i++)
			{
				System.out.printf("%c",*(p.Substring(i)));
			}
			System.out.print("\n");
		}
	}



}
