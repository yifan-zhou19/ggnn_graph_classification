package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i = 0;
	int j = 0;
	int l = 0;
	int o = 0;
	int k = 0;
	int p;
	String m = new String(new char[10000]);
	char[][] n = new char[100][100];
	m = new Scanner(System.in).nextLine();
	for (;m.charAt(i) != '\0';i++)
	{
					 if (m.charAt(i) == ' ')
					 {
							 k = 0;
							 j++;
					 }
					 else
					 {
						  n[j][k] = m.charAt(i);
					 k++;
					 }
	}
	for (i = 1;i <= j;i++)
	{
		if (String.valueOf(n[i]).length() > String.valueOf(n[o]).length())
		{
			o = i;
		}
		if (String.valueOf(n[i]).length() < String.valueOf(n[l]).length())
		{
			l = i;
		}
	}
	System.out.print(n[o]);
	System.out.print("\n");
	System.out.print(n[l]);
	System.out.print("\n");

	return 0;
	}

}
