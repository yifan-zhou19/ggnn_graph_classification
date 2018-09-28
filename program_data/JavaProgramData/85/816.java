package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int k;
		int flag;
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			a = new Scanner(System.in).nextLine();
			flag = 1;
			if ((a.charAt(0) == '_') || ((a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z')) || ((a.charAt(0) >= 'a') && (a.charAt(0) <= 'z')))
			{
					for (k = 1;k < a.length();k++)
					{
						if ((a.charAt(k) < '0') || ((a.charAt(k)>'9') && (a.charAt(k) < 'A')) || ((a.charAt(k)>'Z') && (a.charAt(k) < '_')) || ((a.charAt(k)>'_') && (a.charAt(k) < 'a')) || (a.charAt(k)>'z'))
						{
							flag = 0;
							break;
						}
					}
			}
			else
			{
				flag = 0;
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
			if (flag == 1)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

