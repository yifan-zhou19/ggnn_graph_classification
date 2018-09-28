package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int k;
		int[] a = new int[300];
		int i;
		int j = 0;
		String b = new String(new char[300]);
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			j++;
			if (b.charAt(i) == '\n')
			{
				break;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (k = i + 1;k < j;k++)
			{
				if (a[k] > a[i])
				{
					t = a[k];
					a[k] = a[i];
					a[i] = t;
				}
			}
		}
		if (a[0] == a[j - 1])
		{
		System.out.print("No");
		}
		else
		{
			for (i = 0;i < j;i++)
			{
				if (a[i] != a[0])
				{
					System.out.printf("%d",a[i]);
					break;
				}
			}
		}
	}
}

