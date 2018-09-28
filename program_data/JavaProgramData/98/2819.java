package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int[] b = new int[10000];
		String word = new String(new char[80]);
		int rank = 0;
		int temp;
		while (n-- != 0)
		{
			if (rank == 0)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					word = tempVar.charAt(0);
				}
				rank = word.length();
				System.out.print(word);
				continue;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			temp = word.length();
			if (rank + temp + 1 <= 80)
			{
				System.out.print(' ');
				System.out.print(word);
				rank += temp + 1;
			}
			else
			{
				System.out.print("\n");
				System.out.print(word);
				rank = temp;
			}
		}


		return 0;
	}
}

