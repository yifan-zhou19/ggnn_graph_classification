package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l1;
		int l2;
		int count = 0;
		int o = 1;
		double r;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
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
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("error");
			o = 0;
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
				{
					System.out.print("error");
					o = 0;
					break;
				}
				 else
				 {
						if (a.charAt(i) == b.charAt(i))
						{
							count++;
						}
				 }
			}
			if (1.0 * count / l1 > r && o == 1)
			{
				System.out.print("yes");
			}
			else if (o == 1)
			{
				System.out.print("no");
			}
		}


		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

