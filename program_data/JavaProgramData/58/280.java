package <missing>;

public class GlobalMembers
{
	public static int panduan(char i,int k)
	{
			if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z') || (i >= '0' && i <= '9') || i == '_')
			{
			return k;
			}
			else
			{
			return 0;
			}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int k = 1;
		String a = new String(new char[100]);
		for (i = 0;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if (i == 0)
			{
			continue;
			}
			if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || a.charAt(0) == '_')
			{
				 for (int j = 0;a.charAt(j) != '\0';j++)
				 {
					 k = panduan(a.charAt(j), k);
				 }
				 if (k == 1)
				 {
				 System.out.print("1\n");
				 }
				 else
				 {
				 System.out.print("0\n");
				 }
				 k = 1;
			}
			else
			{
			System.out.print("0\n");
			}
		}
		return 0;
	}

}

