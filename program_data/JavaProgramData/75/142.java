package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[4000]);
		char comma;
		int[] enter = new int[1000];
		int[] leave = new int[1000];
		input = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = input.length();
		int i;
		int j;
		int k;
		int u = 0;
		int min = 1000;
		int max = 0;

		for (i = 0; i < len; i++)
		{
			if (input.charAt(i) != ',')
			{
				String temp = new String(new char[2000]);
				k = 0;
				for (j = i; input.charAt(j) >= '0' && input.charAt(j) <= '9'; j++, k++)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k, input.charAt(j));
				}
				temp = tangible.StringFunctions.changeCharacter(temp, k, '\0');
				enter[u] = Integer.parseInt(temp);
				if (enter[u] < min)
				{
					min = enter[u];
				}
				i = j;
				u++;
			}
		}

		len = u;
		for (i = 0; i < len - 1; i++)
		{
			leave[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			comma = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (leave[i] > max)
			{
				max = leave[i];
			}
		}
		leave[len - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (leave[len - 1] > max)
		{
			max = leave[len - 1];
		}

		int[] num = new int[1000];
		for (i = min; i < max; i++)
		{
			for (j = 0; j < len; j++)
			{
				if (i >= enter[j] != 0 && i < leave[j])
				{
					num[i]++;
				}
			}
		}

		int maxans = num[min];
		for (i = min; i < max; i++)
		{
			if (num[i] > maxans)
			{
				maxans = num[i];
			}
		}
		System.out.print(len);
		System.out.print(" ");
		System.out.print(maxans);
		System.out.print("\n");
		return 0;
	}

}

