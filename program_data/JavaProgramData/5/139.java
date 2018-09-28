package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char mid;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int stop;
		int lengtha;
		int lengthb;
		int dif;
		int error;
		double r;
		double odd;
		dif = 0;
		error = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			odd = Double.parseDouble(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		lengtha = a.length();
		lengthb = b.length();
		for (i = 0;i < lengtha;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				dif++;
			}
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
			{
				error++;
			}
		}
		r = 1.0 * dif / lengtha;
	//	printf("error=%d\n",error);
		if (error > 0 || lengtha != lengthb)
		{
			System.out.print("error");
		}
		else
		{
			if (r > odd)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			stop = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

