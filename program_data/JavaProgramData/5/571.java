package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int i;
		int j;
		int k;
		int kong = 1;
		float n;
		float t = 0F;
		float l1;
		float l2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
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
		}
		else
		{
		  for (i = 0;i < l1;i++)
		  {
			  j = a.charAt(i);
			  k = b.charAt(i);
			if ((j != 'A' && j != 'T' && j != 'G' && j != 'C') || (k != 'A' && k != 'T' && k != 'G' && k != 'C'))
			{
				System.out.print("error");
				kong = 0;
				break;
			}
		  }
		  if (kong == 1)
		  {
			  for (i = 0;i < l1;i++)
			  {

				 if (a.charAt(i) == b.charAt(i))
				 {
					t = t + 1;
				 }
			  }

			if (t / l1 > n)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		  }
		}
	return 0;
	}

}

