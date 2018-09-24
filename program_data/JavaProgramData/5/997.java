package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double p;
		p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.length() != b.length())
		{
		   System.out.print("error");
		}
		else
		{
		 int len;
		 int i;
		 int sum = 0;
		 int w = 0;
		 len = a.length();
		 for (i = 0;i < len;i++)
		 {
		   if ((a.charAt(i) != 'A' && a.charAt(i) != 'C' && a.charAt(i) != 'G' && a.charAt(i) != 'T') || (b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'G' && b.charAt(i) != 'T'))
		   {
			  w += 1;
		   }
		 }
		 for (i = 0;i < len;i++)
		 {
		   if (a.charAt(i) == b.charAt(i))
		   {
			 sum += 1;
		   }
		 }
		 if (w == 0 && (1.0 * sum / len) > p)
		 {
		   System.out.print("yes");
		 }
		 else if (w == 0 && (1.0 * sum / len) <= p)
		 {
		   System.out.print("no");
		 }
		 else
		 {
		   System.out.print("error");
		 }
		}
		return (0);
	}
}

