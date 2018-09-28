package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int secmax;
		int[] a = new int[300];
		int i;
		int j;
		String character = new String(new char[300]);
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				character = tangible.StringFunctions.changeCharacter(character, i, tempVar2);
			}
			if (character.charAt(i) != ',')
			{
				break;
			}
		}
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{
			if (a[0] >= a[1])
			{
				max = a[0];
				secmax = a[1];
			}
			else
			{
				max = a[1];
				secmax = a[0];
			}
			if (i >= 2)
			{
				for (j = 2;j <= i;j++)
				{
					if (a[j] > max)
					{
						secmax = max;
						max = a[j];
					}
					else
					{
						if (a[j] > secmax && a[j] < max)
						{
							secmax = a[j];
						}
						if (a[j] < secmax && secmax == max)
						{
							secmax = a[j];
						}
					}
				}
			}
			if (max == secmax)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d\n",secmax);
			}
		}
	}
}

