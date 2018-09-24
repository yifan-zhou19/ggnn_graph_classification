package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float f;
		int x;
		int y;
		int b = 0;
		int c = 0;
		String d1 = new String(new char[501]);
		String d2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d2 = tempVar3.charAt(0);
		}
		x = d1.length();
		y = d2.length();
		if (x != y)
		{
		System.out.print("error");
		}
		else
		{
			for (int i = 0;i <= x - 1;i++)
			{
			 if ((d1.charAt(i) == 'A' || d1.charAt(i) == 'T' || d1.charAt(i) == 'C' || d1.charAt(i) == 'G') && (d2.charAt(i) == 'A' || d2.charAt(i) == 'T' || d2.charAt(i) == 'C' || d2.charAt(i) == 'G'))
			 {
				   if (d1.charAt(i) == d2.charAt(i))
				   {
			   b++;
				   }
			 }
			else
			{
				c = 1;
				break;
			}
			}
		f = (float)b / (float)x;
		if (c == 0 && f > a)
		{
		System.out.print("yes");
		}
		else if (c == 0 && f <= a)
		{
		System.out.print("no");
		}
		else
		{
		System.out.print("error");
		}
		}
	}
}

