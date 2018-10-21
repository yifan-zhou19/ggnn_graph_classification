package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int m = 0;
		int[] a = new int[300];
		int i = 0;
		String b = new String(new char[300]);
		do
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
			i++;
		}while (b.charAt(i - 1) == ',');

		for (i = 0;i < 300;i++)
		{
			if (a[i] > m)
			{
				m = a[i];
			}
		}

		for (i = 0;i < 300;i++)
		{
			if (a[i] < m && a[i]> n)
			{
				n = a[i];
			}
		}
		if (n != 0)
		{
			System.out.printf("%d",n);
		}
		else
		{
			System.out.print("No");
		}
	}




}

