package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int flag = 0;
		final String word = "";
		int[] lenth = new int[1000];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < k;i++)
		{
			cin.getline(word.charAt(i),40,' ');
			lenth[i] = String.valueOf(word.charAt(i)).length();
		}
		System.out.print(word);
		flag = lenth;
		for (i = 1;i < k;i++)
		{
			flag = flag + 1 + lenth[i];
			if (flag > 80)
			{
				System.out.print("\n");
				System.out.print((word.Substring(i)));
				flag = (lenth + i);
			}
			else
			{
				System.out.print(" ");
				System.out.print((word.Substring(i)));
			}
		}
		return 0;
	}
}

