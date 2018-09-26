package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		int n;
		int i;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			k = 0;
			a = new Scanner(System.in).nextLine();
			if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) == '_'))
			{
				for (i = 1;i <= 79;i++)
				{
					if (a.charAt(i) == 0)
					{
						break;
					}
					if (!((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9') || (a.charAt(i) == '_')))
					{
						 System.out.print("0\n");
						 k += 1;
						 break;
					}
				}
				if (k == 0)
				{
					System.out.print("1\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
			n--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, 20);

		}
		return 0;
	}
}

