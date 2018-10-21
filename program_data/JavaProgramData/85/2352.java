package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zfc = new String(new char[MAX + 1]);
		System.in.read();
		for (i = 0;i < n;i++)
		{
		zfc = new Scanner(System.in).nextLine();
			for (k = 0;zfc.charAt(k);k++)
			{
			if (!((zfc.charAt(k) == '_') || (zfc.charAt(k) >= 'A' && zfc.charAt(k) <= 'Z') || (zfc.charAt(k) >= '0' && zfc.charAt(k) <= '9' && k>0) || (zfc.charAt(k) <= 'z' && zfc.charAt(k) >= 'a')))
			{
			break;
			}
			}
			 if (zfc.charAt(k) || zfc.charAt(k) >= '0' && zfc.charAt(0) <= '9')
			 {
			 System.out.print("no\n");
			 }
			 else
			 {
			 System.out.print("yes\n");
			 }
		}
		 return 0;
	}

}

