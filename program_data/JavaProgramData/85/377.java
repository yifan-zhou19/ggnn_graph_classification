package <missing>;

public class GlobalMembers
{
	//?????
	public static char Main()
	{
		int i;
		int n;
		int j;
		int[] f = new int[1000];
		int[] l = new int[1000];
		String a = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			f[j] = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l[j] = a.length();
			if (a.charAt(0) < 65 || (a.charAt(0)>90 && a.charAt(0) < 95) || (a.charAt(0)>95 && a.charAt(0) < 97) || a.charAt(0)>122)
			{
				f[j] = 0;
			}
			else
			{
				for (i = 1;i < l[j];i++)
				{
					if (a.charAt(i) == '_' || (a.charAt(i) >= 48 && a.charAt(i) <= 57) || (a.charAt(i) >= 65 && a.charAt(i) <= 90) || (a.charAt(i) >= 97 && a.charAt(i) <= 122))
					{
						f[j] = 1;

					}
					else
					{
						f[j] = 0;
						break;
					}
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			if (f[j] == 1)
			{
				System.out.print("\nyes");
			}
			else if (f[j] == 0)
			{
				System.out.print("\nno");
			}
		}
		return 0;
	}
}

