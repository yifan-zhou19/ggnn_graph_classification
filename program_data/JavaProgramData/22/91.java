package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		final String b = "";
		int i = 0;
		int j = 0;
		int m;
		int n;
		b = tangible.StringFunctions.changeCharacter(b, 0, ',');
		while (b.charAt(i) == ',')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i + 1, tempVar2);
			}
			i++;
		}
		m = i; //m numbers
		for (i = 0;i < m - 1;i++)
		{
			for (j = i;j < m;j++)
			{
				if (a[j] > a[i])
				{
					n = a[i];
					a[i] = a[j];
					a[j] = n;
				}
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			if (a[i] < a[0])
			{
				System.out.printf("%d",a[i]);
				break;
			}
			else if (i == m - 1)
			{
				System.out.print("No");
			}
		}
	}


}

