package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int flag = 0;
		int j;
		String b = new String(new char[80]);
		String a = new String(new char[80]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{

			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) == '_' || (a.charAt(0) <= 'z' && a.charAt(0) >= 'a') || (a.charAt(0) <= 'Z' && a.charAt(0) >= 'A'))
			{
			}
				else
				{
					flag++;
				}
				if (a.length() > 1)
				{
			for (j = 1;j < a.length();j++)
			{
				if (a.charAt(j) == '_' || (a.charAt(j) <= '9' && a.charAt(j) >= '0') || (a.charAt(j) <= 'z' && a.charAt(j) >= 'a') || (a.charAt(j) <= 'Z' && a.charAt(j) >= 'A'))
				{
				}
				else
				{
					flag++;
				}

			}
				}
			if (flag == 0)
			{
				System.out.print("1\n");
			}
				else
				{
				System.out.print("0\n");
				}
				flag = 0;
		}
	}

}

