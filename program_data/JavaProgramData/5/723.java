package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int k;
	int a1;
	int a2;
	int w;
	String DNA1 = new String(new char[501]);
	String DNA2 = new String(new char[501]);
	double n;
	double q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		DNA1 = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		DNA2 = tempVar3.charAt(0);
	}
	a1 = DNA1.length();
	a2 = DNA2.length();
	k = 0;
	w = 1;
	if (a1 == a2)
	{
	for (i = 0;i < a1;i++)
	{
		if ((DNA1.charAt(i) != 'A' && DNA1.charAt(i) != 'G' && DNA1.charAt(i) != 'C' && DNA1.charAt(i) != 'T') || (DNA2.charAt(i) != 'A' && DNA2.charAt(i) != 'G' && DNA2.charAt(i) != 'C' && DNA2.charAt(i) != 'T'))
		{
			w *= 0;
		}
		else
		{
			if (DNA1.charAt(i) == DNA2.charAt(i))
			{
				k++;
			}
		}
		w *= 1;
	}
	q = k * 1.0 / a1;
	if (w == 0)
	{
		System.out.print("error");
	}
	else
	{
		if (q > n)
		{
			System.out.print("yes");
		}
		 else
		 {
			 System.out.print("no");
		 }
	}
	}
	else
	{
		System.out.print("error");
	}
	return 0;
	}
}

