package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String dna = new String(new char[256]);
		dna = new Scanner(System.in).nextLine();
		n = Integer.parseInt(dna);
		for (i = 1;i <= n;i++)
		{
			dna = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p = dna;
			String q;
			final String cdna = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * c = cdna;
			q = p;
			for (p = q; * p != '\0';p++)
			{
				if (*p == 'A')
				{
					*c = 'T';
					c++;
				}
				else if (*p == 'T')
				{
					*c = 'A';
					c++;
				}
				else if (*p == 'G')
				{
					*c = 'C';
					c++;
				}
				else if (*p == 'C')
				{
					*c = 'G';
					c++;
				}
			}
			System.out.printf("%s\n",cdna);
		}
		return 0;
	}
}
