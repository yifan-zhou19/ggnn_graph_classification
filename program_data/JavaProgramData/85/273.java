package <missing>;

public class GlobalMembers
{
	public static int judge(String c)
	{
		int j = 1;
		int k = 1;
		if ((c[0].compareTo('Z') <= 0 && c[0].compareTo('A') >= 0) || (c[0].compareTo('z') <= 0 && c[0].compareTo('a') >= 0) || c[0].equals('_'))
		{
			while (!c[k].equals('\0'))
			{
				if ((c[k].compareTo('Z') <= 0 && c[k].compareTo('A') >= 0) || (c[k].compareTo('z') <= 0 && c[k].compareTo('a') >= 0) || c[k].equals('_') || (c[k].compareTo('9') <= 0 && c[k].compareTo('0') >= 0))
				{
				k++;
				}
				else
				{
					j = 0;
					break;
				}
			}
		}
		else
		{
			j = 0;
		}
		return (j);
	}
	public static void Main()
	{
		int i;
		int n;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (judge(c) == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

