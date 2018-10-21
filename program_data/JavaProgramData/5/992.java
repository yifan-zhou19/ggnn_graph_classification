package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[1000]);
		String y = new String(new char[1000]);
		int i;
		int lengthx;
		int lengthy;
		int same = 0;
		float rate;
		float a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = tempVar3.charAt(0);
		}
		lengthx = x.length();
		lengthy = y.length();
		if (lengthx != lengthy)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < lengthx;i++)
			{
				if ((x.charAt(i) != 'A' && x.charAt(i) != 'G' && x.charAt(i) != 'C' && x.charAt(i) != 'T') || (y.charAt(i) != 'A' && y.charAt(i) != 'G' && y.charAt(i) != 'C' && y.charAt(i) != 'T'))
				{
					break;
				}
			}
			if (i < lengthx - 1)
			{
				System.out.print("error\n");
			}
			else
			{
			   for (i = 0;i < lengthx;i++)
			   {
				   if (x.charAt(i) == y.charAt(i))
				   {
					   same++;
				   }
			   }
			   a = (float)same / (float)lengthx;
			   if (a > rate)
			   {
				   System.out.print("yes\n");
			   }
			   else
			   {
				   System.out.print("no\n");
			   }
			}
		}
		return 0;
	}
}

