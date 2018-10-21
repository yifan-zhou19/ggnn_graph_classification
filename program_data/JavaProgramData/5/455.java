package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int b;
		int s = 0;
		int j;
		int a;
		double r;
		double R;
		String gene = new String(new char[500]);
		String gene2 = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			gene = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			gene2 = tempVar3.charAt(0);
		}
		b = gene2.length();
		a = gene.length();
		if (a != b)
		{
				System.out.print("error");
				return 0;
		}
		for (i = 0;i < a;i++)
		{
			if (gene.charAt(i) != 'A' && gene.charAt(i) != 'T' && gene.charAt(i) != 'C' && gene.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
			if (gene2.charAt(i) != 'A' && gene2.charAt(i) != 'T' && gene2.charAt(i) != 'C' && gene2.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 1;i <= b;i++)
		{
			if (gene.charAt(i) == gene2.charAt(i))
			{
				s++;
			}
		}
		R = 1.000 * s / b;
		if (R > r)
		{
			System.out.print("yes");
		}
		else if (R <= r)
		{
			System.out.print("no");
		}

		return 0;
	}

}

