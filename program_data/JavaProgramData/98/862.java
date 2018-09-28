package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n;
		int i;
		int j = 0;
		String word = new String(new char[40]);
		String first = new String(new char[40]);
		int[] sum = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				first = tempVar.charAt(0);
			}
			i++; //??????
			sum[j] = sum[j] + first.length() + 1; //??????
			System.out.print(first);
			for (;sum[j] <= 81;) //????
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					word = tempVar2.charAt(0);
				}
				i++; //??????
				sum[j] = sum[j] + word.length() + 1;
				if (sum[j] <= 81)
				{
				System.out.print(" ");
				System.out.print(word);
				}
				else
				{
					j++; //????
				System.out.print("\n");
				System.out.print(word);
				sum[j] = sum[j] + word.length() + 1;
				}
				if (i - 1 == n)
				{
					break; //????
				}
			}
			if (i - 1 == n)
			{
				break; //????
			}

		}
		return 0; //????
	}


}

