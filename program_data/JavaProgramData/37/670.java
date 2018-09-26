package <missing>;

public class GlobalMembers
{
	//***********************************
	//**???????                 **
	//**?????? 1100012914        **
	//**???2011? 11?3?           **
	//***********************************
	public static int Main()
	{
		int t;
		int i;
		int[] num = new int[26];
		int j;
		int len;
		int x;
		int flag = 0;
		int[] rank = new int[26];
		int r = 0;
		int min = 26;
		int z;
		String a = new String(new char[100000]);
		char ch;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = a.length();
			for (j = 0;j <= len;j++)
			{
				x = a.charAt(j) - 'a';
				num[x]++;
				if (num[x] == 1)
				{
					rank[x] = r++;
				}
			}
			for (j = 0;j <= 26;j++)
			{
				if (num[j] == 1)
				{
					if (rank[j] < min)
					{
						min = rank[j];
						z = j;
						flag = 1;
					}
				}
			}
				if (flag == 0)
				{
					System.out.print("no");
					System.out.print("\n");
				}
				else
				{
					ch = (char)z;
					ch = ch + 'a';
					System.out.print(ch);
					System.out.print("\n");
				}
				j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(a,' ',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
							   memset(num,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
							   memset(rank,0,(Integer.SIZE / Byte.SIZE));
							   flag = 0;
							   min = 26;
							   r = 0;
		}
		return 0;
	}

}

