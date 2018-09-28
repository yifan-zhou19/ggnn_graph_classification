package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[100000]);
		int t;
		int i;
		int j;
		int k;
		int num;
		char result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			int[] count = new int[26];
			int[] line = new int[26];
			k = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				String = tempVar2;
			}
			num = String.length();
			for (j = 0;j < num;j++)
			{
				count[string.charAt(j) - 97]++;
				if (line[string.charAt(j) - 97] == 0)
				{
				  line[string.charAt(j) - 97] = k;
				  k++;
				}
			}
		j = 0;
		for (k = 0;k < 26;k++)
		{
			if (count[k] == 1)
			{
				if (line[k] < num)
				{
					result = k + 97;
					num = line[k];
				}
				j++;
			}
		}
		if (j == 0)
		{
				System.out.print("no");
		}
				else
				{
					System.out.printf("%c\n",result);
				}
		}
		System.in.read();
		System.in.read();
	}

}

