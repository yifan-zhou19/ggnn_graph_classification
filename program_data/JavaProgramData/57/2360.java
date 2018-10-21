package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int l;
		String w = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w = tempVar2.charAt(0);
			}
		 l = w.length();
		 if (w.charAt(l - 1) == 'y' && w.charAt(l - 2) == 'l')
		 {
			for (j = 0;j <= l - 3;j++)
			{
				System.out.printf("%c",w.charAt(j));
			}
		 }
		 else if (w.charAt(l - 1) == 'r' && w.charAt(l - 2) == 'e')
		 {
			for (j = 0;j <= l - 3;j++)
			{
			   System.out.printf("%c",w.charAt(j));
			}
		 }
		 else
		 {
			 for (j = 0;j <= l - 4;j++)
			 {
				System.out.printf("%c",w.charAt(j));
			 }
		 }
		 System.out.print("\n");
		}
	}
}

