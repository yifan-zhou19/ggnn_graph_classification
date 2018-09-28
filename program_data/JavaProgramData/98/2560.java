package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[10000]);
	public static String tmp = new String(new char[40]);
	public static char cn;
	public static int n;
	public static int i;
	public static int j;
	public static int l = 0;
	public static int tmpl = 0;

	public static void Main(String[] args)
	{

		cn = new Scanner(System.in).nextLine();
		n = Integer.parseInt(cn);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 40;j++)
			{
				if (a.charAt(j + l) != ' ')
				{
					tmp = tangible.StringFunctions.changeCharacter(tmp, j, a.charAt(j + l));
				}
				else
				{
					tmp = tangible.StringFunctions.changeCharacter(tmp, j, '\0');
					j = 40;
				}
			}
			l += tmp.length() + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			l:
			if (tmpl == 0)
			{
				System.out.printf("%s",tmp);
				tmpl += tmp.length() + 1;
			}
			else if ((tmp.length() + tmpl) <= 80)
			{
				System.out.printf(" %s",tmp);
				  tmpl += tmp.length() + 1;
			}
			else if ((tmp.length() + tmpl) > 80)
			{
				System.out.print("\n");
				tmpl = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto l;
			}
			//printf ("%d",tmpl);
		}
	}
}

