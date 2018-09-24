package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		int i;
		int j;
		int k;
		int BL;
		String a = new String(new char[85]);
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			BL = 1;
			//if '_'begin
			if (a.charAt(0) == '_')
			{
				for (j = 1;j < a.length();j++)
				{
					if (a.charAt(j) != '-')
					{
						break;
					}
				}
				for (k = j;k < a.length();k++)
				{
					if ((a.charAt(k) >= 'a' && a.charAt(k) <= 'z') || (a.charAt(k) >= 'A' && a.charAt(k) <= 'Z') || (a.charAt(k) == '_') || (a.charAt(k) >= '0' && a.charAt(k) <= '9'))
					{
						BL = 1;
					}
					else
					{
						BL = 0;
						break;
					}
				}
			}
			else if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
			{
				for (k = 0;k < a.length();k++)
				{
					if ((a.charAt(k) >= 'a' && a.charAt(k) <= 'z') || (a.charAt(k) >= 'A' && a.charAt(k) <= 'Z') || (a.charAt(k) == '_') || (a.charAt(k) >= '0' && a.charAt(k) <= '9'))
					{
						BL = 1;
					}
					else
					{
						BL = 0;
						break;
					}
				}
			}
			else
			{
				BL = 0;
			}
			System.out.printf("%d\n",BL);
		}
	}
}

