package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int lena;
		int lenb;
		double r;
		double same = 0;
		double j = 0;
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		lena = a.length(); //????
		lenb = b.length();
		if (lena != lenb) //????
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0 ; i <= lena - 1 ; i++) //???
			{
				if (a.charAt(i) == b.charAt(i)) //????
				{
					same++;
				}
				else if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
				{
					System.out.print("error");
					j = 1;
					break;
				}
				else if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
				{
					System.out.print("error");
					j = 1;
					break;
				}
			}
		}
		if (j == 0 && lena == lenb)
		{
			if ((same / lena) > r)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}

		}
		 return 0;

	}

}

