package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int largest = -1;
		int second = -1;
		int[] a = new int[300];
		int i;
		int counter;
		String b = new String(new char[100]);
		for (i = 0;i <= 299;i++)
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
			if (b.charAt(i) != ',')
			{
				counter = i + 1;
				break;
			}
		}
		for (i = 0;i <= counter - 1;i++)
		{
			if (a[i] > largest)
			{
				second = largest;
				largest = a[i];
			}
			else if (a[i] == largest)
			{
				;
			}
			else if (a[i] > second)
			{
				second = a[i];
			}
		}
		if (second == largest || second == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",second);
		}
		return 0;
	}

}

