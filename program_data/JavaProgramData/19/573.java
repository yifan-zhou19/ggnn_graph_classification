package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		final String a = "";
		final String b = "";
		final String c = "";
		final String d = "";
		String p;
		String q;
		c = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		p = c;
		q = d;
		for (i = 0;;)
		{
			for (j = 0; * (p.Substring(i)) != ' ' && *(p.Substring(i)) != '\0';i++, j++)
			{
				*(q.Substring(j)) = *(p.Substring(i));
			}
			*(q.Substring(j)) = '\0';
			if (strcmp(d,a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				for (k = 0;k < j;k++)
				{
					System.out.printf("%c",*(q.Substring(k)));
				}
			}
			if (*(p.Substring(i)) != '\0')
			{
				System.out.print(" ");
			}
			else
			{
				break;
			}
			i++;
		}
	}



}
