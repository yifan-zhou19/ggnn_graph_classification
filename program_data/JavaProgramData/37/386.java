package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int k;
			int i = 0;
			int n = 0;
			int[] count = new int[26];
			int[] pos = new int[26];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String array = new String(new char[100001]);
			for (i = 0 ; i < n ; i++)
			{
				for (k = 0;k < 26;k++)
				{
					pos[k] = 101;
					count[k] = 0;
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					array = tempVar2.charAt(0);
				}
				int j = 0;
				int flag = -1;
				for (;j < array.length();j++)
				{
					if (count[array.charAt(j) - 'a'] == 0)
					{
						pos[array.charAt(j) - 'a'] = j;
					}
					count[array.charAt(j) - 'a']++;
				}
				int min_pos = 100;
				int tpos = -1;
				for (j = 0;j < 26;j++)
				{
					if (count[j] == 1)
					{
						if (min_pos > pos[j])
						{
							min_pos = pos[j];
							tpos = j;
						}
					}
				}
				if (min_pos == 100)
				{
					System.out.print("no\n");
				}
				else
				{
					System.out.printf("%c\n",tpos + 'a');
				}
			}

			return 0;
	}
}

