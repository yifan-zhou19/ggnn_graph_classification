package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[3]);
		zfc = new Scanner(System.in).nextLine();
		int n = Integer.parseInt(zfc);
		int i;
		for (i = 0;i < n;i++)
		{
			String dna = new String(new char[256]);
			String dna2 = new String(new char[256]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				dna = tempVar.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p1 = dna;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p2 = dna2;
			for (; * p1 != '\0';p1++,p2++)
			{
				if (*p1 == 'A')
				{
					*p2 = 'T';
				}
				if (*p1 == 'T')
				{
					*p2 = 'A';
				}
				if (*p1 == 'C')
				{
					*p2 = 'G';
				}
				if (*p1 == 'G')
				{
					*p2 = 'C';
				}
			}
			*p2 = '\0';
			p2 = dna2;
			System.out.printf("%s\n",p2);
		}
		return 0;
	}
}

