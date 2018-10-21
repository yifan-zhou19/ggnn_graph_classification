package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String A = new String(new char[100]);
		String B = new String(new char[100]);
		int[] x = new int[100];
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			B = tempVar2.charAt(0);
		}
		if (A.length() == B.length())
		{
		for (i = 0;i <= A.length();i++)
		{
			for (j = 0;j <= B.length();j++)
			{
				if (A.charAt(i) == B.charAt(j) && x[j] == 0)
				{
					x[j] = 1;
					break;
				}
			}
		}
		for (i = 0;i <= B.length();i++)
		{
			if (x[i] == 0)
			{
				flag = 1;
			}
		}
		if (flag == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}

}

