package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j;
		int k = 0;
		char[][] s =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String str = new String(new char[1000]);
		String[] ps = new String[100];
		String pa;
		String pb;

		for (i = 0;i < 100;i++)
		{
		ps[i] = s[i];
		}
		pa = a;
		pb = b;
		str = new Scanner(System.in).nextLine();
		pa = new Scanner(System.in).nextLine();
		pb = new Scanner(System.in).nextLine();
		i = 0;
		do
		{
			for (j = 0; * (str.Substring(k)) != ' ' && *(str.Substring(k)) != '\0';j++)
			{
				*(ps[i] + j) = *(str.Substring(k));
			k++;
			}
			*(ps[i] + j) = '\0';
			i++;
			k++;
		}while (*(str.Substring(k)) != '\0');
		*(ps[i - 1] + j) = '\0';
		m = i;
		for (i = 0;i < m;i++)
		{
			  if (!strcmp(ps[i],pa))
			  {
				  ps[i] = pb;
			  }
		}

	for (i = 0;i < m;i++)
	{
			if (i == 0)
			{
			System.out.printf("%s",ps[i]);
			}
	else
	{
		System.out.printf(" %s",ps[i]);
	}
	}
		System.out.print("\n");
		return 0;
	}
}
