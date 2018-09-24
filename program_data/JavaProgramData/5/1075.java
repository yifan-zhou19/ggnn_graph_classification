package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int len;
		int e = 0;
		int sum = 0;
		int len2;
		double bi;
		double h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bi = Double.parseDouble(tempVar);
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
		len = a.length();
		len2 = b.length();
		for (i = 0;i < len;i++)
		{

			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G' && b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G') || len != len2)
			{
				System.out.print("error");
				e = 1;
				break;
			}
		}
		  if (e == 0)
		  {

		for (i = 0;i < len;i++)
		{
		   if (a.charAt(i) == b.charAt(i))
		   {
			 sum++;
		   }
		}

			 h = sum * 1.0 / len;
			  if (h >= bi)
			  {
		 System.out.print("yes");
			  }
		   else if (h < bi)
		   {
		System.out.print("no");
		   }
		  }

		return 0;
	}

}

