package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float x;
		float fenzi = 0F;
		int lena;
		int lenb;
		int i;
		int j = 0;
		String a = new String(new char[505]);
		String b = new String(new char[505]);
		char ch;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			ch = tempVar2.charAt(0);
		}
		a = new Scanner(System.in).nextLine();

		b = new Scanner(System.in).nextLine();

		lena = a.length();
		lenb = b.length();
		if (lena != lenb)
		{
		System.out.print("error\n");
		}
		else
		{
			 for (i = 0;i < lena;i++)
			 {
				  if ((a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'G' || a.charAt(i) == 'C') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'G' || b.charAt(i) == 'C'))
				  {
					if (a.charAt(i) == b.charAt(i))
					{
						fenzi++;
					}
				  }
				  else
				  {
					  j = 1;
					  System.out.print("error\n");
					  break;
				  }
			 }
			 if (j == 0 && fenzi >= x * lena)
			 {
				 System.out.print("yes\n");
			 }
			 else if (j == 0)
			 {
				 System.out.print("no\n");
			 }
		}

	}
}

