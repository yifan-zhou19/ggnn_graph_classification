package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int wl;
		int len = 0;
		String w = new String(new char[64]);
		final String p = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			 System.out.print(p);
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 w = tempVar2.charAt(0);
			 }
			 wl = w.length();
			 if (len + wl > 80)
			 {
				 System.out.print("\n");
				 len = 0;
			 }
			 else if (i > 0)
			 {
				  System.out.print(" ");
			 }
			 len += wl + 1;
			 p = w;
		}
			 System.out.print(p);
			 System.in.read();
			 System.in.read();
			 System.in.read();
			 return 0;
	}

}

