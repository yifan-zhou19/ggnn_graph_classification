package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String zfc1 = new String(new char[100]);
		 String zfc2 = new String(new char[100]);
		 int i;
		 int l1;
		 int l2;
		 int x = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 zfc1 = tempVar.charAt(0);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 zfc2 = tempVar2.charAt(0);
		 }
		 l1 = zfc1.length();
		 l2 = zfc2.length();
		 if (l1 != l2)
		 {
				System.out.print("NO");
		 }
		else
		{
			for (i = 0;i < l1;i++)
			{
				x = x + (int)zfc1.charAt(i) - (int)zfc2.charAt(i);
			}
			if (x == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}

		return 0;
	}
}

