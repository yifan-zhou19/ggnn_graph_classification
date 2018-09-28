package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num = 0;
		int a1;
		int b1;
		int t = 1;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		a1 = a.length();
		b1 = b.length();
		if (a1 != b1)
		{
		System.out.print("error");

		t = 0;
		}
		else
		{
		  for (i = 0;i < a1;i++)
		  {
			  if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			  {
			  System.out.print("error");
			  t = 0;
			  break;
			  }
			  if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			  {
			  System.out.print("error");
			  t = 0;
			  break;

			  }
		  }

		}

		if (t == 1)
		{
			for (i = 0;i < a1;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
				num++;
				}
			}
			if (1.0 * num / a1 > n)
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

