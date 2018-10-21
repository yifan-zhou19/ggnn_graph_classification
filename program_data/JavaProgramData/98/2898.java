package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[300][40];
		int i;
		int n;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n - 1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word[n - 1] = tempVar2.charAt(0);
		}
		sum = 0;
		i = 0;
		do
		{
			System.out.print(word[i]);
			sum += String.valueOf(word[i]).length();
			i++;
			while (sum + String.valueOf(word[i]).length() + 1 <= 80)
			{
				System.out.print(' ');
				System.out.print(word[i]);
				sum += String.valueOf(word[i]).length() + 1;
				i++;
				if (i == n)
				{
					break;
				}
			}
			System.out.print("\n");
			sum = 0;
		}while (i < n);
		return 0;
	}
}

