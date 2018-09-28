package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 0;
		int n;
		int i;
		int count = 0;
		int m;
		int j;
		int[] num = new int[200];
		int left;
		int flag = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		if (a.length() == b.length())
		{
			n = a.length();
		}
		else
		{
			flag = 1;
			System.out.print("error");
		}
		if (flag == 0)
		{
		for (i = 0;i < n;i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
			{
				flag = 1;
				System.out.print("error");
				break;
			}
			else
			{
				if (a.charAt(i) == b.charAt(i))
				{
					count++;
				}
			}
		}
		}
		if (flag == 0)
		{
			if ((double)count / n > s)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}

}

