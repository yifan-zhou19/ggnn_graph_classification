package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int tmp;
		int[] m = new int[100];
		String a = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			tmp = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if (a.charAt(0) == '_' || (a.charAt(0) >= 65 && a.charAt(0) <= 90) || (a.charAt(0) >= 97 && a.charAt(0) <= 122))
			{
				tmp = 0;
				for (j = 1; j < a.length(); j++)
				{
					if (!(a.charAt(j) == '_' || (a.charAt(j) >= 65 && a.charAt(j) <= 90) || (a.charAt(j) >= 97 && a.charAt(j) <= 122) || (a.charAt(j) >= 48 && a.charAt(j) <= 57)))
					{
						m[i] = 0;
						tmp = 1;
						break;
					}
				}
				if (tmp == 0)
				{
					m[i] = 1;
				}
			}
			else
			{
				m[i] = 0;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (m[i] == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
	}
}

