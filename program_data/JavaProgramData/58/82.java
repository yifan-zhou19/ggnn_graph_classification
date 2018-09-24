package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int l;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		String a = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			flag = 1;
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if (!(a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')))
			{
				flag = 0;
			}
			else
			{
				for (j = 1;j < l;j++)
				{
					if (!(a.charAt(j) == '_' || (a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9')))
					{
						flag = 0;
						break;
					}
					else
					{
						flag = 1;
					}
				}
			}
			if (flag == 0)
			{
				System.out.print("0\n");
			}
			else
			{
				System.out.print("1\n");
			}
		}
	}












}

