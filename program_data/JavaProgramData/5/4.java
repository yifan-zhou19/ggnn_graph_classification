package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 final String sz1 = "";
		 final String sz2 = "";
		double a;
		double j;
		int i;
		int k;
		int judge = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sz1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sz2 = tempVar3.charAt(0);
		}
		if (sz1.length() != sz2.length())
		{
			System.out.print("error");
		}
		else
		{
			for (k = 0,i = 0;i < sz1.length();i++)
			{
				if ((sz1.charAt(i) != 'A' && sz1.charAt(i) != 'T' && sz1.charAt(i) != 'G' && sz1.charAt(i) != 'C') || (sz2.charAt(i) != 'A' && sz2.charAt(i) != 'T' && sz2.charAt(i) != 'G' && sz2.charAt(i) != 'C'))
				{
					judge = 0;
					break;
				}
				else if (sz1.charAt(i) == sz2.charAt(i))
				{
					k = k + 1;
				}
			}

			j = 1.0 * k / (sz1.length());
			if (judge == 0)
			{
				System.out.print("error");
			}
			else if (j > a)
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

