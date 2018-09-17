package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int yn;
		int mn;
		int dn;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yn = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			mn = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			dn = Integer.parseInt(tempVar3);
		}
		if (yn % 4 == 0 && yn % 100 != 0 || yn % 400 == 0)
		{
			int[] day_of_month = {0, 31, 29, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};
			int i = 1;
			while (i < mn)
			{
				result = result + day_of_month[i];
				i++;
			}
			result = result + dn;
		}
		else
		{
			int[] day_of_month = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};
			int i = 1;
			while (i < mn)
			{
				result = result + day_of_month[i];
				i++;
			}
			result = result + dn;
		}
		System.out.printf("%d", result);
		return 0;
	}



}

