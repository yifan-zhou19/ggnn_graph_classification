package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[22]);
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			int len = zfc.length();
		for (int i = 0;i < len;i++)
		{
			if (i == 0 && (zfc.charAt(i) >= '0' && zfc.charAt(i) <= '9'))
			{
				a[j] = 0;
				break;
			}
			if (zfc.charAt(i) >= 'A' && zfc.charAt(i) <= 'Z' || zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z' || zfc.charAt(i) == '_' || zfc.charAt(i) >= '0' && zfc.charAt(i) <= '9')
			{
			}
			else
			{
				a[j] = 0;
				break;
			}
			if (i == len - 1)
			{
				a[j] = 1;
			}
		}
		}
		for (int i = 0;i < n;i++)
		{
			if (a[i] == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

