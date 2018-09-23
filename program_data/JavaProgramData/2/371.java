package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String book = "";
		final String name = "";
		int length;
		int n;
		int i;
		int j;
		int[] number = new int[30];
		int memory;
		int largest;
		int temp;
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
				book = tangible.StringFunctions.changeCharacter(book, i, tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				name = tangible.StringFunctions.changeCharacter(name, i, tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			length = String.valueOf(name.charAt(i)).length();
			for (j = 0;j < length;j++)
			{
				temp = name.charAt(i)[j] - 'A';
				number[temp] += 1;
			}
		}
		largest = 0;
		for (i = 0;i < 26;i++)
		{
			if (number[i] > largest)
			{
				largest = number[i];
				memory = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + memory,number[memory]);
		for (i = 0;i < n;i++)
		{
			length = String.valueOf(name.charAt(i)).length();
			for (j = 0;j < length;j++)
			{
				if (name.charAt(i)[j] == 'A' + memory)
				{
					System.out.printf("%s\n",book.charAt(i));
				}
			}
		}
		return 0;
	}
}

