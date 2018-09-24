package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int sum = 0;
		int flag = 0;
		double m;
		String zifu1 = new String(new char[501]);
		String zifu2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		scanf("\n");
		zifu1 = new Scanner(System.in).nextLine();
		zifu2 = new Scanner(System.in).nextLine();
		if (zifu1.length() == zifu2.length())
		{
			for (i = 0;i < 600;i++)
			{
				if (zifu1.charAt(i) == '\0')
				{
					break;
				}
				else if ((zifu1.charAt(i) == 'A' || zifu1.charAt(i) == 'T' || zifu1.charAt(i) == 'C' || zifu1.charAt(i) == 'G') && (zifu2.charAt(i) == 'A' || zifu2.charAt(i) == 'T' || zifu2.charAt(i) == 'C' || zifu2.charAt(i) == 'G'))
				{
					if (zifu1.charAt(i) == zifu2.charAt(i))
					{
						sum++;
					}
				}
				else
				{
					System.out.print("error");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				if (1.0 * sum / zifu1.length() > m)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

