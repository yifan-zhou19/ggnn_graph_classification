package <missing>;

public class GlobalMembers
{
	public static void Main()
	{


		String str = new String(new char[1000]);
		char c;
		String string = new String(new char[26]);
		int i;
		int j;
		int k;
		int[] a = new int[26];
		str = new Scanner(System.in).nextLine();
		j = 0;
		for (c = 'a';c <= 'z';c++)
		{
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) == c)
				{
					String[j] = c;
					a[j] = 0;
					for (k = i;str.charAt(k) != '\0';k++)
					{
						if (str.charAt(k) == c)
						{
							a[j] = a[j] + 1;
						}
					}
						j = j + 1;
						break;
				}
			}
		}
			if (j == 0)
			{
				System.out.print("No");
			}
			else
			{
			String[j] = '\0';
			for (i = 0;i < j;i++)
			{
				System.out.printf("%c=%d\n",string.charAt(i),a[i]);
			}
			}
	}




}
