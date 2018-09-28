package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string1 = new String(new char[500]);
		char[][] array = new char[500][5];
		int n;
		int i;
		int j;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		string1 = ConsoleInput.readToWhiteSpace(true).charAt(0);

		int[] num = new int[500];

		for (i = 0;i <= string1.length() - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				array[i][j] = string1.charAt(i + j);
			}
			array[i][j] = '\0';
			//cout<<array[i]<<endl;
		}
		for (i = 0;i <= string1.length() - n;i++)
		{
			for (j = i + 1;j <= string1.length() - n;j++)
			{
			if (strcmp(array[i],array[j]) == 0)
			{
				num[i]++;
			}
			}
		}
		for (i = 0;i <= string1.length() - n;i++)
		{
			if (num[i] > t)
			{
				t = num[i];
			}
		}

		if (t == 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(t + 1);
			System.out.print("\n");
		for (i = 0;i <= string1.length() - n;i++)
		{
			if (num[i] == t)
			{
			System.out.print(array[i]);
			System.out.print("\n");
			}
		}
		}
		return 0;
	}
}

