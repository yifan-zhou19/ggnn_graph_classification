package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int i;
		int j;
		int n;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if ((((a.charAt(0) > 64) && (a.charAt(0) < 91)) || ((a.charAt(0)>96) && (a.charAt(0) < 123)) || (a.charAt(0) == 95)) == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				flag = 0;
				for (j = 1;j < a.length();j++)
				{
					if ((((a.charAt(j) > 47) && (a.charAt(j) < 58)) || ((a.charAt(j)>64) && (a.charAt(j) < 91)) || ((a.charAt(j)>96) && (a.charAt(j) < 123)) || (a.charAt(j) == 95)) == 0)
					{
						System.out.print("no\n");
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					System.out.print("yes\n");
				}
			}
		}
	}




}

